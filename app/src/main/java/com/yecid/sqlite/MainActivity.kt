package com.yecid.sqlite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.yecid.sqlite.databinding.ActivityMainBinding
import com.yecid.sqlite.model.BdHelper
import com.yecid.sqlite.model.ManagerBd

class MainActivity : AppCompatActivity() {

    //Activar el binding

        private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Segundo paso para activar el bindign
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.boton.setOnClickListener {enviar()}


    }

    fun enviar () {

        var codigoCiudad = binding.codciudad.text.toString().toInt()
        var ciudad = binding.ciudad.text.toString()
        var codigoDpto = binding.coddepto.text.toString().toInt()

        //Instanciamos la clase bd Helper
        val manager = ManagerBd(this)

        manager.insertData(codigoCiudad, ciudad, codigoDpto)


        Toast.makeText(this
            , "Base de datos creada", Toast.LENGTH_SHORT).show()



        Toast.makeText(this, "$ciudad tiene el código: $codigoCiudad y el código de dpto es: $codigoDpto", Toast.LENGTH_SHORT).show()

    }


}
