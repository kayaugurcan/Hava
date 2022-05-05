package kaya.ugurcan.hava

import kaya.ugurcan.hava.model.Location
import retrofit2.Call
import retrofit2.http.GET

interface LocationAPI {


    ///https://www.metaweather.com/api/location/search/?lattlong=36.96,-122.02

    @GET("api/location/search/?lattlong=36.96,-122.02")
    fun getLocation() : Call<List<Location>>


}