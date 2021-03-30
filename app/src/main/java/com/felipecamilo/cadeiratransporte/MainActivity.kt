package com.felipecamilo.cadeiratransporte

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Float

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalcular.setOnClickListener {
            if (txtAltura.text.toString() != "" && txtPeso.text.toString() != "" && txtIdade.text.toString() != "") {
                var altura =  Float.parseFloat(txtAltura.text.toString())
                var peso = Float.parseFloat(txtPeso.text.toString())
                var idade = Float.parseFloat(txtIdade.text.toString())
                var resultado = altura + peso + idade
                txtResultado.text = resultado.toString()
            }
        }
    }
}