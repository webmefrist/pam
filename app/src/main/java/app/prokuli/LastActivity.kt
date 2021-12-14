package app.prokuli

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.prokuli.databinding.ActivityLastBinding

class LastActivity : AppCompatActivity() {

    lateinit var binding: ActivityLastBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLastBinding.inflate(layoutInflater)
        setContentView(binding.root)



    binding.btnlanjut.setOnClickListener {
        val intent = Intent(this@LastActivity, NotifikasiActivity::class.java)
        startActivity(intent)
        }
    }
}