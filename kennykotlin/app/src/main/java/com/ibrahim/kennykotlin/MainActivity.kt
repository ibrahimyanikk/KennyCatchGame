package com.ibrahim.kennykotlin

import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.isInvisible
import com.ibrahim.kennykotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private var skor=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.image1.visibility=View.INVISIBLE
        binding.image2.visibility=View.INVISIBLE
        binding.image3.visibility=View.INVISIBLE
        binding.image4.visibility=View.INVISIBLE
        binding.image5.visibility=View.INVISIBLE
        binding.image6.visibility=View.INVISIBLE
        binding.image7.visibility=View.INVISIBLE
        binding.image8.visibility=View.INVISIBLE
        binding.image9.visibility=View.INVISIBLE
    }
    fun start(view: View){
        object:CountDownTimer(10000,1000){

            override fun onTick(millisUntilFinished: Long) {
                val randomNumber=(1..9).random()

                binding.button.isEnabled=false

                binding.textView.text="Left: ${millisUntilFinished/1000}"

                binding.image1.visibility=View.INVISIBLE
                binding.image2.visibility=View.INVISIBLE
                binding.image3.visibility=View.INVISIBLE
                binding.image4.visibility=View.INVISIBLE
                binding.image5.visibility=View.INVISIBLE
                binding.image6.visibility=View.INVISIBLE
                binding.image7.visibility=View.INVISIBLE
                binding.image8.visibility=View.INVISIBLE
                binding.image9.visibility=View.INVISIBLE

                binding.textView2.text="Skor: $skor"

                when (randomNumber) {
                    1 -> binding.image1.visibility = View.VISIBLE
                    2 -> binding.image2.visibility = View.VISIBLE
                    3 -> binding.image3.visibility = View.VISIBLE
                    4 -> binding.image4.visibility = View.VISIBLE
                    5 -> binding.image5.visibility = View.VISIBLE
                    6 -> binding.image6.visibility = View.VISIBLE
                    7 -> binding.image7.visibility = View.VISIBLE
                    8 -> binding.image8.visibility = View.VISIBLE
                    9 -> binding.image9.visibility = View.VISIBLE
                }

            }

            override fun onFinish() {
                binding.button.isEnabled=true
                binding.textView.text="Left: 0"

                binding.image1.visibility=View.INVISIBLE
                binding.image2.visibility=View.INVISIBLE
                binding.image3.visibility=View.INVISIBLE
                binding.image4.visibility=View.INVISIBLE
                binding.image5.visibility=View.INVISIBLE
                binding.image6.visibility=View.INVISIBLE
                binding.image7.visibility=View.INVISIBLE
                binding.image8.visibility=View.INVISIBLE
                binding.image9.visibility=View.INVISIBLE
            }

        }.start()

        if(!binding.button.isEnabled){
        }
    }
    fun image1(view:View){
        skor++
    }
    fun image2(view:View){
        skor++
    }
    fun image3(view:View){
        skor++
    }
    fun image4(view:View){
        skor++
    }
    fun image5(view:View){
        skor++
    }
    fun image6(view:View){
        skor++
    }
    fun image7(view:View){
        skor++
    }
    fun image8(view:View){
        skor++
    }
    fun image9(view:View){
        skor++
    }


}