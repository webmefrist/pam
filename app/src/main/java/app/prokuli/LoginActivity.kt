package app.prokuli


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import app.prokuli.databinding.ActivityLoginBinding
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {

    lateinit var binding : ActivityLoginBinding
    private lateinit var auth: FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        auth = FirebaseAuth.getInstance()



        binding.tvregister.setOnClickListener {
           val intent = Intent(this@LoginActivity, RegisterActivity::class.java)
            startActivity(intent)
        }

        binding.btnlogin.setOnClickListener {
            val email = binding.etemail.text.toString().trim()
            val password = binding.etpassword.text.toString().trim()


            if (email.isEmpty()) {
                binding.etemail.error = "Email required"
                binding.etemail.requestFocus()
                return@setOnClickListener
            }
            if (password.isEmpty() || password.length < 6) {
                binding.etpassword.error = "Password required"
                binding.etpassword.requestFocus()
                return@setOnClickListener
            }


            loginUser(email, password )
        }

    }

    private fun loginUser(email: String, password: String) {
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) {
            if (it.isSuccessful) {
                    val intent = Intent(this@LoginActivity, MenuActivity::class.java)
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
                    startActivity(intent)

            } else {
                Toast.makeText(this, "${it.exception?.message}", Toast.LENGTH_SHORT).show()

            }
        }
    }
}


