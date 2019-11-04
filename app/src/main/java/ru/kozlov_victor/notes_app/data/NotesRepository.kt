package ru.kozlov_victor.notes_app.data

import ru.kozlov_victor.notes_app.data.entity.Note
import java.util.*

object NotesRepository {
    val notes: List<Note> = listOf(
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
            0xff9575cd.toInt(),
            Date()
        ),
        Note(
            UUID.randomUUID().toString(),
            "Третья заметка",
            "Текст третьей заметки. Не очень длинный, но интересный",
            0xff64b5f6.toInt(),
            Date()
        ),
        Note(
            UUID.randomUUID().toString(),
            "Четвертая заметка",
            "Текст третьей заметки. Не очень длинный, но интересный",
            0xffffeb3b.toInt(),
            Date()
        )
    )
}