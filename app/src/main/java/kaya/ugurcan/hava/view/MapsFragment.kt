package kaya.ugurcan.hava.view


import android.location.LocationListener
import android.location.LocationManager
import androidx.fragment.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import kaya.ugurcan.hava.R
import kaya.ugurcan.hava.databinding.FragmentMapsBinding

class MapsFragment : Fragment(R.layout.fragment_maps) {
    private var latitude: Float = 39.925049F
    private var longtude: Float = 32.837057F
    private lateinit var  binding: FragmentMapsBinding
    private val callback = OnMapReadyCallback { googleMap ->

        /*val sariyer = LatLng(41.1658788, 29.0400142)
        googleMap.addMarker(MarkerOptions().position(sariyer).title("Marker in Sarıyer"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sariyer,15f))*/
        googleMap.setOnMapLongClickListener {
            googleMap.clear()
            googleMap.addMarker((MarkerOptions().position((LatLng(it.latitude,it.longitude))).title("Marker")))
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(LatLng(it.latitude,it.longitude),10f))
            latitude = it.latitude.toFloat()
            longtude = it.longitude.toFloat()
        }

        
        }
    
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {



        return inflater.inflate(R.layout.fragment_maps, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMapsBinding.bind(view)
        val mapFragment = childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment?
        mapFragment?.getMapAsync(callback)
        var kaydet = 0
        binding.kaydetButton.setOnClickListener {

                val action = MapsFragmentDirections.actionMapsFragmentToCityFragment(latitude,longtude)
                Navigation.findNavController(view).navigate(action)


        }

    }



}
