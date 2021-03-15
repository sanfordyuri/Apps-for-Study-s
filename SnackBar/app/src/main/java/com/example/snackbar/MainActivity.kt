package com.example.snackbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    lateinit var btn:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn = findViewById(R.id.button)

        btn.setOnClickListener(View.OnClickListener {
            Snackbar.make(
                    it,
                    "Botão pressionado",
                    Snackbar.LENGTH_LONG
            ).setAction("Confirmar", View.OnClickListener {
                btn.setText("Botao alterado")
            }).show()
        })
    }
}