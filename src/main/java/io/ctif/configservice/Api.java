package io.ctif.configservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api {
    @Value("${password}")
    String name;

    @GetMapping("/api")
    public String get(){
        return name;
    }

}
