package app.prokuli.Tipe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.prokuli.Harga.Harga21Activity
import app.prokuli.Harga.Harga60Activity
import app.prokuli.MenuActivity
import app.prokuli.R
import app.prokuli.databinding.ActivityTipe60Binding
import app.prokuli.info.InfoActivity


class Tipe_60Activity : AppCompatActivity() {
    lateinit var  binding: ActivityTipe60Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTipe60Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnback.setOnClickListener {
            val intent = Intent(this@Tipe_60Activity, MenuActivity::class.java)
            startActivity(intent)
        }

        binding.btninfo.setOnClickListener {
            val intent = Intent(this@Tipe_60Activity, InfoActivity::class.java)
            startActivity(intent)
        }

        binding.btnlanjut.setOnClickListener {
            val intent = Intent(this@Tipe_60Activity, Harga60Activity::class.java)
            startActivity(intent)
        }
    }
}