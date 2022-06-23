package com.example.nova_atividade_4

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class CadastroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_cadastro)
        setSupportActionBar(findViewById(R.id.tlbcadastro))
        setTitle("View")

        val botaocriar = findViewById<Button>(R.id.btncriar)
        botaocriar.setOnClickListener {
            finish()
        }

        val botaovolta = findViewById<Button>(R.id.btnvolta)
        botaovolta.setOnClickListener {
            finish()
        }
    }
}