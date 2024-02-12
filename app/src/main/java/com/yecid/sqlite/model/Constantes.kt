package com.yecid.sqlite.model

import com.yecid.sqlite.MainActivity

class Constantes {

    // Sirve para que mis variables contantes sean globales

    companion object{
        const val NOM_BD = "BdAdso"
        const val VERSION_BD = 4

        const val CIUDADES = "Create table ciudad (cod int, nombre text, coddep int)"

        const val DATA = "Create table data (cedula int, nombre text, apellido text, telefono int, ciudad text)"

        var SENA_LAT = 2.4827055384635823
        var SENA_LONG = -76.56253748585905

        const val CONSULTA = "select * from ciudad"

    }
}