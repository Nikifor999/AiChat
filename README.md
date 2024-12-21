# Chat with AI - Spring Boot and Thymeleaf

This project demonstrates how to build a simple chat application using Spring Boot, Thymeleaf, and a Java-based AI service. The frontend is designed with Thymeleaf and styled with basic CSS, while the backend processes user queries through an AI service and returns responses.

## Features
- User-friendly chat interface.
- Interactive communication with an AI backend.
- Integrated Thymeleaf templates for dynamic web pages.
- RESTful API for handling chat queries.
- Lightweight and responsive design.

---

## Prerequisites
- Java 17 or later.
- Maven dependency management.
- A working knowledge of Spring Boot and Thymeleaf.
- Langchain4j

---

## Technologies Used
- **Backend**:
  - Spring Boot
  - Thymeleaf
  - Java-based AI Service (e.g., OpenAI integration via Langchain4j)

- **Frontend**:
  - HTML/CSS
  - JavaScript
  - Thymeleaf templates

---

## Project Setup

### 1. Clone the Repository
```bash
git clone <repository-url>
cd <repository-directory>
```

### 2. Install Dependencies
#### Maven:
```bash
mvn clean install
```

### 3. Run the Application
```bash
mvn spring-boot:run
```
The application will be available at `http://localhost:8080`.

---

## Usage

### Backend Endpoints
- **POST `/api/chat`**: Sends a user question to the backend and retrieves the AI's response.
  
  Example Request:
  ```json
  {
      "question": "What is Java?"
  }
  ```

  Example Response:
  ```json
  {
      "answer": "Java is a high-level, versatile programming language..."
  }
  ```

### Frontend
- Navigate to `http://localhost:8080/chat` to access the chat page.
- ![image](https://github.com/user-attachments/assets/333b7e22-7e34-4331-8bff-a0d0e405b827)

- Enter a question in the input box and press the "Send" button (or Enter key).
- The AI's response will appear in the chat window.

---

## File Structure
```plaintext
src/main/java/com/example/program/pdfhelper
├── controllers
│   └── ChatController.java       # Handles chat-related API requests
├── model
│   ├── ChatRequest.java          # Represents the user request payload
│   └── ChatResponse.java         # Represents the AI response payload
├── services
│   └── AiService.java            # Interface for AI interactions
│   └── AiServiceImpl.java        # Implements AI logic
├── config
│   └── AiConfig.java             # Configuration for AI integration

src/main/resources/templates
└── chat.html                     # Thymeleaf template for chat interface

src/main/resources/static
└── styles                        # Contains any additional CSS or JS files
```

---

## Customization
1. **AI Backend**:
   - Modify `AiConfig.java` to change the AI model or configuration.
   - Update the API key in `AiConfig` with your own key or use "demo" key.

2. **Frontend**:
   - Enhance `chat.html` for a more advanced UI.
   - Update styles or add JavaScript functionality as needed.

---

## Troubleshooting
- **Frontend does not display properly**:
  - Check Thymeleaf template paths and ensure CSS/JS files are loaded correctly.

- **AI response contains Markdown syntax (e.g., `**bold**`)**:
  - Render Markdown in the frontend using a library like `marked.js`.
  - Alternatively, strip Markdown formatting from backend responses.

