package hn.edu.ujcv.pdm_2021_iii_p2_investigacion2

import android.icu.util.CurrencyAmount

object Validate {
    fun validateInput (amount: Int, desc:String): Boolean{
        return  !(amount <= 0 || desc.isEmpty())

    }
}