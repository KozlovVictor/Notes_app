package ru.kozlov_victor.notes_app.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import ru.kozlov_victor.notes_app.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_frame, MainFragment())
            .commit()
    }

}
