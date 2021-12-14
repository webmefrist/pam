package app.prokuli

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import app.prokuli.databinding.ActivityRegisterBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class RegisterActivity : AppCompatActivity() {

    lateinit var binding: ActivityRegisterBinding
    private  lateinit var auth :FirebaseAuth
    lateinit var ref:DatabaseReference


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvRegister.setOnClickListener {
            val intent = Intent(this@RegisterActivity, LoginActivity::class.java)
            startActivity(intent)
        }

        auth = FirebaseAuth.getInstance()
        ref = FirebaseDatabase.getInstance().getReference("USERS")



        binding.btnRegister.setOnClickListener {
            val email = binding.etEmail.text.toString().trim()
            val password = binding.etPassword.text.toString().trim()
            val confirmPassword = binding.etConfirmPassword.text.toString().trim()
            val userName = binding.etUsername.text.toString().trim()
            val phoneNumber = binding.etNumber.text.toString().trim()
            val alamat = binding.etAlamat.text.toString().trim()

            if (email.isEmpty()) {
                binding.etEmail.error = "Email required"
                binding.etEmail.requestFocus()
                return@setOnClickListener
            }
            if (password.isEmpty() || password.length < 6) {
                binding.etPassword.error = "Password required"
                binding.etPassword.requestFocus()
                return@setOnClickListener
            }

            if (confirmPassword.isEmpty()) {
                binding.etConfirmPassword.error = "Confirm Password required"
                binding.etConfirmPassword.requestFocus()
                return@setOnClickListener

            }
            if (confirmPassword != password) {
                binding.etConfirmPassword.error = "Confirm Password Not Match"
                binding.etConfirmPassword.requestFocus()
                return@setOnClickListener
            }
            if (userName.isEmpty()) {
                binding.etUsername.error = "Email required"
                binding.etUsername.requestFocus()
                return@setOnClickListener
            }
            if (phoneNumber.isEmpty()) {
                binding.etNumber.error = "Email required"
                binding.etNumber.requestFocus()
                return@setOnClickListener
            }
            if (alamat.isEmpty()) {
                binding.etAlamat.error = "Email required"
                binding.etAlamat.requestFocus()
                return@setOnClickListener
            }
            registrasiUser(email, password, userName, phoneNumber, alamat)
        }
    }

        private fun registrasiUser(email: String, password: String, userName: String, phoneNumber: String, alamat: String) {
            val progressDialog = ProgressDialog(this@RegisterActivity)
            progressDialog.setTitle("Registratation User")
            progressDialog.setMessage("Please Wait")
            progressDialog.setCanceledOnTouchOutside(false)
            progressDialog.show()
            auth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(this) {
                if (it.isSuccessful) {
//                    Toast.makeText(this, "Registration Succesfull", Toast.LENGTH_SHORT).show()
//                    val intent = Intent(this@RegisterActivity, LoginActivity::class.java)
//                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
//                    startActivity(intent)
                    saveuser(email, userName, phoneNumber, alamat, progressDialog)


                } else {
                    val message = it.exception!!.toString()
                    Toast.makeText(this, "Error : $message", Toast.LENGTH_SHORT).show()

                }
            }
    }

    private fun saveuser(userName: String,
                         email: String,
                         phoneNumber:
                         String,
                         alamat: String, progressDialog: ProgressDialog){
        val currentUserId = auth.currentUser!!.uid
        ref = FirebaseDatabase.getInstance().reference.child("USERS")
        val userMap = HashMap<String,Any>()
        userMap["id"] = currentUserId
        userMap["email"] = email
        userMap["phoneNumber"] = phoneNumber
        userMap["alamat"] = alamat
        userMap["userName"] = userName

        ref.child(currentUserId).setValue(userMap).addOnCompleteListener {
            if (it.isSuccessful){
                progressDialog.dismiss()
                Toast.makeText(this, "register is Successfully", Toast.LENGTH_SHORT).show()

                val intent = Intent(this@RegisterActivity, LoginActivity::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
                startActivity(intent)
            }else {
                val message = it.exception!!.toString()
                Toast.makeText(this, "Error : $message", Toast.LENGTH_SHORT).show()
                progressDialog.dismiss()
            }
        }
    }
}


