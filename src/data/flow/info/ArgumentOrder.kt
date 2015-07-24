package data.flow.info.argument_order


fun test(a: () -> Int, b: Int, c: () -> Int) {}


fun test(x: Int?) {
    // in this case both smart cast is corrected
    test({ x }, x!!, { x })
}

