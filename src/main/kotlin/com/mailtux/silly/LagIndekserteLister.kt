package com.mailtux.silly

import java.util.*
import java.util.stream.Collectors


class LagIndekserteLister {

    fun lagLister(): Map<ListeIndex, List<Linje>> {
        val linjer = ArrayList<Linje>()
        for (i in 0..9999) {
            linjer.add(Linje(i))
        }
        val c:Map<ListeIndex, List<Linje>> = linjer.stream()
            .collect(Collectors.groupingBy {ListeIndex(it.sum, it.l1) });
        return c;
    }

    fun lag2Lister(): Map<Liste2Index, List<Linje>> {
        val linjer = ArrayList<Linje>()
        for (i in 0..9999) {
            linjer.add(Linje(i))
        }
        val c:Map<Liste2Index, List<Linje>> = linjer.stream()
            .collect(Collectors.groupingBy {Liste2Index(it.sum, it.l1,it.l2) });
        return c;
    }

    class ListeIndex(val sum: Int, val forste: Int) {

        override fun hashCode(): Int {
            return Objects.hash(sum, forste)
        }

        override fun equals(o: Any?): Boolean {
            val l = o as ListeIndex?
            return this.sum == l!!.sum && this.forste == l.forste
        }
    }

    class Liste2Index(val sum: Int, val forste: Int,val andre:Int) {

        override fun hashCode(): Int {
            return Objects.hash(sum, forste,andre)
        }

        override fun equals(o: Any?): Boolean {
            val l = o as Liste2Index?
            return this.sum == l!!.sum && this.forste == l.forste && this.andre==l.andre
        }
    }

}