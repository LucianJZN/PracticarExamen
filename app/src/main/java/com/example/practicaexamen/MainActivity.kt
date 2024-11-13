package com.example.practicaexamen

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val textoVista: TextView = findViewById(R.id.textVista)
        val inputText: EditText = findViewById(R.id.inputText)
        val boton: Button = findViewById(R.id.button)

        //Mantener el estado
        //textoVista.text = savedInstanceState?.getString("textoVista") ?: ""

        boton.setOnClickListener{
            textoVista.text = "Has introducido: ${inputText.text}"
        }
    }

    //Mantener el estado
    /*  override fun onSaveInstanceState(outState: Bundle) {
      super.onSaveInstanceState(outState)
      outState.putString("textoVista", findViewById<TextView>(R.id.textVista).text.toString())
  }*/
    /*override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("textoVista",findViewById<TextView>(R.id.textVista).text.toString())
    }*/

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("textoVista",findViewById<TextView>(R.id.textVista).text.toString())
    }
}


//Por lo tanto hay que recordar crear una funcion

//onSaveInstance() y despues se autocompleta
//y en outState.putString("variable a guardar",id de donde se obtiene.text.toString()

//y hay que llamar a savedInstance.getString("variable") para que se restablezca el valor introducido al girar la pantalla