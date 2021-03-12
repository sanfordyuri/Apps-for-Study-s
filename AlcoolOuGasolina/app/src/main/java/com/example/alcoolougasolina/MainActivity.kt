package com.example.alcoolougasolina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var editPrecoAlcool : EditText
    lateinit var editPrecoGasolina : EditText
    lateinit var textResultado: TextView
    lateinit var btn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editPrecoAlcool = findViewById(R.id.editAlcool)
        editPrecoGasolina = findViewById(R.id.editGasolina)
        textResultado = findViewById(R.id.textResultado)
        btn = findViewById(R.id.button)
        btn.setOnClickListener {
            calcularPreco()
        }
    }

    fun calcularPreco() {

        //Recuperar e converter valores

        //Validar valores
        if((editPrecoAlcool.text.toString() == null || "".equals(editPrecoAlcool.text.toString()) ) || ("".equals(editPrecoGasolina.text.toString()) || editPrecoGasolina.text.toString() == null)) {
            textResultado.setText("Preencha primeiros os campos!")
        } else {
            val precoAlcool = editPrecoAlcool.text.toString().toDouble()
            val precoGasolina = editPrecoGasolina.text.toString().toDouble()

            if((precoAlcool / precoGasolina) >= 0.7) {
                textResultado.setText("É melhor utilizar gasolina!")
            } else {
                textResultado.setText("É melhor utilizar alcool!")
            }
        }
    }
}