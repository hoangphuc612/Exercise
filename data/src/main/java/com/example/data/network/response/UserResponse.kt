package com.example.data.network.response

import com.google.gson.annotations.SerializedName

data class UserResponse(
    @SerializedName("items")
    val items: List<UserDTO>
)

data class UserDTO(
    @SerializedName("id")
    val id: Long = 0,
    @SerializedName("avatar_url")
    val avatar_url: String = "",
    @SerializedName("login")
    val name: String = ""
)
