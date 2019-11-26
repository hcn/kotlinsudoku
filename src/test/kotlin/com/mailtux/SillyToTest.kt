package com.mailtux

import org.junit.Test
import kotlin.test.assertEquals

class SillyToTest {

    companion object {
        val map=LagLister().lagLister();
        val indeksertMap = LagIndekserteLister().lagLister();
    }

//    map=LagLister().lagLister();
//    private static Map<LagIndekserteLister.ListeIndex, List<Linje>> indeksertMap;
//
//    @BeforeClass
//    public static void before(){
//        Map<Integer, List<Linje>> map = new LagLister().lagLister();
//        Map<LagIndekserteLister.ListeIndex, List<Linje>> indeksertMap = new LagIndekserteLister().lagLister();
//        SillyToTest.map=map;
//        SillyToTest.indeksertMap=indeksertMap;
//    }

    @Test
    fun test0(){
        val linjer= map.get(0);

        var l = linjer?.let { SillyTo().lagKvadrater(0, it,indeksertMap) };
        assertEquals(1,l);
    }

    @Test
    fun test1(){
        val linjer = map.get(1);

        var l = linjer?.let { SillyTo().lagKvadrater(1, it,indeksertMap) };
        assertEquals(8,l);
    }
//
//    @Test
//    public void test2(){
//        List<Linje> linjer = map.get(2);
//
//        long l = new SillyTo().lagKvadrater(2, linjer,indeksertMap);
//        assertEquals(48,l);
//    }
//
//    @Test
//    public void test3(){
//        List<Linje> linjer = map.get(3);
//
//        long l = new SillyTo().lagKvadrater(3, linjer,indeksertMap);
//        assertEquals(200,l);
//    }
//
//    @Test
//    public void test4(){
//        List<Linje> linjer = map.get(4);
//
//        long l = new SillyTo().lagKvadrater(4, linjer,indeksertMap);
//        assertEquals(675,l);
//    }
//
//    @Test
//    public void test5(){
//        List<Linje> linjer = map.get(5);
//
//        long l = new SillyTo().lagKvadrater(5, linjer,indeksertMap);
//        assertEquals(1904,l);
//    }
//
//    @Test
//    public void test6(){
//        List<Linje> linjer = map.get(6);
//
//        long l = new SillyTo().lagKvadrater(6, linjer,indeksertMap);
//        assertEquals(4376,l);
//    }
//
//    @Test
//    public void test10(){
//        List<Linje> linjer = map.get(10);
//
//        long l = new SillyTo().lagKvadrater(10, linjer,indeksertMap);
//        assertEquals(76976,l);
//    }
//
//    @Test
//    public void test18(){
//        List<Linje> linjer = map.get(18);
//
//        long l = new SillyTo().lagKvadrater(18, linjer,indeksertMap);
//        assertEquals(766736,l);
//    }

}