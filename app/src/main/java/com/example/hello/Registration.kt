package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_registration.*
import okhttp3.MultipartBody
import retrofit2.Call
import retrofit2.Response


class Registration : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
        btnSignup.setOnClickListener {
            var firstNam = etFirstName.text.toString()
            var lastName = etLastName.text.toString()
            val email = etEmail.text.toString()
            val phonenumber = etPhonenumber.text.toString()
            val password = etpassword.text.toString()
            val comfirmPassword = etComfirmpassword.text.toString()

            var requestBody = MultipartBody.Builder()
                .setType(MultipartBody.FORM)
                .addFormDataPart("first_name", firstNam)
                .addFormDataPart("last_name", lastName)
                .addFormDataPart("email", email)
                .addFormDataPart("phone_number", phonenumber)
                .addFormDataPart("password", password)
                .build()


            registerUser(requestBody)
            Toast.makeText(baseContext, password, Toast.LENGTH_SHORT).show()
        }
    }


    fun registerUser(requestBody: MultipartBody) {
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








