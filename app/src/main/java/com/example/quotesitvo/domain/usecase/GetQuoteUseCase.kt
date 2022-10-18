package com.example.quotesitvo.domain.usecase

import com.example.quotesitvo.domain.QuoteRepository
import com.example.quotesitvo.domain.model.QuoteModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetQuoteUseCase @Inject constructor(
    private val quoteRepository: QuoteRepository) {
    suspend fun getQuote(quoteId: Int): Flow<QuoteModel> = quoteRepository.getQuote(quoteId)

}