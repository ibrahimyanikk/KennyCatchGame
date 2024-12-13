package com.ibrahim.kotlincitysymbol

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.ibrahim.kotlincitysymbol.databinding.ActivityDetailsBinding
import com.ibrahim.kotlincitysymbol.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var LandmarList:ArrayList<Landmark>

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
        LandmarList=ArrayList<Landmark>()

        val anit=Landmark("Karşıyaka Anıt","Çarşı",R.drawable.anit)
        val teleferik=Landmark("İzmir Teleferik","Narlıdere",R.drawable.teleferik)
        val saatkule=Landmark("Saat Kulesi","Konak",R.drawable.saatkule)

        LandmarList.add(anit)
        LandmarList.add(teleferik)
        LandmarList.add(saatkule)

        binding.recyclerview.layoutManager=LinearLayoutManager(this)
        val landmarkAdapter=LandmarkAdapter(LandmarList)

        binding.recyclerview.adapter=landmarkAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.activity_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId==R.id.addpost){
            var intent= Intent(this@MainActivity,ActivityDetails::class.java)
            startActivity(intent)
        }else if(item.itemId==R.id.logout){
            //finishAffinity() // Tüm aktiviteleri kapat
            //android.os.Process.killProcess(android.os.Process.myPid()) // Uygulama sürecini sonlandır
            //System.exit(0) // Sistemden çıkış yap
        }


        return super.onOptionsItemSelected(item)
    }


}