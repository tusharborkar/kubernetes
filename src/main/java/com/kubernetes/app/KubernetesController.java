package com.kubernetes.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KubernetesController {

    @GetMapping("/hello")
    public String getData(){
        return "This is my first devOps app";
    }
}
