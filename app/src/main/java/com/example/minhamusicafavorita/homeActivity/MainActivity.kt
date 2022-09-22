package com.example.minhamusicafavorita.homeActivity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.minhamusicafavorita.databinding.ActivityMainBinding
import com.example.minhamusicafavorita.detalhe.detalheActivity.DetalheActivity

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnVerDetalhes.setOnClickListener {
            irParaDetalheActivity()
        }
    }

    private fun irParaDetalheActivity() {
        val intent = Intent(this, DetalheActivity::class.java)
        startActivity(intent)
    }
}