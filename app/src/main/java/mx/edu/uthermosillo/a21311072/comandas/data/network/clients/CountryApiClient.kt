package mx.edu.uthermosillo.a21311072.comandas.data.network.clients

import mx.edu.uthermosillo.a21311072.comandas.data.models.Country
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface CountryApiClient {

    @GET("countries")
    suspend fun  getCountries(): Response<List<Country>>

    @GET("countries/{id}")
    suspend fun  getCountry(@Path("id") id: Int): Response<Country>
}