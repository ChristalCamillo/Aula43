package com.example.minhamusicafavorita.detalhe.detalheActivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.minhamusicafavorita.R
import com.example.minhamusicafavorita.databinding.ActivityDetalheBinding
import com.example.minhamusicafavorita.detalhe.adapter.DetalherPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator

class DetalheActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetalheBinding
    private val listaTitulos = listOf("Informações", "Fotos")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetalheBinding.inflate(layoutInflater)
        setContentView(binding.root)

        exibirAppBarCustomizada()
        exibirViewPagerTabLayout()

    }
    private fun exibirAppBarCustomizada() {
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setTitle(R.string.detalhe_name)
    }

    private fun exibirViewPagerTabLayout() {
        val informacoesPagerAdapter =
            DetalherPagerAdapter(supportFragmentManager, lifecycle, listaTitulos)
        binding.vpDetalhesDaBanda.adapter = informacoesPagerAdapter

        TabLayoutMediator(binding.tlDetalhesDaBanda, binding.vpDetalhesDaBanda) { tab, posicao ->
            tab.text = listaTitulos[posicao]
        }.attach()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            this.finish()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}