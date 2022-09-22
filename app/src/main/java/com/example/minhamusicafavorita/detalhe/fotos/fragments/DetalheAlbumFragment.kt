package com.example.minhamusicafavorita.detalhe.fotos.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.minhamusicafavorita.*
import com.example.minhamusicafavorita.databinding.FragmentDetalheAlbumBinding
import com.example.minhamusicafavorita.detalhe.fotos.model.Album

class DetalheAlbumFragment : Fragment() {
    private lateinit var binding: FragmentDetalheAlbumBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetalheAlbumBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recuperarExibirDadosAlbum()
        likeAlbum()
    }

    private fun recuperarExibirDadosAlbum() {
        val album = arguments?.getParcelable<Album>(ALBUM_KEY)
        if (album != null){
            binding.tvNomeAlbum.text = album.getNome()
            binding.tvDescricao.text = album.getDescricao()
            binding.tvArtista.text = ARTISTA + album.getArtista()
            binding.tvLancamento.text = LANCAMENTO + album.getLancamento().toString()
            binding.tvGravadora.text = gravadora + album.getGravadora()
            binding.tvEstudio.text = estudio + album.getEstudio()
            binding.tvFormato.text = formato + album.getFormato()
            binding.tvGenero.text = genero + album.getGenero()
        }
    }

    private fun likeAlbum() {
        binding.imCoracao.setOnClickListener {
            Toast.makeText(context, "Album favoritado com sucesso!", Toast.LENGTH_LONG).show()
        }
    }
}