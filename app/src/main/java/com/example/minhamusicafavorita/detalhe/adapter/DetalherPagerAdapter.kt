package com.example.minhamusicafavorita.detalhe.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.minhamusicafavorita.detalhe.fotos.FotosFragment
import com.example.minhamusicafavorita.detalhe.informacoes.InformacoesFragment

class DetalherPagerAdapter (fragmentManager: FragmentManager,
                            lifecycle: Lifecycle,
                            private var listaTitulos: List<String>
) : FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int = listaTitulos.size

    override fun createFragment(position: Int): Fragment {
        when(position){
            0 -> return InformacoesFragment()
            1 -> return FotosFragment()
        }

        return InformacoesFragment()
    }
}