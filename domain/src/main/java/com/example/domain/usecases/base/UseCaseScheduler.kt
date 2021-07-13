package com.example.domain.usecases.base

import io.reactivex.rxjava3.core.Scheduler

data class UseCaseScheduler(val subscribeSchedule: Scheduler, val postScheduler: Scheduler)
