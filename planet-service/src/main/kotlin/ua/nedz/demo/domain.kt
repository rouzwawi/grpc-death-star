package ua.nedz.demo

import kotlin.random.Random
import kotlin.random.nextInt

data class Planet (val id: Long, val name: String, val weight: Long, var isAlive: Boolean = true)

fun randomName() = PlanetRepo.names[Random.nextInt(1..PlanetRepo.names.size) - 1]

fun randomWeight(): Long =
        when (Random.nextInt(0..100)) {
            in 0..4 -> 500
            in 5..14 -> 200
            in 15..29 -> 100
            in 30..49 -> 50
            in 50..74 -> 20
            in 75..100 -> 10
            else -> 0
        }