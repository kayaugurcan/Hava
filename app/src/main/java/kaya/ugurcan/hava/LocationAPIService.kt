package kaya.ugurcan.hava

import kaya.ugurcan.hava.model.Location
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class LocationAPIService {

    //https://www.metaweather.com/api/location/search/?lattlong=36.96,-122.02

    private val BASE_URL = "https://www.metaweather.com/"
    private val api = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(LocationAPI::class.java)

    fun getData(): Call<List<Location>>{
        return api.getLocation()
    }
}