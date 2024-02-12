package com.yecid.sqlite

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yecid.sqlite.databinding.ActivityMorro2Binding
import com.yecid.sqlite.model.Constantes

class MorroActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMorro2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMorro2Binding.inflate(layoutInflater)

        setContentView(binding.root)

        //DAR CLIC EN EL BOTON PARA PASAR A ACTIVIDAD DE MAPA MORRO
        binding.botonMorro.setOnClickListener{
            startActivity(Intent(this,MapsActivity::class.java))

            Constantes.SENA_LAT = 2.4447261000810654
            Constantes.SENA_LONG = -76.60009959056292

        }


    }
}