package ru.kozlov_victor.notes_app.data

import ru.kozlov_victor.notes_app.data.entity.Note
import java.util.*

class NotesRepository {
    private val notes: List<Note> = listOf(
        Note(
            UUID.randomUUID().toString(),
            "Покупки",
            "Кофе, печеньки, молоко",
            0xfff06292.toInt(),
            Date()
        ),
        Note(
            UUID.randomUUID().toString(),
            "Вторая заметка",
            "Текст второй заметки. Не очень длинный, но интересный",
            0xfff06292.toInt(),
            Date()
        ),
        Note(
            UUID.randomUUID().toString(),
            "Третья заметка",
            "Текст третьей заметки. Не очень длинный, но интересный",
            0xfff06292.toInt(),
            Date()
        ),
        Note(
            UUID.randomUUID().toString(),
            "Четвертая заметка",
            "Текст третьей заметки. Не очень длинный, но интересный",
            0xfff06292.toInt(),
            Date()
        )
    )
}