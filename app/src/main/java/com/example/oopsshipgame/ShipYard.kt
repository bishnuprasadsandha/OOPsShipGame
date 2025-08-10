package com.example.oopsshipgame

class ShipYard {
    fun serviceDestroyer(destroyer: Destroyer){
        destroyer.repairShip()
    }
    fun serviceCarrier(carrier: Carrier){
        carrier.repairShip()
    }
}