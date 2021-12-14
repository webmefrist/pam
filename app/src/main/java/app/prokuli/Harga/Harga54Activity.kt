package app.prokuli.Harga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import app.prokuli.Pembayaran.Pembayaran_36Activity
import app.prokuli.Pembayaran.Pembayaran_54Activity
import app.prokuli.R
import app.prokuli.Tipe.Tipe_36Activity
import app.prokuli.Tipe.Tipe_54Activity
import app.prokuli.databinding.ActivityHarga54Binding

class Harga54Activity : AppCompatActivity() {
    lateinit var binding: ActivityHarga54Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHarga54Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnlanjut.setOnClickListener{
            val intent = Intent( this@Harga54Activity, Tipe_54Activity::class.java)
            startActivity(intent)
        }

        binding.btnlanjut.setOnClickListener{
            val btnlanjut = binding.btnlanjut
            var radioId = binding.rHarga.checkedRadioButtonId
            var harga = binding.root.findViewById<RadioButton>(radioId).text.toString()
            harga = harga.replace(",", "")

            val intent = Intent(this, Pembayaran_54Activity::class.java)
            intent.putExtra("HARGA", harga)
            startActivity(intent)

            Toast.makeText(this, harga, Toast.LENGTH_SHORT).show()
        }
    }
}