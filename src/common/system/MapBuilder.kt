package common.system.map_builder


class MapBuilder<K, V> {
    fun default(f: (K) -> V): MapBuilder<K, V> = this

    fun put(k: K, v: V): MapBuilder<K, V> = this

    fun build(): Map<K, V> = null!!
}


val a = MapBuilder().default{ it + 1 } // here we can't analyse lambda, before we get expectedType
        .put(1, 2).build()