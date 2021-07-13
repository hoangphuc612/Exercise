package com.example.data.network.response

import com.google.gson.annotations.SerializedName

data class RepoResponse(
    @SerializedName("items")
    val items: List<RepoDTO>
)

data class RepoDTO(
    @SerializedName("id")
    val id: Long,
    @SerializedName("full_name")
    val fullName: String = "",
    @SerializedName("description")
    val description: String = ""
)
