package app.prokuli.Tipe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.prokuli.Harga.Harga21Activity
import app.prokuli.MenuActivity
import app.prokuli.databinding.ActivityTipe21Binding
import app.prokuli.info.InfoActivity

class Tipe_21Activity : AppCompatActivity() {

    lateinit var binding: ActivityTipe21Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTipe21Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnback.setOnClickListener {
            val intent = Intent(this@Tipe_21Activity, MenuActivity::class.java)
            startActivity(intent)
        }

        binding.btninfo.setOnClickListener{
            val intent = Intent(this@Tipe_21Activity, InfoActivity::class.java)
            startActivity(intent)
        }

        binding.btnlanjut.setOnClickListener{
            val intent = Intent(this@Tipe_21Activity, Harga21Activity::class.java)
            startActivity(intent)
        }

    }
}