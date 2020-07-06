package com.example.reciclerview.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import com.example.reciclerview.R
import kotlinx.android.synthetic.main.toolbar.*

class cadastroFilmeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_filme)

        insertToolbar()
    }
    private fun insertToolbar(){
        setSupportActionBar(toolbar)
        supportActionBar!!.title = "Novo Filme"
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_filme,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.cancelar->{
                Toast.makeText(this,"Cancelar",Toast.LENGTH_SHORT).show()
            }
            R.id.salvar ->{
                Toast.makeText(this,"Salvando",Toast.LENGTH_SHORT).show()
            }
            else ->{
                onBackPressed()
            }
        }


        return true
    }
}
