package hn.edu.ujcv.pdm_2021_iii_p2_investigacion2.ui.main

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    // TODO: Implement the ViewModel
    private val USD_TO_HNL = 24.18f
    private var moneyText = ""
    private val MexicanDollar_TO_HNL = 1.20f
    private val CanadianD_TO_HNL = 19.55f

    private var result: Float = 0f

    fun setDollar(value: String) {
        this.moneyText = value
        result = value.toFloat() * USD_TO_HNL
    }
    fun setMexican(value: String) {
        this.moneyText = value
        result = value.toFloat() * MexicanDollar_TO_HNL
    }
    fun setCanadian(value: String) {
        this.moneyText = value
        result = value.toFloat() * CanadianD_TO_HNL
    }
    fun getResults(): Float?{
        return result
    }

}