package hn.edu.ujcv.pdm_2021_iii_p2_investigacion2.ui.main

import com.google.common.truth.ExpectFailure.assertThat
import com.google.common.truth.TruthFailureSubject
import hn.edu.ujcv.pdm_2021_iii_p2_investigacion2.Validate
import junit.framework.TestCase
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)

class MainFragmentTest : TestCase()

    @Test
fun whenInPutIsValid(){
    val amount = 100
    val desc = "function working properly"
    val result =  Validate.validateInput(amount, desc)

        assertThat(result)?.isEqualTo(true)

}



    @Test
fun whenInPutIsInValid(){
    val amount = 100
    val desc = "function not working properly"
    val result =  Validate.validateInput(amount, desc)

    assertThat(result)!!.isEqualTo(false)

}

fun assertThat(b: Boolean): TruthFailureSubject? {
    TODO("Not yet implemented")
}
