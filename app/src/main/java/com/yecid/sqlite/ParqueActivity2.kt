package com.yecid.sqlite

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yecid.sqlite.databinding.ActivityParque2Binding
import com.yecid.sqlite.model.Constantes

class ParqueActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityParque2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityParque2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        //DAR CLIC EN EL BOTON PARA PASAR A ACTIVIDAD DE MAPA PARQUE
        binding.botonParque.setOnClickListener{
            startActivity(Intent(this,MapsActivity::class.java))

            Constantes.SENA_LAT = 2.44184386299662
            Constantes.SENA_LONG = -76.60638743215519



        }
    }
}