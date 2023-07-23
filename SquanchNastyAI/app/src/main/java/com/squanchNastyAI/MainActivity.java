```java
package com.squanchNastyAI;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchChatMode(View view) {
        Intent intent = new Intent(this, ChatMode.class);
        startActivity(intent);
    }

    public void launchDeveloperMode(View view) {
        Intent intent = new Intent(this, DeveloperMode.class);
        startActivity(intent);
    }
}
```