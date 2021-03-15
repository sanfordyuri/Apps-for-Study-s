package com.example.caraoucoroa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import kotlin.random.Random

class resultado : AppCompatActivity() {

    lateinit var img: ImageView
    lateinit var btn_voltar:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        img = findViewById(R.id.imageView3)
        btn_voltar = findViewById(R.id.button2)
        val intent = Intent(this, MainActivity::class.java)
        btn_voltar.setOnClickListener {


            startActivity(intent)
        }
        //Recuperar Dados
        val dados: Bundle? = getIntent().extras



        if(dados!=null) {
            val n = dados!!.getInt("numero")

            if(n == 0) {
                img.setImageResource(R.drawable.moeda_cara)
            } else {
                img.setImageResource(R.drawable.moeda_coroa)
            }
        }






    }
}