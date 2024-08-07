package mx.edu.uthermosillo.a21311072.comandas.data.network.clients

import mx.edu.uthermosillo.a21311072.comandas.data.models.State
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface StateApiClient {

    @GET("states")
    suspend fun  getState(): Response<List<State>>

    @GET("states/{id}")
    suspend fun  getState(@Path("id") id: Int): Response<State>
}