package com.yecid.sqlite.model

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.widget.AdapterView.AdapterContextMenuInfo

data class ManagerBd (val context: Context) {

    lateinit var bd: SQLiteDatabase

    val bdHelper = BdHelper(context) // llamando mi conexión


    //abra base datos modo escritura
    fun openBdWr(){
        bd = bdHelper.writableDatabase
    }


    //abra base datos modo lectura
    fun  openBdRd (){
        bd = bdHelper.readableDatabase
    }

    fun insertData (codigoCiudad:Int, ciudad:String, codigoDpto:Int):Long {

        openBdWr() // Abrir bd modo escritura

        //Creo contenedor de valores para insertar data
        val contenedor = ContentValues()
        contenedor.put("cod",codigoCiudad)
        contenedor.put("nombre",ciudad)
        contenedor.put("codDep",codigoDpto)

        //Llamo el método insert
        val result = bd.insert("ciudad", null, contenedor )

        return result

    }

    fun insertData2 (cedula:Int, nombre:String, apellido:String, telefono: Int, ciudadD: String):Long {

        openBdWr() // Abrir bd modo escritura

        //Creo contenedor de valores para insertar data
        val contenedor = ContentValues()
        contenedor.put("cedula",cedula)
        contenedor.put("nombre",nombre)
        contenedor.put("apellido",apellido)
        contenedor.put("telefono",telefono)
        contenedor.put("ciudad",ciudadD)

        //Llamo el método insert
        val result = bd.insert("data", null, contenedor )

        return result

    }

    fun getData ():ArrayList<Ciudad>{
       openBdRd()
        val cursor= bd.rawQuery(Constantes.CONSULTA,null)



        return lista
    }

}

