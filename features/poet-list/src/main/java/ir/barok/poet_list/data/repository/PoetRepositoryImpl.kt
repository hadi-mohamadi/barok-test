package ir.barok.poet_list.data.repository

import ir.barok.poet_list.data.source.PoetDataSource
import ir.barok.poet_list.domain.model.Poet
import ir.barok.poet_list.domain.repository.PoetRepository
import javax.inject.Inject

class PoetRepositoryImpl @Inject constructor(private val dataSource: PoetDataSource) :
    PoetRepository {
    override suspend fun getPoetList(): List<Poet> {
        return dataSource.getPoetList().map { it.toDomainModel() }
    }
}