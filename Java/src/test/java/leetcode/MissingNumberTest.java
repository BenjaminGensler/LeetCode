// ===== Java/src/test/java/leetcode/MissingNumberTest.java =====
package leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class MissingNumberTest {

    // One row per case: input array, expected answer. Add the rest from the tests list.
    static Stream<Arguments> cases() {
        return Stream.of(
                Arguments.of(new int[] {3, 0, 1}, 2),
                Arguments.of(new int[] {0, 1}, 2),
                Arguments.of(new int[] {9,6,4,2,3,5,7,0,1}, 8),
                Arguments.of(new int[] {0}, 1),
                Arguments.of(new int[] {1}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("cases")
    void bySum(int[] nums, int expected) {
        assertEquals(expected, MissingNumber.bySum(nums));
    }

    @ParameterizedTest
    @MethodSource("cases")
    void byXor(int[] nums, int expected) {
        assertEquals(expected, MissingNumber.byXor(nums));
    }

    @Test
    void bySumDoesNotOverflow() {
        int n = 50_000;
        int missing = 12_345;
        int[] nums = IntStream.rangeClosed(0, n).filter(x -> x != missing).toArray();

        assertEquals(missing, MissingNumber.bySum(nums));
    }
}