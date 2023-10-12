package com.example.jogas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val Tombol2 = findViewById<ImageButton>(R.id.buttonLogin)
        Tombol2.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
    }

    fun openRegistrationPage(view: View) {
        val intent = Intent(this, MainActivity4::class.java)
        intent.action = "com.example.jogas.OPEN_REGISTRATION"
        startActivity(intent)
    }
}
