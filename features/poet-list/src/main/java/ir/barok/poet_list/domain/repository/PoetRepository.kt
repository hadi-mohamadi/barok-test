package ir.barok.poet_list.domain.repository

import ir.barok.poet_list.domain.model.Poet

interface PoetRepository {
    suspend fun getPoetList():List<Poet>
}