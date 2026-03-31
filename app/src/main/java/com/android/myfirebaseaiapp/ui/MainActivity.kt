package com.android.myfirebaseaiapp.ui

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.viewModels
import com.android.myfirebaseaiapp.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val promptInput = findViewById<EditText>(R.id.promptInput)
        val button = findViewById<Button>(R.id.myButton)
        val textView = findViewById<TextView>(R.id.myTextView)

        button.setOnClickListener {
            val prompt = promptInput.text.toString().trim()
            if (prompt.isNotEmpty()) {
                viewModel.onButtonClick(prompt)
            } else {
                textView.text = "Please enter a prompt first."
            }
        }

        viewModel.response.observe(this) { result ->
            textView.text = result
        }
    }
}
