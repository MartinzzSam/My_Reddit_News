package com.martinz.domain.reddit_news

import com.martinz.model.reddit_news.RedditPost
import com.martinz.redditnews.core.util.Response
import com.martinz.repository.RedditRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.map


// Simply Show Posts That Have Body First
// UseCases Not Needed In This Micro Project Really But I Added UseCase just because its required
// otherwise i will inject repository directly to viewModel to prevent over architecture
class GetNewsFilteredByBody(
    private val repository : RedditRepository
) {

   operator  fun  invoke() : Flow<Response<List<RedditPost>>> = repository.getRedditNews().map { response ->
       when(response) {

           is Response.Success -> {
              val sortedList = response.data.sortedBy { it.postBody.isBlank() }
               Response.Success(sortedList)
           }

           is Response.Error -> {
               val sortedList = response.data?.sortedBy { it.postBody.isBlank() }
               Response.Error(data = sortedList , message = response.message)
           }
           is Response.Loading -> { Response.Loading }
       }
   }
}