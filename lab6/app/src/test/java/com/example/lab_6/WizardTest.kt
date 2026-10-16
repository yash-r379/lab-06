package com.example.lab_6

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class WizardTest {

    private lateinit var evilWizard: Wizard

    // make a fresh wizard before evry test
    @Before
    fun setUp() {
        evilWizard = Wizard("Evil Wizard", 30, 10)
    }

    @Test
    fun castSpell_explosion_successful() {
        val damageDealt = evilWizard.castSpell("Explosion")

        assertEquals(30, damageDealt) // 10 spellPower times 3 is 30

        assertEquals(20, evilWizard.mana) // 30 mana minus 10 is 20
    }

    @Test
    fun castSpell_explosion_unsuccessful() {
        evilWizard.mana = 5 // not enuf mana for explosion
        val damageDealt = evilWizard.castSpell("Explosion")

        assertEquals(0, damageDealt)

        assertEquals(5, evilWizard.mana) // mana shoud still be 5
    }

    @Test
    fun castSpell_frostbite_successful() {
        val damageDealt = evilWizard.castSpell("Frostbite")

        assertEquals(20, damageDealt) // 10 spellPower times 2 is 20

        assertEquals(25, evilWizard.mana) // 30 mana minus 5 is 25
    }

    @Test
    fun castSpell_frostbite_unsuccessful() {
        evilWizard.mana = 3 // not enuf mana for frostbite
        val damageDealt = evilWizard.castSpell("Frostbite")

        assertEquals(0, damageDealt)

        assertEquals(3, evilWizard.mana) // mana shoud still be 3
    }
}