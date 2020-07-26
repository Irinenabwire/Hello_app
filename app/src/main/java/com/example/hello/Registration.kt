package com.example.hello

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_registration.*

class Registration : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
    btnSignup.setOnClickListener {
        var firstNam =etFirstName.text.toString()
        var lastName=etLastName.text.toString()
        val email=etEmail.text.toString()
        val phonenumber=etPhonenumber.text.toString()
        val password=etpassword.text.toString()
        val comfirmPassword=etComfirmpassword.text.toString()
        Toast.makeText(baseContext,lastName,Toast.LENGTH_LONG)
    }
    }
}

