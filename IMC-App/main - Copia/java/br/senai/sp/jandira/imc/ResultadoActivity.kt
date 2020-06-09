package br.senai.sp.jandira.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)
        //recuperar o peso e altura
        var peso = intent.getStringExtra("peso")
        var altura = intent.getStringExtra("altura")
        val textViewImc =findViewById<TextView>(R.id.textViewImc)
        var imc = calcularImc(peso, altura)
        textViewImc.text =imc
        //Toast.makeText(this, peso, Toast.LENGTH_LONG).show()//motra um icone com o peso temporariamente
    }
    //função quie calcula imc
    fun calcularImc(peso: String, altura: String): String{
        var imc =  peso.toDouble() / (altura.toDouble() * altura.toDouble())
        //depois da casa decimal tera so 1 digitos com essa formatação
        return "%.1f".format(imc)
    }}
