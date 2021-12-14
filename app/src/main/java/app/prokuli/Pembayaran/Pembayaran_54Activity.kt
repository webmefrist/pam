package app.prokuli.Pembayaran

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.prokuli.Harga.Harga21Activity
import app.prokuli.LastActivity
import app.prokuli.R
import app.prokuli.databinding.ActivityPembayaran54Binding

class Pembayaran_54Activity : AppCompatActivity() {
    lateinit var binding: ActivityPembayaran54Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPembayaran54Binding.inflate(layoutInflater)
        setContentView(binding.root)

        var harga = intent.getStringExtra("HARGA").toString()
        binding.tvtotal.text = getString(R.string.total_pembayaran, harga)


        binding.btnlanjut.setOnClickListener {
            val intent = Intent(this@Pembayaran_54Activity, LastActivity::class.java)
            startActivity(intent)
        }
        binding.tvback.setOnClickListener {
            val intent = Intent(this@Pembayaran_54Activity, Harga21Activity::class.java)
            startActivity(intent)
        }
    }
}