package org.bjf.cloud.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by binjinfeng on 2017/1/19.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProviderApplication {

    public static void main(String[] args) throws Exception {

        SpringApplication.run(ProviderApplication.class, args);
        System.out.println("args = " + args);


    }
}
