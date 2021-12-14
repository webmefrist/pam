package app.prokuli

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.prokuli.databinding.ActivityNotifikasiBinding



class NotifikasiActivity : AppCompatActivity() {

    lateinit var binding: ActivityNotifikasiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNotifikasiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvback.setOnClickListener {
            val intent = Intent(this@NotifikasiActivity, MenuActivity::class.java)
            startActivity(intent)
        }


    }
}