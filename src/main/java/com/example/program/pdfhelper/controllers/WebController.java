package com.example.program.pdfhelper.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/chat")
    public String chatPage() {
        return "chat";
    }
}
