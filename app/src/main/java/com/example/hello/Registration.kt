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
        var firstNam =itFirstName.text.toString()
        var lastName=itLastName.text.toString()
        val email=itEmail.text.toString()
        val phonenumber=itPhonenumber.text.toString()
        val password=itpassword.text.toString()
        val comfirmPassword=itpassword.text.toString()
        Toast.makeText(baseContext,lastName,Toast.LENGTH_LONG)
    }
    }
}
