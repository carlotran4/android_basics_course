package com.example.diceroller
import junit.framework.Assert.assertTrue
import org.junit.Test
/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun generates_number(){
        val dice = Dice(6)
        val rollresult = dice.roll()
        assertTrue("was between 1 and 6", rollresult in 1..6)
    }
}