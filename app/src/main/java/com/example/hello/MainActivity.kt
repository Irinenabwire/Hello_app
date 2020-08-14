package com.example.hello

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import okhttp3.MultipartBody

import retrofit2.Call
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    btnLogin.setOnClickListener {
        var userName = etUsername.text.toString()
        var password=etpssword.text.toString()

        var requestBody = MultipartBody.Builder()
            .setType(MultipartBody.FORM)
            .addFormDataPart("User-name",userName)
            .addFormDataPart("password", password)

        registerUser(requestBody)
        Toast.makeText(baseContext, password, Toast.LENGTH_SHORT).show()
    }
    }


    fun registerUser(requestBody: MultipartBody.Builder) {
        var apiClient = ApiClient.buildService(ApiInterface::class.java)
        var registrationCall = apiClient.registerStudent(requestBody)
        with(registrationCall) {
            registrationCall.enqueue(object : retrofit2.Callback<RegistrationResponse>{
                override fun onFailure(call: Call<RegistrationResponse>, t: Throwable) {
                    Toast.makeText(baseContext, t.message, Toast.LENGTH_LONG).show()
                }
                override fun onResponse(
                    call: Call<RegistrationResponse>,

                    response: Response<RegistrationResponse>
                ) {
                    if (response.isSuccessful) {
                        Toast.makeText(baseContext, response.body()?.message, Toast.LENGTH_LONG).show()
                        startActivity(Intent(baseContext, MainActivity::class.java))
                    } else {
                        Toast.makeText(baseContext, response.errorBody().toString(), Toast.LENGTH_LONG)
                            .show()
                    }
                }
            })
        }
    }

}








