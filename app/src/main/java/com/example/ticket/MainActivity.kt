package com.example.ticket

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.ticket.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private lateinit var destination: Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        destination=resources.getStringArray(R.array.destination)



        with(binding){
            val adapterDepart=ArrayAdapter(this@MainActivity,android.R.layout.simple_spinner_dropdown_item,destination)
            adapterDepart.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            departurelist.adapter=adapterDepart

            val adapterArriv=ArrayAdapter(this@MainActivity,android.R.layout.simple_spinner_dropdown_item,destination)
            adapterArriv.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            arrivallist.adapter=adapterArriv
        }


    }
}