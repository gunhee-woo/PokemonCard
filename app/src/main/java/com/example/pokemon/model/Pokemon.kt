package com.example.pokemon.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@Entity
@JsonClass(generateAdapter = true)
data class Pokemon(
    @field:Json(name = "id") @PrimaryKey val id: Int,
    @field:Json(name = "name") val name: String,
    @field:Json(name = "base_experience") val experience: Int,
    @field:Json(name = "height") val height: Int,
    @field:Json(name = "weight") val weight: Int,
    @field:Json(name = "abilities") val abilities: List<PokemonAbility>,
    @field:Json(name = "stats") val stats: List<PokemonStat>,
    @field:Json(name = "types") val types: List<PokemonType>
)

@JsonClass(generateAdapter = true)
data class PokemonAbility(
    @field:Json(name = "is_hidden") val isHidden: Boolean,
    @field:Json(name = "slot") val slot: Int,
    @field:Json(name = "ability") val ability: NamedApiResource
)

@JsonClass(generateAdapter = true)
data class PokemonStat(
    @field:Json(name = "base_stat") val base_stat: Int,
    @field:Json(name = "effort") val effort: Int,
    @field:Json(name = "stat") val stat: NamedApiResource,
)

@JsonClass(generateAdapter = true)
data class PokemonType(
    @field:Json(name = "slot") val slot: Int,
    @field:Json(name = "type") val type: NamedApiResource
)

@JsonClass(generateAdapter = true)
data class NamedApiResource(
    @field:Json(name = "name") val name: String,
    @field:Json(name = "url") val url: String
)