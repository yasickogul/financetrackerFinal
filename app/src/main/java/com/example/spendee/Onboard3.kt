package com.example.spendee

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.cashora.R
import com.example.spendee.passcodeActivity

class Onboard3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboard3)

        // Handle system bars
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Reference to the "Get Started" button
        val goButton = findViewById<Button>(R.id.next)

        // Handle button click
        goButton.setOnClickListener {
            // Navigate to PasscodeActivity
            startActivity(Intent(this, passcodeActivity::class.java))
            finish() // optional: prevents user from returning to onboarding screen
        }
    }
}
