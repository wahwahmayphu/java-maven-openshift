package org.example.demoapplicationdeploytest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplicationDeployTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplicationDeployTestApplication.class, args);
    }

    @GetMapping("/")
    public String hello() {
        return "✅ Java Maven app is running on OpenShift!";
    }

    @GetMapping("/test")
    public String test() {
        return "✅ Testing Java Maven app is running on OpenShift!";
    }



}
