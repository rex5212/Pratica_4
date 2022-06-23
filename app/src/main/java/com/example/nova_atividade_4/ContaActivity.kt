package com.example.nova_atividade_4

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class ContaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_conta)
        setSupportActionBar(findViewById(R.id.toolbarconta))
        setTitle("View")

        val botaosair = findViewById<ImageButton>(R.id.Ibtnsair)
        botaosair.setOnClickListener {
            val intencao = Intent(applicationContext, LoginActivity:: class.java)
            startActivity(intencao)
        }

        val botaovolta = findViewById<ImageButton>(R.id.Ibtnvolta)
        botaovolta.setOnClickListener {
            finish()
        }
    }
}