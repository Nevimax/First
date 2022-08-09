package com.nevimax.first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showDescription(view: View) {
        var position = spinnerColors.selectedItemPosition // получить позицию спинера
        textView.text = resources.getStringArray(R.array.description_of_temp)[position] // положить выбраную в строке с той же позицией
    }

//    private fun getDescriptionByPosition(position: Int) = resources.getStringArray(R.array.description_of_temp)[position]
}