package com.byunlog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogControllerTest {

    @GetMapping("/test/hello")
    public String hello(){
        return "<H2>1111</H2>";
    }
}
