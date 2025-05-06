package ir.barok.poet_list.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ir.barok.poet_list.data.source.remote.PoetApi
import retrofit2.Retrofit
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class ApiModule {

    @Provides
    @Singleton
    fun providePoetApi(retrofit: Retrofit): PoetApi {
        return retrofit.create(PoetApi::class.java)
    }
}