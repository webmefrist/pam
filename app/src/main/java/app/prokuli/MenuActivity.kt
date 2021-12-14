package app.prokuli

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.prokuli.Tipe.*
import app.prokuli.databinding.ActivityMenuBinding


class MenuActivity : AppCompatActivity() {

    lateinit var binding:ActivityMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnnotif.setOnClickListener {
            val intent = Intent(this@MenuActivity, NotifikasiActivity::class.java)
            startActivity(intent)
        }
        binding.btnback.setOnClickListener {
          val intent = Intent(this@MenuActivity, LoginActivity::class.java)
          startActivity(intent)
        }

        binding.tvtipe1.setOnClickListener {
            val intent = Intent(this@MenuActivity, Tipe_21Activity::class.java)
            startActivity(intent)
        }
        binding.tvtipe2.setOnClickListener {
            val intent = Intent(this@MenuActivity, Tipe_36Activity::class.java)
            startActivity(intent)
        }

        binding.tvtipe3.setOnClickListener {
            val intent = Intent(this@MenuActivity, Tipe_45Activity::class.java)
            startActivity(intent)
        }

        binding.tvtipe4.setOnClickListener {
            val intent = Intent(this@MenuActivity, Tipe_54Activity::class.java)
            startActivity(intent)
        }

        binding.tvtipe5.setOnClickListener {
            val intent = Intent(this@MenuActivity, Tipe_60Activity::class.java)
            startActivity(intent)
        }

        binding.tvtipe6.setOnClickListener {
            val intent = Intent(this@MenuActivity, Tipe_70Activity::class.java)
            startActivity(intent)
        }

        binding.tvtipe7.setOnClickListener {
            val intent = Intent(this@MenuActivity, Tipe_120Activity::class.java)
            startActivity(intent)
        }

    }
}