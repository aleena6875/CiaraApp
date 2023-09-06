package com.example.ciaraapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast


class GetDetailFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_get_detail, container, false)

        val ageSpinner: Spinner = rootView.findViewById(R.id.ageSpinner)
        val danSpinner: Spinner = rootView.findViewById(R.id.danSpinner)
        val genSpinner: Spinner = rootView.findViewById(R.id.genSpinner)
        ArrayAdapter.createFromResource(
            requireContext(),
            R.array.age_categories, // Reference to your string array in strings.xml
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            ageSpinner.adapter = adapter
        }

        ArrayAdapter.createFromResource(
            requireContext(),
            R.array.category,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            danSpinner.adapter = adapter
        }

        ArrayAdapter.createFromResource(
            requireContext(),
            R.array.gender_category,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            genSpinner.adapter = adapter
        }

        // Add an OnItemSelectedListener to the Spinners to handle item selection
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
                    requireContext(),
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
                // You can perform actions with the selected category here
                Toast.makeText(
                    requireContext(),
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
                // You can perform actions with the selected gender category here
                Toast.makeText(
                    requireContext(),
                    "Selected Gender Category: $selectedGenderCategory",
                    Toast.LENGTH_SHORT
                ).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Handle case where nothing is selected (optional)
            }
        }

        return rootView
    }
}



