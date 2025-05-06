package ir.barok.poet_list.data.source

import ir.barok.poet_list.data.model.PoetDto

interface PoetDataSource {
    suspend fun getPoetList(): List<PoetDto>
}