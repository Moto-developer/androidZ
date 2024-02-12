package com.yecid.sqlite

import android.annotation.SuppressLint
import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yecid.sqlite.databinding.ActivityNavegacionBinding
import com.yecid.sqlite.model.Constantes.Companion.SENA_LAT
import com.yecid.sqlite.model.Constantes.Companion.SENA_LONG
import com.yecid.sqlite.model.NavegacionActivity

class NavegacionActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNavegacionBinding

    private lateinit var mediaPlayer:MediaPlayer


    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    binding = ActivityNavegacionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fun audio (cambiar: Int){
            mediaPlayer = MediaPlayer.create(this, cambiar)

        }

        //DAR CLIC EN EL BOTON PARA PASAR A ACTIVIDAD DE MAPA SENA
        binding.botonSena.setOnClickListener{
        startActivity(Intent(this,SenaActivity2::class.java))
            //audio()
            //playAudio()


        }

        //DAR CLIC EN EL BOTON PARA PASAR A ACTIVIDAD DE MAPA MORRO
        binding.botonMorro.setOnClickListener{
            startActivity(Intent(this,MorroActivity2::class.java))


        }

        //DAR CLIC EN EL BOTON PARA PASAR A ACTIVIDAD DE MAPA PARQUE
        binding.botonParque.setOnClickListener{
            startActivity(Intent(this,ParqueActivity2::class.java))

        }

    }

    private fun playAudio (){
        if (mediaPlayer.isPlaying){
            mediaPlayer.pause()
            mediaPlayer.seekTo(0)
        } else {
            mediaPlayer.start()
        }
    }

    override fun onDestroy() {
        mediaPlayer.release()
        super.onDestroy()
    }

}