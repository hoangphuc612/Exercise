package com.example.data.di

import com.example.data.network.api.ServiceGenerator
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import org.koin.dsl.module

val networkModule = module {
    single<Gson> {
        GsonBuilder().excludeFieldsWithoutExposeAnnotation().create()
    }
    single {
        ServiceGenerator.buildRestApi(get())
    }
}
