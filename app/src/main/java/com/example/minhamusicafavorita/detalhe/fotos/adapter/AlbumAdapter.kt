package com.example.minhamusicafavorita.detalhe.fotos.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.minhamusicafavorita.databinding.AlbumItemBinding
import com.example.minhamusicafavorita.detalhe.fotos.model.Album

class AlbumAdapter(
    private var listaAlbuns: MutableList<Album>,
    private val clickAlbum: (album : Album) -> Unit
) : RecyclerView.Adapter<AlbumAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = AlbumItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val mistkiAlbum = listaAlbuns[position]
        holder.adicionarInformacoesView(mistkiAlbum)
        holder.binding.cvItemLista.setOnClickListener {
            clickAlbum(mistkiAlbum)
        }
    }

    override fun getItemCount() = listaAlbuns.size

    fun atualizarListaAlbum(novaLista: MutableList<Album>) {
        if (listaAlbuns.size == 0) {
            listaAlbuns = novaLista
        } else {
            listaAlbuns.addAll(novaLista)
        }
        notifyDataSetChanged()
    }

    class ViewHolder(val binding: AlbumItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun adicionarInformacoesView(album: Album){
            binding.ivAlbum.setImageResource(album.getImage())
        }
    }
}