package com.example.oopsshipgame

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val friendlyDestroyer = Destroyer("Amit")
        val friendlyCarrier = Carrier("sonu")

        val enemyDestroyer = Destroyer("Kotliner")
        val enemyCarrier = Carrier("Winesh")

        val friendlyShipYard = ShipYard()


        //Start War !!!
        friendlyDestroyer.takeDamage(enemyDestroyer.shootShel())
        friendlyDestroyer.takeDamage(enemyCarrier.launchAerialAttack())

        //Fight Back
        enemyCarrier.takeDamage(friendlyCarrier.launchAerialAttack())
        enemyCarrier.takeDamage(friendlyDestroyer.shootShel())

        //Take Shot of supplies suitation
        Log.i("test","${friendlyDestroyer.name} ammo = ${friendlyDestroyer.ammo}")
        Log.i("test","${friendlyCarrier.name} ammo = ${friendlyCarrier.attacksReamining}")


        //Go to the Shipyard
        friendlyShipYard.serviceCarrier(friendlyCarrier)
        friendlyShipYard.serviceDestroyer(friendlyDestroyer)

        Log.i("test","${friendlyDestroyer.name} ammo = ${friendlyDestroyer.ammo}")
        Log.i("test","${friendlyCarrier.name} ammo = ${friendlyCarrier.attacksReamining}")

        //End the Battle by attacking enemy
        enemyDestroyer.takeDamage(friendlyCarrier.launchAerialAttack())
        enemyDestroyer.takeDamage(friendlyDestroyer.shootShel())
        enemyDestroyer.takeDamage(friendlyDestroyer.shootShel())
    }
}