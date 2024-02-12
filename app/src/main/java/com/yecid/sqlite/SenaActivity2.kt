package com.yecid.sqlite

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yecid.sqlite.databinding.ActivitySena2Binding
import com.yecid.sqlite.model.Constantes

class SenaActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivitySena2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySena2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        //DAR CLIC EN EL BOTON PARA PASAR A ACTIVIDAD DE MAPA SENA
        binding.botonSena.setOnClickListener{
            startActivity(Intent(this,MapsActivity::class.java))

            Constantes.SENA_LAT = 2.4827055384635823
            Constantes.SENA_LONG = -76.56253748585905

        }
    }
}