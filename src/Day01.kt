fun main() {
    fun part1(input: List<String>): Int {
        val regex = Regex("[^0-9]")
        val result = input.map { it.replace(regex, "") }
        val finalList: MutableList<Int> = mutableListOf()
        result.map {
            finalList.add("${it.first()}${it.last()}".toInt())
        }
        var count = 0
        finalList.forEach { count += it }
        return count
    }

//    fun part2(input: List<String>): Int {
//        return input.size
//    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test")
    check(part1(testInput) == 77)

    val input = readInput("Day01")
    part1(input).println()
//    part2(input).println()
}
