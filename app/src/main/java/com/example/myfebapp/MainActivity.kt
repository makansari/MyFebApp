package com.example.myfebapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var a = 100
        Log.e("mytag","activity created and data is $a")

        buttonSubmit.setOnClickListener {
           /*var un = editTextUsername.text.toString()

            Toast.makeText(this, "username is $un", Toast.LENGTH_LONG).show()

            textViewUsername.setText(un)*/

            // Explicit Intent
            /*var i = Intent(this, ThirdActivity::class.java)
            startActivity(i)*/

            // Implicit Intent
//            var i = Intent(Intent.ACTION_DIAL, Uri.parse("tel:9888582252"))
//            startActivity(i)

            var i = Intent(Intent.ACTION_VIEW, Uri.parse("http:www.ndtv.com"))
            startActivity(i)
        }

    }

    override fun onStart() {
        super.onStart()
        Log.i("mytag","activity started")

    }

    override fun onResume() {
        super.onResume()

        Log.w("mytag","activity resume")

    }

    override fun onPause() {
        super.onPause()
        Log.e("mytag","activity paused")

    }

    override fun onStop() {
        super.onStop()

        Log.i("mytag","activity stopped")

    }

    override fun onDestroy() {
        super.onDestroy()

        Log.i("mytag","activity destroyed")

    }

    override fun onRestart() {
        super.onRestart()
        Log.i("mytag","activity restarted")

    }
}