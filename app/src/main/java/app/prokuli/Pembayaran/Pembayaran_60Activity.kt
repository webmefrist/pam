package app.prokuli.Pembayaran

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.prokuli.Harga.Harga60Activity
import app.prokuli.LastActivity
import app.prokuli.R

import app.prokuli.databinding.ActivityPembayaran60Binding

class Pembayaran_60Activity : AppCompatActivity() {
    lateinit var binding: ActivityPembayaran60Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityPembayaran60Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        var harga = intent.getStringExtra("HARGA").toString()
        binding.tvtotal.text = getString(R.string.total_pembayaran, harga)


        binding.btnlanjut.setOnClickListener {
            val intent = Intent(this@Pembayaran_60Activity, LastActivity::class.java)
            startActivity(intent)
        }
        binding.tvback.setOnClickListener {
            val intent = Intent(this@Pembayaran_60Activity, Harga60Activity::class.java)
            startActivity(intent)
        }



    }
}