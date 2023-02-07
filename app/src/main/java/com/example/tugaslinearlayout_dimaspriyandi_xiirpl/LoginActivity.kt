package com.example.tugaslinearlayout_dimaspriyandi_xiirpl

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class LoginActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val email:TextInputEditText = findViewById(R.id.email)
        val password: TextInputEditText = findViewById(R.id.password)
        val button:Button  = findViewById(R.id.btnLogin)
        val intent :Intent = Intent(this,ProfileActivity::class.java)
        button.setOnClickListener {
            if(email.text.toString().equals("admin@gmail.com") && password.text.toString().equals("admin") ){
                intent.putExtra("Name","Dimas")
                intent.putExtra("Nis","12345")
                intent.putExtra("Email Address",email.text.toString())
                intent.putExtra("Mobile Phone","+8212212")

                startActivity(intent)
            }else{
                Toast.makeText(this,"Username or password wrong",
                    Toast.LENGTH_SHORT)
                    .show()
            }
        }


    }
}