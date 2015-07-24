package data.flow.info.get_nothing

fun getNothing(): Nothing = null!!


fun bar(a: Any, b: Any) {}

fun test() {
    getNothing()


    println()
}


fun test2() {
    bar(getNothing(), 3)

    println()
}

fun test3() {
    bar({getNothing()}// lambda should have error 'unreachable code'
            , getNothing())
}