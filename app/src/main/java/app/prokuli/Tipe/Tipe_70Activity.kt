package app.prokuli.Tipe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.prokuli.Harga.Harga21Activity
import app.prokuli.Harga.Harga70Activity
import app.prokuli.MenuActivity
import app.prokuli.R
import app.prokuli.databinding.ActivityTipe70Binding
import app.prokuli.info.InfoActivity

class Tipe_70Activity : AppCompatActivity() {
    lateinit var binding: ActivityTipe70Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTipe70Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnback.setOnClickListener {
            val intent = Intent(this@Tipe_70Activity, MenuActivity::class.java)
            startActivity(intent)
        }

        binding.btninfo.setOnClickListener {
            val intent = Intent(this@Tipe_70Activity, InfoActivity::class.java)
            startActivity(intent)
        }

        binding.btnlanjut.setOnClickListener {
            val intent = Intent(this@Tipe_70Activity, Harga70Activity::class.java)
            startActivity(intent)
        }
    }
}