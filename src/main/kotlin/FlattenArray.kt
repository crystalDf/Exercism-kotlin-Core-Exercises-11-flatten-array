object Flattener {
    fun flatten(source: Collection<Any?>): List<Any> =
            source.map {
                if (it is Collection<Any?>) flatten(it) else listOf(it)
            }.flatten().filterNotNull()
}
