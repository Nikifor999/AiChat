package com.example.program.pdfhelper.services;

import com.example.program.pdfhelper.controllers.ChatController;
import com.example.program.pdfhelper.model.ChatRequest;
import com.example.program.pdfhelper.model.ChatResponse;
import dev.langchain4j.model.openai.OpenAiChatModel;
import dev.langchain4j.model.openai.OpenAiChatModelName;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class AiServiceImpl implements AiService{

    private final Assistant assistant;
    private static final Logger log = LoggerFactory.getLogger(ChatController.class);

    public AiServiceImpl(Assistant assistant) {
        this.assistant = assistant;
    }

    public ChatResponse getSimpleResponse(ChatRequest request) {
        OpenAiChatModel model = OpenAiChatModel.builder()
                .apiKey("demo")
                .modelName(OpenAiChatModelName.GPT_4_O_MINI)
                .build();
        return new ChatResponse(model.generate(request.question()));
    }

    @Override
    public ChatResponse getResponse(ChatRequest request) {
        log.info("getting response from service");
        return new ChatResponse(assistant.chat(request.userId(), request.question()));
    }
}
