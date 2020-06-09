package br.senai.sp.jandira.imc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_imc.setOnClickListener {
            val abrirPrincipalActivity=Intent(this, PrincipalActivity::class.java)
            startActivity(abrirPrincipalActivity)
        }
    }
}

