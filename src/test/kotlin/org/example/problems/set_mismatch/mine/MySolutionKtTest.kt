package org.example.problems.set_mismatch.mine

import io.kotest.core.spec.style.FunSpec
import io.kotest.core.tuple
import io.kotest.matchers.shouldBe

class MySolutionKtTest: FunSpec({

    listOf(
        tuple(intArrayOf(1,2,2,4), intArrayOf(2,3)),
        tuple(intArrayOf(1,2,3,3), intArrayOf(3,4)),
        tuple(intArrayOf(1,1,3,4), intArrayOf(1,2)),
        tuple(intArrayOf(2,2,3,4), intArrayOf(2,1)),
        tuple(intArrayOf(2,2), intArrayOf(2,1)),
        tuple(intArrayOf(1,2,4,4), intArrayOf(4,3)),
    ).forEach { (inputArray, expected) ->
        println("inputArray: ${inputArray.toList()}")
        println("expected: ${expected.toList()}")
        test("should work") {
            findErrorNums(inputArray) shouldBe expected
        }
    }
})
