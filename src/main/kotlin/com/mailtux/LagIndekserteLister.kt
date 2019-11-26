package com.mailtux

import java.util.Objects
import java.util.stream.Collectors
import java.util.ArrayList


class LagIndekserteLister {

    fun lagLister(): Map<ListeIndex, List<Linje>> {
        val linjer = ArrayList<Linje>()
        for (i in 0..9999) {
            linjer.add(Linje(i))
        }

//        return linjer.stream()
//            .collect<Map<ListeIndex, List<Linje>>, Any>(Collectors.groupingBy { x -> ListeIndex(x.sum, x.forste) })
        val c:Map<ListeIndex, List<Linje>> = linjer.stream()
            .collect(Collectors.groupingBy { x -> ListeIndex(x.sum, x.l1) });
        return c;

//        Map<ListeIndex, List<Linje>> result =
//        linjer.stream().collect(Collectors.groupingBy(x->new ListeIndex(x.getSum(),x.getForste())));
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

}