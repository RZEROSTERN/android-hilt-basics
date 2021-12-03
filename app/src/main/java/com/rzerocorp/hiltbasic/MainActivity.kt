package com.rzerocorp.hiltbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carrier = Carrier()
        val simCard = SimCard(carrier)

        val battery = Battery()
        val memoryCard = MemoryCard()

        val smartphone = Smartphone(simCard, battery, memoryCard)
        smartphone.makeACall()
    }
}

class Smartphone(simCard: SimCard, battery: Battery, memoryCard: MemoryCard) {
    fun makeACall() {
        Log.d("Phone", "Making a phone call...")
    }
}

class MemoryCard {

}

class Battery {

}

class SimCard(carrier: Carrier) {

}

class Carrier {

}
