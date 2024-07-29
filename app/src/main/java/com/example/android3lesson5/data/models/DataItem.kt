package com.example.android3homework5mc5.data.models

import com.example.android3lesson5.data.models.Attributes
import com.google.gson.annotations.SerializedName

data class DataItem(
    @SerializedName("attributes")
    val attributes: Attributes,
    @SerializedName("links")
    val links: Links,
    @SerializedName("id")
    val id: String = "",
    @SerializedName("type")
    val type: String = ""
)