package org.bjf.cloud.regist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by binjinfeng on 2017/1/19.
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

    public static void main(String[] args) throws Exception {

        SpringApplication.run(EurekaApplication.class, args);
        System.out.println("args = " + args);


    }
}
