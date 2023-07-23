```java
package com.squanchNastyAI;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ChatMode extends AppCompatActivity {

    private AIEngine aiEngine;
    private EditText userInput;
    private TextView aiOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat_mode);

        aiEngine = new AIEngine(new Personality(), new Memory());
        userInput = findViewById(R.id.user_input);
        aiOutput = findViewById(R.id.ai_output);
    }

    public void sendMessage(View view) {
        String message = userInput.getText().toString();
        String response = aiEngine.processInput(message);
        aiOutput.setText(response);
        userInput.setText("");
    }
}
```