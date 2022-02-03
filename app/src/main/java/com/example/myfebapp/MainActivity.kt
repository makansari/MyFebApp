package com.example.myfebapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonSubmit.setOnClickListener {
           /*var un = editTextUsername.text.toString()

            Toast.makeText(this, "username is $un", Toast.LENGTH_LONG).show()

            textViewUsername.setText(un)*/

            // Explicit Intent
            var i = Intent(this, ThirdActivity::class.java)
            startActivity(i)
        }

    }
}