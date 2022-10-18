package com.example.quotesitvo.core.di

import com.example.quotesitvo.data.local.QuoteLocalDataSource
import com.example.quotesitvo.data.local.QuoteLocalDataSourceImpl
import com.example.quotesitvo.data.QuoteRepositoryImpl
import com.example.quotesitvo.domain.QuoteRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class QuoteRepositoryModule {

    @Binds
    abstract fun bindQuoteRepository(quoteRepositoryImpl: QuoteRepositoryImpl):
            QuoteRepository

    @Binds
    abstract fun bindQuoteLocalDataSource(quoteLocalDataSourceImpl: QuoteLocalDataSourceImpl):
            QuoteLocalDataSource

}
