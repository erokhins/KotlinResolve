


fun foo(a: Any) {}
fun foo(a: () -> Int) {}

fun bar(a: Any) {}
fun bar(a: (Int, Int) -> Int) {}

fun test() {
    foo({ }) // to () -> Int

    bar({ 4}) // must be resolved to (Int, Int) -> Int

}