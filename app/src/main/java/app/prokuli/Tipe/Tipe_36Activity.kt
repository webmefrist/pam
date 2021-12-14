package app.prokuli.Tipe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.prokuli.Harga.Harga21Activity
import app.prokuli.Harga.Harga36Activity
import app.prokuli.MenuActivity
import app.prokuli.R
import app.prokuli.databinding.ActivityTipe21Binding
import app.prokuli.databinding.ActivityTipe36Binding
import app.prokuli.info.InfoActivity

class Tipe_36Activity : AppCompatActivity() {

    lateinit var binding: ActivityTipe36Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTipe36Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnback.setOnClickListener {
            val intent = Intent(this@Tipe_36Activity, MenuActivity::class.java)
            startActivity(intent)
        }

        binding.btninfo.setOnClickListener {
            val intent = Intent(this@Tipe_36Activity, InfoActivity::class.java)
            startActivity(intent)
        }

        binding.btnlanjut.setOnClickListener {
            val intent = Intent(this@Tipe_36Activity, Harga36Activity::class.java)
            startActivity(intent)
        }
    }
}