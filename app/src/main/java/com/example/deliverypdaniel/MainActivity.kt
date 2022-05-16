package com.example.deliverypdaniel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.deliverypdaniel.databinding.ActivityMainBinding
import com.example.deliverypdaniel.databinding.ActivityPrincipalBinding

class MainActivity : AppCompatActivity() {

    private lateinit var views:     ActivityMainBinding
    private var binding:ActivityMainBinding? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        views = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

        val user = findViewById<EditText>(R.id.usuario)
        val email = findViewById<EditText>(R.id.email)
        val phone = findViewById<EditText>(R.id.phone)
        val password = findViewById<EditText>(R.id.password)
        val sendButton = findViewById<Button>(R.id.buton)

        sendButton.setOnClickListener {
            val message = "Usuario: ${user.text},Email: ${email.text}, Phone: ${phone.text},Password: ${password.text}"
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

        binding.textInputEditText.doOnTextChanged {text, start, before, count ->
            if(text!!.lenght > 10){
                binding.textInputLayout.error = " Demasiado!"
            }else if (text.lenght < 10){
                binding.textInptuLayout.error = null
            }

        }
        }
    }
}