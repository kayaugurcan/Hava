package kaya.ugurcan.hava.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kaya.ugurcan.hava.R
import kaya.ugurcan.hava.databinding.FragmentCityBinding


class CityFragment : Fragment(R.layout.fragment_city) {
    private lateinit var binding: FragmentCityBinding
    private var latitude = 0F
    private var longtude = 0F
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        arguments?.let {
            latitude = CityFragmentArgs.fromBundle(it).latitude
            longtude = CityFragmentArgs.fromBundle(it).longtide
        }
        return inflater.inflate(R.layout.fragment_city, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentCityBinding.bind(view)




    }
}