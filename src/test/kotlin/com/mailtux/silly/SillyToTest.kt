package com.mailtux.silly

import com.mailtux.util.NanoClock
import org.junit.Ignore
import org.junit.Test
import kotlin.test.assertEquals

class SillyToTest {

    companion object {
        val map= LagLister().lagLister();
        val indeksertMap = LagIndekserteLister().lagLister();
    }


    @Test
    fun test0(){
        var l = doit(0)
        assertEquals(1,l);
    }



    @Test
    fun test1(){
        var l = doit(1)
        assertEquals(8,l);
    }

    @Test
    fun test2(){
        var l = doit(2)
        assertEquals(48,l);
    }

    @Test
    fun test3(){
        var l = doit(3)
        assertEquals(200,l);
    }

    @Test
    fun test4(){
        var l = doit(4)
        assertEquals(675,l);
    }

    @Test
    fun test5(){
        var l = doit(5)
        assertEquals(1904,l);
    }

    @Test
    fun test6(){
        var l = doit(6)
        assertEquals(4736,l);
    }

    @Test
    fun test10(){
        var klokke:NanoClock= NanoClock();
        klokke.start();
        var l = doit(10)
        klokke.slutt();
        println(klokke.sekunder())
        assertEquals(76976,l);
        assertEquals(538813342,SillyTo.antallTestet.ant)
    }

    @Test
    fun test18(){
        var klokke:NanoClock= NanoClock();
        klokke.start();
        var l = doit(18)
        klokke.slutt();
        assertEquals(766736,l);
    }

    @Test
    @Ignore
    fun alle(){
        var klokke:NanoClock= NanoClock();
        for (i in 0..map.size-1) {
            klokke.start();
            var l = doit(i)
            klokke.slutt();
            println(i)
            println(klokke.sekunder())
        }
    }

    private fun doit(ix:Int): Long {
        val linjer: List<Linje>? = map.get(ix);

        var l = if (linjer != null) SillyTo().lagKvadrater(ix, linjer,
            indeksertMap
        ) else 0;
        return l
    }
}