package common.system.complex_system

class In<in I>
class Out<out O>
class Inv<T>

open class Inv1<T>: Inv2<T>()
open class Inv2<T>

fun <X> inv1(x: X): Inv1<X> = null!!
fun <Y> inv2(y: Y): In<Inv2<Y>> = null!!

fun <T> bar(t: T, inT: In<T> ): Inv<T> = null!!

fun test() {
    bar(inv1(2), inv2("")) // type inference failed

    bar<Inv1<Any>>(inv1<Any>(2), inv2<Any>(""))
    bar<Inv2<Any>>(inv1<Any>(2), inv2<Any>(""))

    bar<Inv1<Comparable<Nothing>>>(inv1<Comparable<Nothing>>(2), inv2<Comparable<Nothing>>(""))
    bar<Inv2<Comparable<Nothing>>>(inv1<Comparable<Nothing>>(2), inv2<Comparable<Nothing>>(""))
}

/*
return type: Inv<T>

constrains:
T <: Inv2<X>
T >: Inv1<Y>
X >: Int
Y >: String



 */

