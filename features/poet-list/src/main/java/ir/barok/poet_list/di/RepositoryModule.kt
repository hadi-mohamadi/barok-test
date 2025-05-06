package ir.barok.poet_list.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ir.barok.poet_list.data.repository.PoetRepositoryImpl
import ir.barok.poet_list.data.source.PoetDataSource
import ir.barok.poet_list.domain.repository.PoetRepository
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class RepositoryModule {

    @Provides
    @Singleton
    fun providePoetRepository(
        poetDataSource: PoetDataSource
    ): PoetRepository {
        return PoetRepositoryImpl(poetDataSource)
    }
}