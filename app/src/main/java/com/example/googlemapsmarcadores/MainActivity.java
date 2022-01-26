package com.example.googlemapsmarcadores;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


    }

    @Override
    public void onMapReady ( @NonNull GoogleMap googleMap ) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng Ing = new LatLng(-1.01270, -79.46952);
        LatLng Agrop = new LatLng(-1.08037, -79.50141);
        LatLng Empres = new LatLng(-1.01273, -79.46955);
        LatLng Enferm = new LatLng(-1.01276, -79.46958);
        LatLng Financ = new LatLng(-1.08040, -79.50144);
        mMap.addMarker(new MarkerOptions()
                .position(Ing)
                .draggable(true)
                .title("Facultad de Ciencias de la Ingeniería")
                .snippet("Decano: Ing. Washington Alberto Chiriboga Casanova, M.Sc.")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ingen_30px))
                .flat(true)
                .zIndex(1.0f)
        );
        mMap.addMarker(new MarkerOptions()
                .position(Agrop)
                .draggable(true)
                .title("Facultad de Ciencias Agropecuarias")
                .snippet("Decano: Ing. Leonardo Gonzalo Matute, M.Sc.")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.agropec_30px))
                .flat(true)
                .zIndex(1.0f)
        );
        mMap.addMarker(new MarkerOptions()
                .position(Empres)
                .draggable(true)
                .title("Facultad de Ciencias Empresariales")
                .snippet("Decano: Ing. Mariela Susana Andrade Arias, PhD.")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.empresar_30px))
                .flat(true)
                .zIndex(1.0f)
        );
        mMap.addMarker(new MarkerOptions()
                .position(Enferm)
                .draggable(true)
                .title("Facultad de Ciencias de la Salud")
                .snippet("Decano: Lcda. Inés de la Luz Bajaña Mendieta, M.Sc.")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.enfermer_30px))
                .flat(true)
                .zIndex(1.0f)
        );
        mMap.addMarker(new MarkerOptions()
                .position(Financ)
                .draggable(true)
                .title("Facultad de Ciencias Sociales, Económicas y Financieras")
                .snippet("Decano: Econ. Nivaldo Apolonides Vera Valdiviezo, M.Sc.")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.financie_30px))
                .flat(true)
                .zIndex(1.0f)
        );
//sydney
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Ing));
    }
}