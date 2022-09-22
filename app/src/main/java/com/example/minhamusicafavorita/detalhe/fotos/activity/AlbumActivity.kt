package com.example.minhamusicafavorita.detalhe.fotos.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.minhamusicafavorita.databinding.ActivityAlbumBinding
import com.example.minhamusicafavorita.detalhe.fotos.fragments.DetalheAlbumFragment
import com.example.minhamusicafavorita.detalhe.fotos.model.Album

class AlbumActivity: AppCompatActivity() {
    private lateinit var binding: ActivityAlbumBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAlbumBinding.inflate(layoutInflater)
        setContentView(binding.root)
        acessarAlbuns()
    }

    private fun acessarAlbuns() {
        val album = intent.getParcelableExtra<Album>("Album")
        if(album != null){
            enviarAlbumDetalheAlbumFragment(album)
        }
    }

    private fun enviarAlbumDetalheAlbumFragment(album: Album) {
        val albumClicado = DetalheAlbumFragment().apply {
            arguments = Bundle().apply {
                putParcelable("Album", album)
            }
        }
        supportFragmentManager
            .beginTransaction()
            .add(binding.container.id, albumClicado)
            .addToBackStack("DetalheAlbum")
            .commit()
    }
}
