package app.prokuli.info

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.prokuli.Tipe.Tipe_21Activity
import app.prokuli.databinding.ActivityInfoBinding

class InfoActivity : AppCompatActivity() {

    lateinit var binding: ActivityInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvback.setOnClickListener{
            val intent = Intent (this@InfoActivity, Tipe_21Activity::class.java)
            startActivity(intent)
        }
    }

}