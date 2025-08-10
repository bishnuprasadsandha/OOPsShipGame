package com.example.oopsshipgame

import android.util.Log

abstract class Ship(
    val name: String,
    private var type: String,
    private val maxAttacks: Int,
    private val maxHullIntegrity: Int
) {
    private var destroyer = false
    private var hullIntegrity: Int = 0
    protected var attacksReamining = 0

    init {
        hullIntegrity == this.maxHullIntegrity
        attacksReamining = 1
    }

    fun takeDamage(damageTaken: Int) {
        if (!destroyer) {
            hullIntegrity -= damageTaken
            Log.i("test", "$name is damage taken $damageTaken")
            Log.i("test", "$name integrity is $hullIntegrity")
            if (hullIntegrity <= 0) {
                Log.i("test", "Carrier $name has been destroyer(sunk)")
                destroyer = true
            } else {
                Log.i("test", "Carrier dose not exist")
            }
            Log.i("test", "")
        }
    }
    fun serviceShip(){
        attacksReamining =maxAttacks
        hullIntegrity=maxHullIntegrity
    }
    fun showStatus()
    {
        Log.i("Test","$type $name Attacks remaining :$attacksReamining\nHull : $hullIntegrity")
    }
    abstract fun attack()
}