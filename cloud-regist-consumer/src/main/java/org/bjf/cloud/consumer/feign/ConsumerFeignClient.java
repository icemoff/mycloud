package org.bjf.cloud.consumer.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by binjinfeng on 2017/4/26.
 */
@FeignClient(name = "provider-test")
public interface ConsumerFeignClient {

    @RequestMapping(value = "/provider/test", method = RequestMethod.GET)
    String test(@RequestParam(value = "name") String name);
}


