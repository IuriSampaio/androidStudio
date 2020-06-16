package com.example.tollbar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.toolbar.*

class MainActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)//isso é pra saber que essa é a toolbar da actyvity

        supportActionBar!!.title = "Titulo"
        // mudando o titulo do action bar sem prescisar mudar no @string/appname

        clickListener()
    }

    //função que chama o menu
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_toolbar, menu)
        return true
    }
    // função que diz oque acontece a partir do click de um elemento do menu
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // estrutura do when:               tipo um swicth case
        when(item.itemId){
            R.id.menu_salvar ->{
                Toast.makeText(this,"Salvo",Toast.LENGTH_SHORT).show()
            }
            R.id.menu_about ->{
                Toast.makeText(this,"Configurações",Toast.LENGTH_SHORT).show()
            }
            R.id.menu_config ->{
                Toast.makeText(this,"só quero um emprego",Toast.LENGTH_SHORT).show()
            }
            R.id.menu_info ->{
                Toast.makeText(this,"me contrata => iuri sampaio",Toast.LENGTH_SHORT).show()
            }
        }
        // é a mesma coisa dos if´s encadeados

        //if (item.itemId == R.id.menu_salvar){
        //    Toast.makeText(this,"Salvo",Toast.LENGTH_SHORT).show()
        //}else if(item.itemId == R.id.menu_config){
        //    Toast.makeText(this,"Configurações",Toast.LENGTH_SHORT).show()
        //}else if(item.itemId ==R.id.menu_about){
        //    Toast.makeText(this,"só quero um emprego",Toast.LENGTH_SHORT).show()
        //}else{
        //     Toast.makeText(this,"me contrata => iuri sampaio",Toast.LENGTH_SHORT).show()
        //}

        return super.onOptionsItemSelected(item)
    }

    // função que chama os click's nos id's
    private fun clickListener(){
        txtHello.setOnClickListener(this)
        btn1.setOnClickListener(this)
    }

    // função que define oque acontece a cada click
    override fun onClick(view: View?){
        if (view != null) {
            if (view.id == R.id.txtHello) {
                Toast.makeText(this, "que merda", Toast.LENGTH_LONG).show()
            }else if (view.id == R.id.btn1){
                val intent = Intent(this,tollbar2::class.java)
                startActivity(intent)
            }
        }
    }
}
