package com.example.myfebapp

import android.content.DialogInterface
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var a = 100
        Log.e("mytag","activity created and data is $a")

        buttonSubmit.setOnClickListener {
           var un =  editTextUsername.text.toString()

            var i = Intent(this, SecondActivity::class.java)
            i.putExtra("keyun",un)
            startActivity(i)
        }

        imageViewBox.setOnClickListener {
            var builder = AlertDialog.Builder(this)
            builder.setTitle("MY TITLE")
            builder.setMessage("Do you want to Exit the Screen")

            builder.setPositiveButton("NO", DialogInterface.OnClickListener { dialogInterface, i ->

                Toast.makeText(this, "want to continue", Toast.LENGTH_SHORT).show()
            })

            builder.setNegativeButton("YES", DialogInterface.OnClickListener { dialogInterface, i ->
                this.finish()
            })

            var alertDialog = builder.create()
            alertDialog.show()
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