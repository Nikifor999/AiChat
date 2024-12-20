package com.example.program.pdfhelper.services;

import com.example.program.pdfhelper.model.ChatRequest;
import com.example.program.pdfhelper.model.ChatResponse;

public interface AiService {

    ChatResponse getResponse(ChatRequest text);
}
