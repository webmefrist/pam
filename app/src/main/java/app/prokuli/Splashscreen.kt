package app.prokuli

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class Splashscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)

        Handler().postDelayed({
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }, 3000)

//        val handler = Handler()
//        handler.postDelayed({
//            startActivity(Intent(applicationContext, MenuActivity::class.java))
//            finish()
//        }, 3000L)
    }
}