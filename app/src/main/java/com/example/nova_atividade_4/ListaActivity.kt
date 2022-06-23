package com.example.nova_atividade_4

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class ListaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_lista)
        val listView = findViewById<ListView>(R.id.lista)
        val names = arrayOf( "John Wick – De Volta ao Jogo", "Missão Impossível - Protocolo Fantasma",
            "O Exterminador do Futuro", "Indiana Jones e o Templo da Perdição")
        val ufs = arrayOf("Amazon Prime Video, Telecine", "Star+, Amazon Prime Video",
            "Amazon Prime Video, Google play Filme e TV", "Amazon Prime Video, AppleTV")

        val arrayAdapter: ArrayAdapter<String> = ArrayAdapter(
            this, android.R.layout.simple_list_item_1, names
        )

        listView.adapter= arrayAdapter

        listView.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(this,"O filme "+ names[i]+ " esta disponivel nas seguintes platalformas: \n" + ufs[i], Toast.LENGTH_LONG)
                .show()
        }

        val botaoperfil = findViewById<Button>(R.id.btnlista)
        botaoperfil.setOnClickListener {
            val intencao = Intent(applicationContext, ContaActivity:: class.java)
            startActivity(intencao)
        }
    }
}