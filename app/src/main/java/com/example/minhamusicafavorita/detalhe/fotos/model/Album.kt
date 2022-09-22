package com.example.minhamusicafavorita.detalhe.fotos.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class Album(
    private var imagem: Int,
    private var nome: String,
    private var descricao: String,
    private var artista: String,
    private var lancamento: Int,
    private var gravadora: String,
    private var estudio: String,
    private var formato: String,
    private var genero: String
) : Parcelable{

    fun getImage() = this.imagem
    fun getNome() = this.nome
    fun getDescricao() = this.descricao
    fun getArtista() = this.artista
    fun getLancamento() = this.lancamento
    fun getGravadora() = this.gravadora
    fun getEstudio() = this.estudio
    fun getFormato() = this.formato
    fun getGenero() = this.genero
}