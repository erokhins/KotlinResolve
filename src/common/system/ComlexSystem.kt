package common.system.complex_system

class In<in I>
class Out<out O>
class Inv<T>

open class Inv1<T>
open class Inv2<T> : Inv1<T>()

fun <X> inv1(x: X): In<Inv1<X>> = null!!
fun <Y> inv2(y: Y): Inv2<Y> = null!!

fun <T> bar(t: In<T>, inT: T): Inv<T> = null!!

fun test() {
    bar(inv1(2), inv2("")) // type inference failed

    bar<Inv1<Any>>(inv1<Any>(2), inv2<Any>(""))
    bar<Inv2<Any>>(inv1<Any>(2), inv2<Any>(""))

    bar<Inv1<Comparable<Nothing>>>(inv1<Comparable<Nothing>>(2), inv2<Comparable<Nothing>>(""))
    bar<Inv2<Comparable<Nothing>>>(inv1<Comparable<Nothing>>(2), inv2<Comparable<Nothing>>(""))

    val a: Inv<in Inv2<in Int>> = bar(inv1(2), inv2(""))
}

/*
return type: Inv<T>

constrains:
T <: Inv1<X>
T >: Inv2<Y>
X >: Int
Y >: String



 */

