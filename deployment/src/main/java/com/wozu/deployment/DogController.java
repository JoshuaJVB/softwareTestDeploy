package com.wozu.deployment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/breeds")
public class DogController {

    @GetMapping("/image/random")
    public String getDog(){
        return "{\"message\":\"https://images.dog.ceo/breeds/pointer-germanlonghair/hans2.jpg\",\"status\":\"success\"}";

    }
}
