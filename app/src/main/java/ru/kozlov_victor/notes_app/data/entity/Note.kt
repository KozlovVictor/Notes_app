package ru.kozlov_victor.notes_app.data.entity

import java.util.*

data class Note(
    val id: String,
    val title: String,
    val body: String,
    val color: Int,
    val lastChanged: Date = Date()
)