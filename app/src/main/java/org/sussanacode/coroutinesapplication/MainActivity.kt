package org.sussanacode.coroutinesapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.coroutines.*
import org.sussanacode.coroutinesapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btncounter.setOnClickListener {

//            MainScope().launch(Dispatchers.Main) {
//                for(i in 1..10000000){
//                    binding.btncounter.text = "Counter is $i"
//                }
//            }

            GlobalScope.launch(Dispatchers.Main) {
                for(i in 1..1000){
                    binding.btncounter.text = "Counter is $i"
                    delay(100)
                }
            }

        }


        binding.btnclick.setOnClickListener {
            Toast.makeText(baseContext, "Hello from Coroutines :)", Toast.LENGTH_LONG).show()
        }
    }
}