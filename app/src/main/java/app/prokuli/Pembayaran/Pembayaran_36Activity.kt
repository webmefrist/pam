package app.prokuli.Pembayaran

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.prokuli.Harga.Harga21Activity
import app.prokuli.LastActivity
import app.prokuli.R
import app.prokuli.databinding.ActivityPembayaran36Binding

class Pembayaran_36Activity : AppCompatActivity() {

    private lateinit var binding: ActivityPembayaran36Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPembayaran36Binding.inflate(layoutInflater)
        setContentView(binding.root)

        var harga = intent.getStringExtra("HARGA").toString()
        binding.tvtotal.text = getString(R.string.total_pembayaran, harga)


        binding.btnlanjut.setOnClickListener {
            val intent = Intent(this@Pembayaran_36Activity, LastActivity::class.java)
            startActivity(intent)
        }
        binding.tvback.setOnClickListener {
            val intent = Intent(this@Pembayaran_36Activity, Harga21Activity::class.java)
            startActivity(intent)
        }
    }
}