package ir.barok.poet_list.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ir.barok.poet_list.data.source.PoetDataSource
import ir.barok.poet_list.data.source.PoetDataSourceImpl
import ir.barok.poet_list.data.source.remote.PoetApi
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class DataSourceModule {

    @Provides
    @Singleton
    fun providePoetDataSource(poetApi: PoetApi): PoetDataSource {
        return PoetDataSourceImpl(poetApi)
    }
}