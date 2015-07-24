package in_long


interface In<out I>


fun <T> inT(t: T): In<T> = null!!

fun <X> bar(i: In<Comparable<X>>): X = null!!

fun <T> bas(t: T): T = t


fun test(b: Int) {
    val a: Long = bar<Long>(inT<Long>(1))

    val c: Comparable<Long> = bas<Long>(2)
}
