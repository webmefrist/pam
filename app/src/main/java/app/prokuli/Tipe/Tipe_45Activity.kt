package app.prokuli.Tipe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.prokuli.Harga.Harga21Activity
import app.prokuli.Harga.Harga45Activity
import app.prokuli.MenuActivity
import app.prokuli.R
import app.prokuli.databinding.ActivityTipe45Binding
import app.prokuli.info.InfoActivity

class Tipe_45Activity : AppCompatActivity() {

    lateinit var binding: ActivityTipe45Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTipe45Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnback.setOnClickListener {
            val intent = Intent(this@Tipe_45Activity, MenuActivity::class.java)
            startActivity(intent)
        }

        binding.btninfo.setOnClickListener {
            val intent = Intent(this@Tipe_45Activity, InfoActivity::class.java)
            startActivity(intent)
        }

        binding.btnlanjut.setOnClickListener {
            val intent = Intent(this@Tipe_45Activity, Harga45Activity::class.java)
            startActivity(intent)
        }
    }
}