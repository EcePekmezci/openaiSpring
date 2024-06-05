package com.openaiSpring.openaiSpring.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChatMessage {
    private String role;
    private String content;

   /* public ChatMessage(String role, String content) {
        this.role=role;
        this.content=content;
    }*/
    ///vv
}
