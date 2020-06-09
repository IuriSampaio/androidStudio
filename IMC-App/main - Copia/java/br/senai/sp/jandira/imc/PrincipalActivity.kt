package br.senai.sp.jandira.imc
import android.widget.LinearLayout
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
class PrincipalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        //PEGANDO OS ELEMENTO PELO ID, PRESENTES NA activity_main.xml
        // val é constante(nao pode mudar no decorrer do codigo)
        val buttonCalcular = findViewById<Button>(R.id.button_calcular)
        val editTextPeso=findViewById<EditText>(R.id.edit_text_peso)
        val editTextAltura=findViewById<EditText>(R.id.edit_text_altura)


        //DECLARANDO VARIAVEIS DE PESO E ALTURA COMO DOUBLE
        // var é variavel(pode ter o valor alterado)
        // var peso : Double
        // var altura :Double

        //quando clicar no buttonCalcular
        buttonCalcular.setOnClickListener {
            //abrindo a pagina que mostra o resultado
            val abrirResultadoActivity = Intent(this, ResultadoActivity::class.java)
            //pegando os valores de peso e altura presentes no editText do xml
            abrirResultadoActivity.putExtra("peso",editTextPeso.text.toString())
            abrirResultadoActivity.putExtra("altura",editTextAltura.text.toString())
            startActivity(abrirResultadoActivity)
        }
        /*
            val text_view_resultado = findViewById<TextView>(R.id.text_view_resultado)
        CODIGO PARA FAZER QUE AO CLIQUE DO BOTAO O RESULTADO DO IMC SEJA EXIBIDO NA MESMA PAGINA QUE O LAYOUT
        button_calcular.setOnClickListener {
             //Obter oque e digitado

             peso = edit_text_peso.text.toString().toDouble()
             altura = edit_text_altura.text.toString().toDouble()

             //Caucular IMC

             imc = peso /(altura*altura)

             //Comentar sobre o imc
             if (imc<=18.5){
                 text_view_resultado.text = " Seu IMC é " + imc + " eai magrao"
             }
             else if(imc>18.5 && imc<25){
                 text_view_resultado.text = " Seu IMC é " + imc + " eai Saude"
             }
             else if(imc>25 && imc<30){
                 text_view_resultado.text = " Seu IMC é " + imc + " eai gordin"
             }
             else if(imc>30 && imc<35){

                 text_view_resultado.text = " Seu IMC é " + imc + " eai obeso"
             }
             else if(imc>35 && imc<40){
                 text_view_resultado.text =" Seu IMC é " + imc + " eai gordo obeso morbido escroto"
             }
             else {
                 text_view_resultado.text = " tu nem existe bixao"
             }

         }*/
    }
}