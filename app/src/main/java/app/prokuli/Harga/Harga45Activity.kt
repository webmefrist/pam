package app.prokuli.Harga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import app.prokuli.Pembayaran.Pembayaran_36Activity
import app.prokuli.Pembayaran.Pembayaran_45Activity
import app.prokuli.R
import app.prokuli.Tipe.Tipe_36Activity
import app.prokuli.Tipe.Tipe_45Activity
import app.prokuli.databinding.ActivityHarga45Binding

class Harga45Activity : AppCompatActivity() {
    lateinit var binding: ActivityHarga45Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityHarga45Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.tvback.setOnClickListener {
            val intent = Intent(this@Harga45Activity, Tipe_45Activity::class.java)
            startActivity(intent)
        }

        binding.btnlanjut.setOnClickListener{
            val btnlanjut = binding.btnlanjut
            var radioId = binding.rHarga.checkedRadioButtonId
            var harga = binding.root.findViewById<RadioButton>(radioId).text.toString()
            harga = harga.replace(",", "")

            val intent = Intent(this, Pembayaran_45Activity::class.java)
            intent.putExtra("HARGA", harga)
            startActivity(intent)

            Toast.makeText(this, harga, Toast.LENGTH_SHORT).show()
        }
    }
}