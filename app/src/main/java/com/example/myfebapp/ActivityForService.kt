package com.example.myfebapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_for_service.*

class ActivityForService : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_for_service)

        registerForContextMenu(imageViewScreenshot)

        buttonStart.setOnClickListener {
            var i = Intent(this, MyService::class.java)
            startService(i)
        }

        buttonStop.setOnClickListener {
            var i = Intent(this, MyService::class.java)
            stopService(i)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.mymenu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var myid = item.itemId

        if(myid == R.id.myact){
            var i = Intent(this, SecondActivity::class.java)
            startActivity(i)
        }
        if(myid == R.id.mytoast){
            Toast.makeText(this, "yu selected toast", Toast.LENGTH_SHORT).show()
        }

        return super.onOptionsItemSelected(item)
    }


    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.mymenu, menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        var myid = item.itemId
        if(myid == R.id.myact){
            var i = Intent(this, SecondActivity::class.java)
            startActivity(i)
        }
        if(myid == R.id.mytoast){
            Toast.makeText(this, "yu selected toast", Toast.LENGTH_SHORT).show()
        }

        return super.onContextItemSelected(item)
    }




}