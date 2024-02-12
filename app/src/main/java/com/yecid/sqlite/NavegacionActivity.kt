package com.yecid.sqlite

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yecid.sqlite.databinding.ActivityNavegacionBinding
import com.yecid.sqlite.model.Constantes.Companion.SENA_LAT
import com.yecid.sqlite.model.Constantes.Companion.SENA_LONG
import com.yecid.sqlite.model.NavegacionActivity

class NavegacionActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNavegacionBinding


    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    binding = ActivityNavegacionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //DAR CLIC EN EL BOTON PARA PASAR A ACTIVIDAD DE MAPA SENA
        binding.botonSena.setOnClickListener{
        startActivity(Intent(this,MapsActivity::class.java))

            SENA_LAT= 2.4827055384635823
            SENA_LONG = -76.56253748585905

        }

        //DAR CLIC EN EL BOTON PARA PASAR A ACTIVIDAD DE MAPA MORRO
        binding.botonMorro.setOnClickListener{
            startActivity(Intent(this,MapsActivity::class.java))

            SENA_LAT= 2.4447261000810654
            SENA_LONG = -76.60009959056292

        }

        //DAR CLIC EN EL BOTON PARA PASAR A ACTIVIDAD DE MAPA PARQUE
        binding.botonParque.setOnClickListener{
            startActivity(Intent(this,MapsActivity::class.java))

            SENA_LAT= 2.44184386299662
            SENA_LONG = -76.60638743215519

        }

    }

}