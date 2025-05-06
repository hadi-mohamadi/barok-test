package ir.barok.poet_list.domain.usecase

import ir.barok.poet_list.domain.model.Poet
import ir.barok.poet_list.domain.repository.PoetRepository
import javax.inject.Inject

class GetPoetListUseCase @Inject constructor(private val repository: PoetRepository) {
    suspend operator fun invoke():List<Poet>{
        return repository.getPoetList()
    }
}