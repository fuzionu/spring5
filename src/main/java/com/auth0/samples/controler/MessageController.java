package com.auth0.samples.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")

public class MessageController
{
    @GetMapping
    public String sendMessage()
    {
        return "There goes Gieka and barks with his ass";
    }
}
