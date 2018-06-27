package com.example.admin.kotlinstudy

import org.junit.Test

import org.junit.Assert.*
import java.util.ArrayList

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
//        assertEquals(4, 2 + 2)
        println(sum(1,3))
        var a:Boolean = false
        a = true
        println(a)
        val args:ArrayList<String> = ArrayList()
        args.add("1")
//        printInt("aaa").toString()
    }

    fun sum(a: Int, b:Int) = (a + b).toString()
    fun printInt(str:String): Int?{
        return null
    }
}
