package co.matheusabreu.intentextras

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import co.matheusabreu.intentextras.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonOk.setOnClickListener {
            val nome = binding.editNome.text.toString()

            val i = Intent(this, MainActivity2::class.java)
            i.putExtra("nome", nome)
            startActivity(i)
        }
    }
}