package com.ibrahim.kotlincitysymbol

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.ibrahim.kotlincitysymbol.databinding.ActivityDetailsBinding

class ActivityDetails : AppCompatActivity() {
    private lateinit var binding:ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val intent=intent

        val selectedLandmark=intent.getSerializableExtra("Landmark") as Landmark

        binding.textView.text=selectedLandmark.name
        binding.textView2.text=selectedLandmark.location
        binding.imageView.setImageResource(selectedLandmark.image)



    }
}