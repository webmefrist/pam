package app.prokuli.Pembayaran

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.prokuli.Harga.Harga120Activity
import app.prokuli.Harga.Harga21Activity
import app.prokuli.LastActivity
import app.prokuli.R
import app.prokuli.databinding.ActivityPembayaran120Binding

class Pembayaran_120Activity : AppCompatActivity() {
    lateinit var binding: ActivityPembayaran120Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding =  ActivityPembayaran120Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        var harga = intent.getStringExtra("HARGA").toString()
        binding.tvtotal.text = getString(R.string.total_pembayaran, harga)


        binding.btnlanjut.setOnClickListener {
            val intent = Intent(this@Pembayaran_120Activity, LastActivity::class.java)
            startActivity(intent)
        }
        binding.tvback.setOnClickListener {
            val intent = Intent(this@Pembayaran_120Activity, Harga120Activity::class.java)
            startActivity(intent)
        }
    }
}