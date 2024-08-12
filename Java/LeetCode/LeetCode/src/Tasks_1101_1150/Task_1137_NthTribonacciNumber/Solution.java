package Tasks_1101_1150.Task_1137_NthTribonacciNumber;

/**
 * @apiNote https://leetcode.com/problems/n-th-tribonacci-number/description
 *Description
 * The Tribonacci sequence Tn is defined as follows:
 * T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
 * Given n, return the value of Tn.
 *      Example 1:
 * Input: n = 4
 * Output: 4
 * Explanation:
 * T_3 = 0 + 1 + 1 = 2
 * T_4 = 1 + 1 + 2 = 4
 *      Example 2:
 * Input: n = 25
 * Output: 1389537
 *      Constraints:
 * <li><code>0 &lt;= n &lt;= 37</code></li>
 * <li>The answer is guaranteed to fit within a 32-bit integer, ie. <code>answer &lt;= 2^31 - 1</code>.</li>
 *
 *          Solutions
 *      Solution 1: Dynamic Programming
 * According to the recurrence relation given in the problem, we can use dynamic
 * programming to solve it.
 * We define three variables: a, b, c to represent T(n-3), T(n-2), T(n-1),
 * respectively, with initial values of 0, 1, 1.
 * Then we decrease n to 0, updating the values of a, b, c each time, until n is 0,
 * at which point the answer is a.
 * The time complexity is O(n), and the space complexity is O(1).
 * Here, n is the given integer.
 *
 *      Solution 2: Matrix Exponentiation to Accelerate Recurrence
 * We define Tib(n) as a 1 x 3 matrix $\begin{bmatrix} T_n & T_{n - 1} & T_{n - 2}
 * \end{bmatrix}$, where T(n), T(n-1),and T(n-2)
 * represent the $n$th, $(n - 1)$th and $(n - 2)$th Tribonacci numbers, respectively.
 * We hope to derive Tib(n) from $Tib(n-1) = \begin{bmatrix}
 * T_{n - 1} & T_{n - 2} & T_{n - 3} \end{bmatrix}$.
 * That is, we need a matrix base such that
 * Tib(n-1)xbase = Tib(n), i.e., [T(n-1) T(n-2) T(n-3)] x base = [T(n) T(n-1) T(n-2)]
 * Since T(n) = T(n-1)+T(n-2)+T(n-3), the matrix base is:
 *      [1 1 0]
 *      [1 0 1]
 *      [1 0 0]
 * We define the initial matrix $res = \begin{bmatrix} 1 & 1 & 0 \end{bmatrix}$, then
 * T(n) is equal to the sum of all elements in the result matrix of multiplied by
 * base^(n-3). This can be solved using matrix exponentiation.
 * The time complexity is O(log n), and the space complexity is O(1).
 */
public class Solution {
        public static void main(String[] args) {
        int n1 = 4;
        int n2 = 25;
        System.out.println(tribonacci(n1));
        System.out.println(tribonacciMatrix(n1));
        System.out.println(tribonacci(n2));
        System.out.println(tribonacciMatrix(n2));
    }
    public static int tribonacci(int n) {
        int a = 0, b = 1, c = 1;
        while (n-- > 0) {
            int d = a + b + c;
            a = b;
            b = c;
            c = d;
        }
        return a;
    }
    public static int tribonacciMatrix(int n) {
        if (n == 0) {
            return 0;
        }
        if (n < 3) {
            return 1;
        }
        int[][] a = {{1, 1, 0}, {1, 0, 1}, {1, 0, 0}};
        int[][] result = pow(a, n - 3);
        int answer = 0;
        for (int x : result[0]) {
            answer += x;
        }
        return answer;
    }
    private static int[][] mul(int[][] a, int[][] b) {
            int m = a.length, n = b[0].length;
            int[][] c = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < b.length; k++) {
                        c[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
            return c;
    }
    private static int[][] pow(int[][] a, int n) {
            int[][] result = {{1, 1, 0}};
            while (n > 0) {
                if ((n & 1) == 1) {
                    result = mul(result, a);
                }
                a = mul(a, a);
                n >>= 1;
            }
            return result;
    }
}
