package com.company.controller;

import com.company.model.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class MessageController {
    @GetMapping({"/message1", "msg1", "mesaj1"})
    public String index() {
        Message message = new Message();
        message.setMessage("Hello Spring MVC! message 1");
        return message.getMessage();
    }

    @RequestMapping(value = "/message2", name = "msg2", method = RequestMethod.GET)
    public String index2() {
        Message message = new Message();
        message.setMessage("Hello Spring MVC! message 2");
        return message.getMessage();
    }

    @GetMapping(value = "/message3", params = {"id", "name"})
    public String index3() {
        Message message = new Message();
        message.setMessage("Hello Spring MVC! message 3");
        return message.getMessage();
    }
}
