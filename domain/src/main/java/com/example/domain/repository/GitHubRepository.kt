package com.example.domain.repository

import com.example.domain.entity.Repo
import com.example.domain.entity.User
import io.reactivex.rxjava3.core.Single

interface GitHubRepository {

    suspend fun searchUsers(userName: String): Single<List<User>>

    suspend fun searchRepo(repoName: String): Single<List<Repo>>
}
