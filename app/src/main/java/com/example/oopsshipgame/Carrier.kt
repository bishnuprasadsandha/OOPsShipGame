package com.example.oopsshipgame

import android.util.Log

class Carrier(name: String) {
    var name: String = ""
        private set

    val type = "Carrier, Aircraft"
    private var hullIntegrity = 100
    var attacksReamining = 1
        private set

    private var attackPower = 120
    private var destroyer = false

    init {
        this.name = "$type $name"
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

    fun launchAerialAttack(): Int {
        return if (attacksReamining > 0) {
            attacksReamining--
            attackPower
        } else {
            0
        }
    }
    fun shootShel(): Int{
        return if(attacksReamining > 0){
            attacksReamining
            attackPower
        }else{
            0
        }
    }
    fun repairShip(){
        attacksReamining = 20
        hullIntegrity = 200
    }
}