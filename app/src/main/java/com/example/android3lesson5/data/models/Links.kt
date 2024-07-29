package com.example.android3homework5mc5.data.models

import com.google.gson.annotations.SerializedName

data class Links(
    @SerializedName("next")
    val next: String = "",
    @SerializedName("current")
    val current: String = "",
    @SerializedName("last")
    val last: String = "",
    @SerializedName("self")
    val self: String = ""
)
