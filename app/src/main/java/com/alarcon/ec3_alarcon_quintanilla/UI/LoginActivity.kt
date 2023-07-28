package com.alarcon.ec3_alarcon_quintanilla.UI

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import com.alarcon.ec3_alarcon_quintanilla.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            val email = binding.tilEmail.editText?.text.toString()
            val password = binding.tilPassword.editText?.text.toString()

            if (validateEmailPass(email, password)) {
                val intent = Intent(this, BarActivity::class.java)
                startActivity(intent)
                Toast.makeText(this, "Ingreso exitoso", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "email/password incorrectas", Toast.LENGTH_SHORT).show()
            }
        }

        binding.tilEmail.editText?.addTextChangedListener { text ->
            validateInputs()
        }
        binding.tilPassword.editText?.addTextChangedListener { text ->
            validateInputs()
        }
    }

    private fun validateInputs() {
        val email = binding.tilEmail.editText?.text.toString()
        val password = binding.tilPassword.editText?.text.toString()
        val isEmailValid = Patterns.EMAIL_ADDRESS.matcher(email).matches()
        val isPasswordValid = password.length >= 6

        binding.btnLogin.isEnabled = isEmailValid && isPasswordValid
    }

    private fun validateEmailPass(email: String, password: String): Boolean {
        return email == "ejemplo@idat.edu.pe" && password == "123456"
    }
}