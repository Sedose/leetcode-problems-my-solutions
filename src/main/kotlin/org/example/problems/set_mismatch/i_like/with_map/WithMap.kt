package org.example.problems.set_mismatch.i_like.with_map

fun findErrorNums(nums: IntArray): IntArray {
    val map = hashMapOf<Int, Int>()
    nums.forEach {
        map[it] = map.getOrDefault(it, 0) + 1
    }
    var duplicated = -1
    var missing = -1
    for (i in 1..nums.size) {
        val value = map[i]
        if (value == null) {
            missing = i
        } else if (value == 2) {
            duplicated = i
        }
    }
    return intArrayOf(duplicated, missing)
}
