package tech.altgreg.zadanie1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.MapView
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.gms.maps.model.PolylineOptions

class MainActivity : AppCompatActivity(), OnMapReadyCallback {

    lateinit var twojeMapView: MapView
    var map: GoogleMap? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // a. znajdz współrzędne, będziesz je używał w następnych zadaniach, podając je jako argumenty funkcji
        TODO("Przypisz wartości zmiennym  = LatLng(x,y)")
        val A0: LatLng
        val B9: LatLng
        val D6: LatLng

        // b.przypisz wartość dla zmiennej twojeMapView
        TODO("b")

        // musi być
        twojeMapView.onCreate(savedInstanceState)

        // c.zainicjalizuj mapę
        TODO("c")


    }


        // musi być zdefiniowane
        override fun onResume() {
            super.onResume()
            twojeMapView?.onResume()
        }

        override fun onStart() {
            super.onStart()
            twojeMapView?.onStart()
        }

        override fun onStop() {
            super.onStop()
            twojeMapView?.onStop()
        }

        override fun onPause() {
            super.onPause()
            twojeMapView?.onPause()
        }

        override fun onLowMemory() {
            super.onLowMemory()
            twojeMapView?.onLowMemory()
        }

    override fun onMapReady(map: GoogleMap) {

        // d.dodaj marker na A0
        TODO("d")

        // d.dodaj marker na D6
        TODO("d")

        // d.dodaj marker na B9
        TODO("d")

        // e. tworzymy edytowalną liste elementów LatLng
        TODO("e")

        // f. dodajemy linie
        TODO("f")


        TODO("Odkomentuj to co poniżej")
//        map?.animateCamera(
//            CameraUpdateFactory.newLatLngZoom(
//                LatLng(50.064899, 19.921201),
//                15f
//            )
//        )
    }


}