package ir.barok.poet_list.data.source.remote

import ir.barok.poet_list.data.model.PoetDto
import retrofit2.http.GET

interface PoetApi {

    @GET("api/ganjoor/poets")
    suspend fun getPoetList(): List<PoetDto>
}