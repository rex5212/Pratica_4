package com.example.nova_atividade_4

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_login)

        val botao = findViewById<Button>(R.id.butEntrar)
        botao.setOnClickListener {
            val intencao = Intent(applicationContext, ListaActivity:: class.java)
            startActivity(intencao)
        }

        val botaocadastro = findViewById<Button>(R.id.btncadastra)
        botaocadastro.setOnClickListener {
            val intencaoC = Intent(applicationContext, CadastroActivity:: class.java)
            startActivity(intencaoC)
        }
    }
}