package common.system.overload_system

fun <T> foo() : T = null!!

fun String.bar() {}

fun Any.bar() {}




fun bas(s: String) {}
fun bas(a: Any) {}

fun test() {
    foo().bar() // String.bar()

    bas(foo()) // now, resolved to bas(String)
}
