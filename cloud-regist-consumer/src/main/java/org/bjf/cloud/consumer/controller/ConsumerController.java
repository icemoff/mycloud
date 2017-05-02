package org.bjf.cloud.consumer.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import javax.annotation.Resource;
import org.bjf.cloud.consumer.feign.ConsumerFeignClient;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by binjinfeng on 2017/4/26.
 */
@RestController
public class ConsumerController {

    @Resource
    private ConsumerFeignClient client;

    @Resource
    private RestTemplate restTemplate;

    @Resource
    private LoadBalancerClient loadBalancerClient;


    @HystrixCommand(fallbackMethod = "defaultMethod")
    @GetMapping("consumer/test")
    public String test() {
        String r = client.test("cloud ");
        // String r = restTemplate.getForObject("http://provider-test/provider/test?name=xxxx", String.class);
        return r;
    }

    public String defaultMethod() {
        return "default";
    }

    @GetMapping("consumer/used-instance")
    public void usedInstance() {
        ServiceInstance choose = loadBalancerClient.choose("provider-test");

        System.out.println(choose.getServiceId() + "," + choose.getHost() + "," + choose.getUri());
    }

}
