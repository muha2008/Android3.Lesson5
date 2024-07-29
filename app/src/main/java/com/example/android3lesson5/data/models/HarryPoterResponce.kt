package com.example.android3homework5mc5.data.models

import com.google.gson.annotations.SerializedName

data class HarryPoterResponce(
    @SerializedName("data")
    val data: List<DataItem>?,
    @SerializedName("meta")
    val meta: Meta?,
    @SerializedName("links")
    val links: Links?
)
