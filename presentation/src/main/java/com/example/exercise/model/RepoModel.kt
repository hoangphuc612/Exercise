package com.example.exercise.model

data class RepoModel(
    val id: Int,
    val name: String,
    val description: String?
) : PresentationModel()
