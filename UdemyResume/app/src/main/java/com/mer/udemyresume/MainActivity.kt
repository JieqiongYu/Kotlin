package com.mer.udemyresume

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var workHistory = findViewById<Button>(R.id.workHistoryButton)
        workHistory.setOnClickListener {
            println("Hey you hit the button!")

            var moveToWorkHistory = Intent(getApplicationContext(), WorkHistoryActivity::class.java)
            startActivity(moveToWorkHistory)
        }

        var callButton = findViewById<Button>(R.id.callButton)
        callButton.setOnClickListener {
            println("Call")

            var phoneUri = Uri.parse("tel:18009747218")
            var callIntent = Intent(Intent.ACTION_DIAL, phoneUri)
            startActivity(callIntent)
        }

        var emailButton = findViewById<Button>(R.id.emailButton)
        emailButton.setOnClickListener {
            println("Email")

            var emailIntent = Intent(Intent.ACTION_SEND)
            emailIntent.setType("plain/text")
            emailIntent.putExtra(Intent.EXTRA_EMAIL, "yjieqiong@gmail.com")
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Nice Resume :)")
            emailIntent.putExtra(Intent.EXTRA_TEXT, "I really enjoyed your resume...")
            startActivity(emailIntent)
        }
    }
}
