package com.example.domain.usecases.base

import io.reactivex.rxjava3.disposables.CompositeDisposable

abstract class UseCase<T, in Params> {

    private val disposable: CompositeDisposable = CompositeDisposable()

    protected abstract fun build(param: Params): T

    protected open fun execute(param: Params): T {
        return build(param)
    }
}
