package mx.edu.uthermosillo.a21311072.comandas.data.network.clients

import mx.edu.uthermosillo.a21311072.comandas.data.models.City
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface CityApiClient {

    @GET("cities")
    suspend fun  getCities(): Response<List<City>>

    @GET("cities/{id}")
    suspend fun  getCity(@Path("id") id: Int): Response<City>
}