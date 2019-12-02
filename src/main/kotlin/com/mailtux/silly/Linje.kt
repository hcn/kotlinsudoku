package com.mailtux.silly

data class Linje(var l: Int) {

    var l1: Int = 0
    var l2: Int = 0
    var l3: Int = 0
    var l4: Int = 0
    var sum: Int = 0

    init {

        this.l4 = l % 10
        this.l3 = l / 10 % 10
        this.l2 = l / 100 % 10
        this.l1 = l / 1000 % 10

        this.sum = l1 + l2 + l3 + l4
    }

    override fun toString(): String {
        return "$sum: $l1 $l2 $l3 $l4"

    }
}