package com.example.domain.usecases

import com.example.domain.entity.Repo
import com.example.domain.repository.GitHubRepository
import com.example.domain.usecases.base.SingleUseCase
import com.example.domain.usecases.base.UseCaseScheduler
import io.reactivex.rxjava3.core.Single

class SearchRepo(
    private val gitHubRepository: GitHubRepository,
    useCaseScheduler: UseCaseScheduler
) : SingleUseCase<List<Repo>, String>(useCaseScheduler) {

    override fun build(param: String): Single<List<Repo>> {

    }

}
