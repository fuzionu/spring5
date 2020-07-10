package com.auth0.samples.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class TextController
{
    @GetMapping
    public String say()
    {
        return "Text example";
    }
}
