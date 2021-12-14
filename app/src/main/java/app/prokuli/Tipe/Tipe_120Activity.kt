package app.prokuli.Tipe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.prokuli.Harga.Harga120Activity
import app.prokuli.Harga.Harga21Activity
import app.prokuli.MenuActivity
import app.prokuli.R
import app.prokuli.databinding.ActivityTipe120Binding
import app.prokuli.info.InfoActivity

class Tipe_120Activity : AppCompatActivity() {
    lateinit var binding: ActivityTipe120Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityTipe120Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnback.setOnClickListener {
            val intent = Intent(this@Tipe_120Activity, MenuActivity::class.java)
            startActivity(intent)
        }

        binding.btninfo.setOnClickListener {
            val intent = Intent(this@Tipe_120Activity, InfoActivity::class.java)
            startActivity(intent)
        }

        binding.btnlanjut.setOnClickListener {
            val intent = Intent(this@Tipe_120Activity, Harga120Activity::class.java)
            startActivity(intent)
        }
    }
}