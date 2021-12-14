package app.prokuli.Pembayaran

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import app.prokuli.Harga.Harga21Activity
import app.prokuli.LastActivity
import app.prokuli.NotifikasiActivity
import app.prokuli.R
import app.prokuli.databinding.ActivityPembayaran21Binding

class Pembayaran_21Activity : AppCompatActivity() {

    private lateinit var binding: ActivityPembayaran21Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPembayaran21Binding.inflate(layoutInflater)
        setContentView(binding.root)

        var harga = intent.getStringExtra("HARGA").toString()
        binding.tvtotal.text = getString(R.string.total_pembayaran, harga)


        binding.tvback.setOnClickListener {
            val intent = Intent(this@Pembayaran_21Activity, Harga21Activity::class.java)
            startActivity(intent)
        }

        binding.btnlanjut.setOnClickListener {
            val intent = Intent(this@Pembayaran_21Activity, LastActivity::class.java)
            startActivity(intent)
        }

//        binding.btnlanjut.setOnClickListener {
//            val btnlanjut = binding.btnlanjut
//
//            val bukti = binding.root.findViewById<EditText>(etalamat).text.toString()
//
//            val intent = Intent(this, NotifikasiActivity::class.java)
//            intent.putExtra("BUKTI", bukti)
//            startActivity(intent)
//
//            Toast.makeText(this, bukti, Toast.LENGTH_SHORT).show()
//        }
    }
}
