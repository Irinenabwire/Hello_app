package com.example.hello

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    btnLogin.setOnClickListener {
        var userName = itUsernme.text.toString()
        var password=itpassword.text.toString()
        Toast.makeText(baseContext,userName,Toast.LENGTH_LONG).show()


    }
    }
}