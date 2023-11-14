package com.example.bier.models

import kotlinx.serialization.Required
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames

@Serializable
data class User(
    val mName: String,
    val mAge: Int,
    val mNumber: Number
)

@Serializable
enum class Number(){
    ONE, TWO
}


@Serializable
data class Project(
    @JsonNames("title", "subtitle", "chapter") val name: String,
    )


