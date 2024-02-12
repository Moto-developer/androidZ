package com.yecid.sqlite.model

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.provider.SyncStateContract.Constants

class BdHelper(
    context: Context?, // De donde se está llamando la conexión
) : SQLiteOpenHelper(context, Constantes.NOM_BD, null, Constantes.VERSION_BD) {

    //
    override fun onCreate(db: SQLiteDatabase?) {

       db?.execSQL(Constantes.CIUDADES)
        db?.execSQL(Constantes.DATA)

    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

        db?.execSQL("DROP TABLE IF EXISTS ciudad")
        db?.execSQL("DROP TABLE IF EXISTS data")
        onCreate(db)

    }

}