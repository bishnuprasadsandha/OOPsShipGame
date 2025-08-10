package com.example.oopsshipgame

import android.util.Log

class Destroyer(name: String) {

    var name : String =""
        private set
    val type = "Destroyer"
    var ammo = 1

    //no external access
    private var hullIntegrity = 200
    private var shotPower = 60
    private var destroyer =  false

    init {
       this.name = "$type $name"
    }

    fun takeDamage(damageTaken: Int){
        if (!destroyer) {
            hullIntegrity -= damageTaken
            Log.i("test", "$name is damage taken $damageTaken")
            Log.i("test", "$name integrity is $hullIntegrity")
            if (hullIntegrity <= 0) {
                Log.i("test", "Destroyer $name has been destroyer(sunk)")
                destroyer = true
            } else {
                Log.i("test", "Ship dose not exist")
            }
        }
    }
    fun shootShel(): Int{
        return if(ammo > 0){
            ammo --
            shotPower
        }else{
            0
        }
    }

    fun repairShip(){
        ammo = 10
        hullIntegrity =100
    }
}