package com.example.data.repository

import com.example.data.mapper.Mapper
import com.example.data.network.api.ApiService
import com.example.domain.entity.Repo
import com.example.domain.entity.User
import com.example.domain.repository.GitHubRepository
import io.reactivex.rxjava3.core.Single

class GitHubRepositoryImpl(
    private val apiService: ApiService,
    private val mapper: Mapper
) : GitHubRepository {

    override suspend fun searchUsers(userName: String): Single<List<User>> =
        apiService.searchUsers(userName).map {
            mapper.transform(it.items)
        }

    override suspend fun searchRepo(repoName: String): Single<List<Repo>> =
        apiService.searchRepo(repoName).map {
            mapper.transformRepo(it.items)
        }
}
