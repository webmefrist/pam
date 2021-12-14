package app.prokuli.Harga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import app.prokuli.Pembayaran.Pembayaran_120Activity
import app.prokuli.Pembayaran.Pembayaran_36Activity
import app.prokuli.Tipe.Tipe_120Activity
import app.prokuli.Tipe.Tipe_36Activity
import app.prokuli.databinding.ActivityHarga120Binding
import app.prokuli.databinding.ActivityTipe120Binding

class Harga120Activity : AppCompatActivity() {
    lateinit var binding: ActivityHarga120Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityHarga120Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.tvback.setOnClickListener {
            val intent = Intent(this@Harga120Activity, Tipe_120Activity::class.java)
            startActivity(intent)
        }

        binding.btnlanjut.setOnClickListener{
            val btnlanjut = binding.btnlanjut
            var radioId = binding.rHarga.checkedRadioButtonId
            var harga = binding.root.findViewById<RadioButton>(radioId).text.toString()
            harga = harga.replace(",", "")

            val intent = Intent(this, Pembayaran_120Activity::class.java)
            intent.putExtra("HARGA", harga)
            startActivity(intent)

            Toast.makeText(this, harga, Toast.LENGTH_SHORT).show()
        }
    }
}