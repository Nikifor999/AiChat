package com.example.program.pdfhelper.controllers;

import com.example.program.pdfhelper.model.ChatRequest;
import com.example.program.pdfhelper.model.ChatResponse;
import com.example.program.pdfhelper.services.AiService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
@RequestMapping("/api/chat")
public class ChatController {
    private final AiService aiService;
    private static final Logger log = LoggerFactory.getLogger(ChatController.class);


    public ChatController(AiService aiService) {
        this.aiService = aiService;
    }

    @PostMapping
    public ChatResponse getAnswer(@RequestBody ChatRequest question) {
        log.info("getting answer");
        return aiService.getResponse(question);
    }
}
