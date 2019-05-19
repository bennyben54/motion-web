package com.beo.motionweb.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class MotionRestController {

    @GetMapping
    public String test() {
        return "test";
    }
}
