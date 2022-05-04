package kaya.ugurcan.hava.view

import android.os.Bundle
import android.os.CountDownTimer
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kaya.ugurcan.hava.R


class SplashFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

         object : CountDownTimer(3L*1000,1000,) {

            override fun onTick(p0: Long) {

            }

            override fun onFinish() {
                Navigation.findNavController(view).navigate(SplashFragmentDirections.actionBlankFragmentToMapsFragment())
            }

        }.start()


    }
}