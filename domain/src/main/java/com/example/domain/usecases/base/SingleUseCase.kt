package com.example.domain.usecases.base

import io.reactivex.rxjava3.core.Single

abstract class SingleUseCase<T, in Params>
constructor(private val useCaseScheduler: UseCaseScheduler? = null) : UseCase<Single<T>, Params>() {

    override fun build(param: Params): Single<T> =
        super.execute(param)
            .compose { transformer ->
                useCaseScheduler?.let {
                    transformer.subscribeOn(it.subscribeSchedule).observeOn(it.postScheduler)
                } ?: transformer
            }
}
