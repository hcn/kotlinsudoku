package com.mailtux.util

class NanoClock {

    var sumTid: Long=0;

    var startTid: Long=0;

    fun start(){
        startTid=System.nanoTime();

    }

    fun slutt(){
        sumTid=sumTid+(System.nanoTime()-startTid) ;
    }

    fun sekunder():Long{
        return sumTid/1000000000;
    }
}