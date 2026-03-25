package phase1.bigo

/**
 * ============================================================
 *  BÀI TẬP THỰC HÀNH: BIG-O NOTATION
 * ============================================================
 *
 * Yêu cầu:
 * 1. Hoàn thành các hàm bên dưới
 * 2. Phân tích Time & Space Complexity cho mỗi hàm
 * 3. Chạy main() để kiểm tra kết quả
 */

fun main() {
    println("=== BÀI TẬP BIG-O ===")
    println()

    // Bài 1: Tính giai thừa
    println("--- Bài 1: Giai thừa ---")
    println("  5! = ${factorial(5)}")           // Expected: 120
    println("  10! = ${factorial(10)}")          // Expected: 3628800
    println()

    // Bài 2: Fibonacci
    println("--- Bài 2: Fibonacci ---")
    println("  fib(0) = ${fibonacci(0)}")        // Expected: 0
    println("  fib(1) = ${fibonacci(1)}")        // Expected: 1
    println("  fib(10) = ${fibonacci(10)}")      // Expected: 55
    println("  fib(20) = ${fibonacci(20)}")      // Expected: 6765
    println()

    // Bài 3: Ước chung lớn nhất (GCD)
    println("--- Bài 3: GCD (Thuật toán Euclid) ---")
    println("  gcd(12, 8) = ${gcd(12, 8)}")     // Expected: 4
    println("  gcd(100, 75) = ${gcd(100, 75)}") // Expected: 25
    println("  gcd(17, 5) = ${gcd(17, 5)}")     // Expected: 1
    println()

    // Bài 4: Kiểm tra số nguyên tố
    println("--- Bài 4: Số nguyên tố ---")
    println("  isPrime(2) = ${isPrime(2)}")      // Expected: true
    println("  isPrime(7) = ${isPrime(7)}")      // Expected: true
    println("  isPrime(10) = ${isPrime(10)}")    // Expected: false
    println("  isPrime(97) = ${isPrime(97)}")    // Expected: true
    println()

    // Bài 5: Luỹ thừa nhanh
    println("--- Bài 5: Luỹ thừa nhanh ---")
    println("  power(2, 10) = ${fastPower(2, 10)}")  // Expected: 1024
    println("  power(3, 5) = ${fastPower(3, 5)}")    // Expected: 243
    println("  power(5, 0) = ${fastPower(5, 0)}")    // Expected: 1
    println()
}

/**
 * Bài 1: Tính n! (giai thừa)
 *
 * Ví dụ: 5! = 5 × 4 × 3 × 2 × 1 = 120
 *
 * Gợi ý: Dùng đệ quy hoặc vòng lặp
 * Time Complexity:  O(?)  ← Hãy phân tích
 * Space Complexity: O(?)  ← Hãy phân tích
 */
fun factorial(n: Int): Long {
    // TODO: Viết code ở đây
    return -1
}

/**
 * Bài 2: Tính số Fibonacci thứ n
 *
 * Dãy: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...
 * fib(0) = 0, fib(1) = 1
 * fib(n) = fib(n-1) + fib(n-2)
 *
 * ⚠️ YÊU CẦU: Dùng VÒNG LẶP, KHÔNG dùng đệ quy naive (vì O(2ⁿ) quá chậm!)
 * Time Complexity:  O(?)  ← Hãy phân tích
 * Space Complexity: O(?)  ← Hãy phân tích
 */
fun fibonacci(n: Int): Long {
    // TODO: Viết code ở đây
    return -1
}

/**
 * Bài 3: Tìm ước chung lớn nhất (GCD) bằng thuật toán Euclid
 *
 * Thuật toán Euclid: gcd(a, b) = gcd(b, a % b), dừng khi b = 0
 * Ví dụ: gcd(12, 8) → gcd(8, 4) → gcd(4, 0) → 4
 *
 * Time Complexity:  O(?)  ← Hãy phân tích
 * Space Complexity: O(?)  ← Hãy phân tích
 */
fun gcd(a: Int, b: Int): Int {
    // TODO: Viết code ở đây
    return -1
}

/**
 * Bài 4: Kiểm tra số nguyên tố
 *
 * Số nguyên tố là số > 1, chỉ chia hết cho 1 và chính nó.
 *
 * Gợi ý: Chỉ cần kiểm tra từ 2 đến √n (không cần đến n)
 * Vì nếu n = a × b, thì a hoặc b phải ≤ √n
 *
 * Time Complexity:  O(?)  ← Hãy phân tích
 * Space Complexity: O(?)  ← Hãy phân tích
 */
fun isPrime(n: Int): Boolean {
    // TODO: Viết code ở đây
    return false
}

/**
 * Bài 5: Tính a^n (luỹ thừa nhanh - Fast Exponentiation)
 *
 * Cách thường: a × a × a × ... (n lần) → O(n)
 * Cách nhanh: Chia đôi số mũ mỗi bước → O(log n)
 *
 * Công thức:
 * - Nếu n chẵn: a^n = (a^(n/2))²
 * - Nếu n lẻ:  a^n = a × a^(n-1)
 * - a^0 = 1
 *
 * Ví dụ: 2^10 = (2^5)² = (2 × 2^4)² = (2 × (2²)²)²
 *
 * Time Complexity:  O(?)  ← Hãy phân tích
 * Space Complexity: O(?)  ← Hãy phân tích
 */
fun fastPower(base: Long, exponent: Int): Long {
    // TODO: Viết code ở đây
    return -1
}