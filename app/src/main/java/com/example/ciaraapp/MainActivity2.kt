package com.example.ciaraapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val ageSpinner: Spinner = findViewById(R.id.ageSpinner) // Replace with your Spinner's ID
val danSpinner:Spinner=findViewById(R.id.danSpinner)
        val genSpinner:Spinner=findViewById(R.id.genSpinner)
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter.createFromResource(
            this,
            R.array.age_categories, // Reference to your string array in strings.xml
            android.R.layout.simple_spinner_item,


        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner

            ageSpinner.adapter = adapter

        }
        ArrayAdapter.createFromResource(
            this,
        R.array.category,
        android.R.layout.simple_spinner_item).also {
            adapter->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            danSpinner.adapter=adapter
        }
        ArrayAdapter.createFromResource(
            this,
            R.array.gender_category,
            android.R.layout.simple_spinner_item).also {
                adapter->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            genSpinner.adapter=adapter
        }
        // Add an OnItemSelectedListener to the Spinner to handle item selection
        ageSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val selectedAgeCategory = parent?.getItemAtPosition(position).toString()
                // You can perform actions with the selected age category here
                Toast.makeText(
                    applicationContext,
                    "Selected Age Category: $selectedAgeCategory",
                    Toast.LENGTH_SHORT
                ).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Handle case where nothing is selected (optional)
            }
        }
        danSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val selectedCategory = parent?.getItemAtPosition(position).toString()
                // You can perform actions with the selected age category here
                Toast.makeText(
                    applicationContext,
                    "Selected Category: $selectedCategory",
                    Toast.LENGTH_SHORT
                ).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Handle case where nothing is selected (optional)
            }
        }
        genSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val selectedGenderCategory = parent?.getItemAtPosition(position).toString()
                // You can perform actions with the selected age category here
                Toast.makeText(
                    applicationContext,
                    "Selected Gender Category: $selectedGenderCategory",
                    Toast.LENGTH_SHORT
                ).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Handle case where nothing is selected (optional)
            }
        }
    }
}