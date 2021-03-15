package com.example.fragments.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.FragmentTransaction
import com.example.fragments.R

class MainActivity : AppCompatActivity() {

    lateinit var conversas: ConversaFragment
    lateinit var contatos: ContatoFragment
    lateinit var btnConversa:Button
    lateinit var btnContato:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.elevation = 0F
        conversas = ConversaFragment()
        contatos = ContatoFragment()
        btnContato = findViewById(R.id.button2)
        btnConversa = findViewById(R.id.button3)

        val fragmentTransaction : FragmentTransaction = supportFragmentManager.beginTransaction()

        fragmentTransaction.replace(R.id.frameLayout, conversas)
        fragmentTransaction.commit()

        btnConversa.setOnClickListener {
            val fragmentTransaction : FragmentTransaction = supportFragmentManager.beginTransaction()

            fragmentTransaction.replace(R.id.frameLayout, conversas)
            fragmentTransaction.commit()
        }

        btnContato.setOnClickListener {
            val fragmentTransaction : FragmentTransaction = supportFragmentManager.beginTransaction()

            fragmentTransaction.replace(R.id.frameLayout, contatos)
            fragmentTransaction.commit()
        }



    }
}