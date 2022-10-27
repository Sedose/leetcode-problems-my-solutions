package org.example.problems.set_mismatch.i_like.with_sorting

fun findErrorNums(nums: IntArray): IntArray {
    nums.sort()
    var duplicated = -1
    var shouldBeInserted = 1
    for (i in 1 until nums.size) {
        val current = nums[i]
        val previous = nums[i - 1]
        if (current == previous) {
            duplicated = current
        } else if (current - previous > 1) {
            shouldBeInserted = previous + 1
        }
    }
    return intArrayOf(duplicated, if (nums.last() == nums.size) shouldBeInserted else nums.size)
}
