package com.example.lab_6

/**
 * a wizard that casts spells using mana
 *
 * each spell costs mana and spell power decides how much damge it does
 *
 * @property name the wizards name
 * @property mana how much mana the wizzard has left
 * @property spellPower base power used to work out damage
 */
class Wizard(val name: String, var mana: Int, var spellPower: Int) {

    /**
     * casts a spell and returns the damage
     *
     * explosion costs 10 mana and does 3x spellPower
     * frostbite costs 5 mana and does 2x spellPower
     * if theres not enuf mana or the spell dosent exist it returns 0
     *
     * @param spell name of the spell to cast
     * @return damage delt or 0 if the spell fails
     */
    fun castSpell(spell: String): Int {
        when (spell) {
            "Explosion" -> {
                if (mana >= 10) {
                    mana -= 10
                    return spellPower * 3
                } else return 0 // not enuf mana
            }
            "Frostbite" -> {
                if (mana >= 5) {
                    mana -= 5
                    return spellPower * 2
                } else return 0 // not enuf mana
            }
            else -> {
                return 0 // not a real spell
            }
        }
    }
}