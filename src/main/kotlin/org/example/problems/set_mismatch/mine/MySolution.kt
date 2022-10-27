package org.example.problems.set_mismatch.mine

fun findErrorNums(nums: IntArray): IntArray {
    nums.sort()
    return intArrayOf(duplicatedNum(nums), shouldBeInserted(nums))
}

fun duplicatedNum(nums: IntArray): Int {
    return nums.withIndex()
        .first { (index, value) ->
            value == nums[index + 1]
        }.value
}

fun shouldBeInserted(nums: IntArray): Int {
    return nums.indices
        .map { it + 1 }
        .first { it !in nums }
}
