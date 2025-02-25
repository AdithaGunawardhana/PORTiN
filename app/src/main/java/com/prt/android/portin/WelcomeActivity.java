package com.prt.android.portin;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_welcome);

        // Set up window insets for edge-to-edge display
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Find the button by its ID
        Button getStartedButton = findViewById(R.id.getstarted_button);

        // Set an OnClickListener on the button
        getStartedButton.setOnClickListener(v -> {
            // Create an Intent to start the LoginActivity
            Intent intent = new Intent(WelcomeActivity.this, LoginActivity.class);
            startActivity(intent);

            // Optional: Finish the WelcomeActivity to remove it from the back stack
            // finish();
        });
    }
}