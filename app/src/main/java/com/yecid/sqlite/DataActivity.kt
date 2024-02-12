package com.yecid.sqlite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.yecid.sqlite.databinding.ActivityDataBinding
import com.yecid.sqlite.model.ManagerBd

class DataActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDataBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.dataEnviar.setOnClickListener{enviarData()}

    }
    fun enviarData () {
        var cedula = binding.dataCc.text.toString()
        var nombre = binding.dataNombre.text.toString()
        var apellido = binding.dataApellido.text.toString()
        var telefono = binding.dataTel.text.toString()
        var ciudadD = binding.dataCiudad.text.toString()

        if (cedula.toString().isEmpty() || nombre.isEmpty() || apellido.isEmpty() || telefono.toString().isEmpty() || ciudadD.isEmpty()){

            Toast.makeText(this, "Por favor rellena todos los campos", Toast.LENGTH_SHORT).show()

        } else{
            //Instanciamos la clase bd Helper
            val manager = ManagerBd(this)
            manager.insertData2(cedula.toInt(), nombre, apellido, telefono.toInt(), ciudadD)

            Toast.makeText(this
                , "Base de datos creada", Toast.LENGTH_SHORT).show()
        }

    }

}