package ir.barok.poet_list.data.source

import ir.barok.poet_list.data.model.PoetDto
import ir.barok.poet_list.data.source.remote.PoetApi
import javax.inject.Inject

class PoetDataSourceImpl @Inject constructor(private val poetApi: PoetApi): PoetDataSource {
    override suspend fun getPoetList(): List<PoetDto> {
        return poetApi.getPoetList()
    }
}