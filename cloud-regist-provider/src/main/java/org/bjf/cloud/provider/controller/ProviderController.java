package org.bjf.cloud.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by binjinfeng on 2017/4/26.
 */
@RestController
public class ProviderController {

    @GetMapping("provider/test")
    public Object test(String name) {
        System.out.println("aaaa p");
        return "test proviter: hello " + name;
    }

}
