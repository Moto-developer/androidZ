package com.yecid.sqlite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.yecid.sqlite.databinding.ActivityMapsBinding
import com.yecid.sqlite.model.Constantes.Companion.SENA_LAT
import com.yecid.sqlite.model.Constantes.Companion.SENA_LONG

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityMapsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        crearPunto(SENA_LAT,SENA_LONG)

    }

    fun crearPunto(lt:Double,lon:Double) {

        // Agrega un punto en el SENA CTPI
        val sena = LatLng(lt,lon)
        mMap.addMarker(MarkerOptions().position(sena).title("Estoy en ${lt},${lon}"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sena))
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(sena, 16f), 4000, null)

    }
}