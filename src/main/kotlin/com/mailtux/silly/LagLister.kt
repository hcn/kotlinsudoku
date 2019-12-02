package com.mailtux.silly

import java.util.stream.Collectors


class LagLister {

    fun lagLister(): Map<Int, List<Linje>> {
        val linjer = ArrayList<Linje>()
        for (i in 0..9999) {
            linjer.add(Linje(i))
        }

//        return linjer.stream()
//            .collect<Map<Int, List<Linje>>, Any>(Collectors.groupingBy(Function<Linje, Int> { it.getSum() }))

//        Map<Integer, List<Linje>> result =

        val collect = linjer.stream().collect(Collectors.groupingBy(Linje::sum));

        return collect;

    }
}