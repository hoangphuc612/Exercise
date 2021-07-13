package com.example.data.network.api

import com.example.data.network.response.RepoResponse
import com.example.data.network.response.UserResponse
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("search/users?")
    suspend fun searchUsers(
        @Query("q") userName: String
    ): Single<UserResponse>

    @GET("search/repositories?")
    suspend fun searchRepo(
        @Query("q") repo: String
    ): Single<RepoResponse>
}
