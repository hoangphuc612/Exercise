package com.example.data.di

import com.example.data.mapper.Mapper
import com.example.data.repository.GitHubRepositoryImpl
import com.example.data.repository.source.remote.GithubRemoteDataSource
import com.example.domain.repository.GitHubRepository
import org.koin.dsl.module

val repositoryModule = module {

    single { Mapper() }

    single{ GithubRemoteDataSource(get()) }

    single<GitHubRepository> {
        GitHubRepositoryImpl(
            remoteDataSource = get(),
            mapper = get()
        )
    }
}
