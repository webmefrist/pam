package app.prokuli.Harga


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import app.prokuli.MenuActivity
import app.prokuli.Pembayaran.Pembayaran_21Activity
import app.prokuli.Tipe.Tipe_21Activity
import app.prokuli.databinding.ActivityHarga21Binding
import app.prokuli.databinding.ActivityTipe21Binding


class Harga21Activity : AppCompatActivity() {

    lateinit var binding: ActivityHarga21Binding

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = ActivityHarga21Binding.inflate(layoutInflater)
            setContentView(binding.root)

            binding.tvback.setOnClickListener {
                val intent = Intent(this@Harga21Activity, Tipe_21Activity::class.java)
                startActivity(intent)
            }


            binding.btnlanjut.setOnClickListener{
                val btnlanjut = binding.btnlanjut
                var radioId = binding.rHarga.checkedRadioButtonId
                var harga = binding.root.findViewById<RadioButton>(radioId).text.toString()
                harga = harga.replace(",", "")

                val intent = Intent(this, Pembayaran_21Activity::class.java)
                intent.putExtra("HARGA", harga)
                startActivity(intent)

                Toast.makeText(this, harga, Toast.LENGTH_SHORT).show()
            }
        }
}


