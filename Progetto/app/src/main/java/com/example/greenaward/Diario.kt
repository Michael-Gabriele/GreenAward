package com.example.greenaward

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class Diario : AppCompatActivity(), OnMapReadyCallback {
    private lateinit var gMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mapFragment = supportFragmentManager.findFragmentById(R.id.id_maps) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        // La mappa è pronta, puoi iniziare ad interagire con essa qui
        // Esempio: aggiungere un marcatore alla posizione specificata
        val position = LatLng(37.7749, -122.4194) // San Francisco
        googleMap.addMarker(MarkerOptions().position(position).title("San Francisco"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(position, 12f))
    }
}
