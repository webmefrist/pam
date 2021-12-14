package app.prokuli.Pembayaran

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.prokuli.Harga.Harga21Activity
import app.prokuli.LastActivity
import app.prokuli.R
import app.prokuli.databinding.ActivityPembayaran70Binding

class Pembayaran_70Activity : AppCompatActivity() {
    lateinit var binding: ActivityPembayaran70Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityPembayaran70Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        var harga = intent.getStringExtra("HARGA").toString()
        binding.tvtotal.text = getString(R.string.total_pembayaran, harga)


        binding.btnlanjut.setOnClickListener {
            val intent = Intent(this@Pembayaran_70Activity, LastActivity::class.java)
            startActivity(intent)
        }
        binding.tvback.setOnClickListener {
            val intent = Intent(this@Pembayaran_70Activity, Harga21Activity::class.java)
            startActivity(intent)
        }
    }
}