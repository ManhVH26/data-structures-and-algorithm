package phase1.bigo

/**
 * ============================================================
 *  BÀI 2: TIME COMPLEXITY vs SPACE COMPLEXITY
 * ============================================================
 *
 * Time Complexity  = thuật toán cần bao nhiêu BƯỚC (thời gian)
 * Space Complexity = thuật toán cần bao nhiêu BỘ NHỚ (RAM)
 *
 * Đôi khi ta phải ĐÁNH ĐỔI: dùng nhiều bộ nhớ hơn để chạy nhanh hơn.
 * Đây gọi là "Space-Time Tradeoff".
 */

fun main() {
    println("=== TIME vs SPACE COMPLEXITY ===")
    println()

    val arr = intArrayOf(1, 3, 5, 7, 3, 9, 1, 5)

    // -------------------------------------------------------
    // VÍ DỤ 1: Tìm phần tử trùng lặp
    // Cách 1: Brute Force → Time O(n²), Space O(1)
    // Cách 2: Dùng HashSet → Time O(n), Space O(n)
    // -------------------------------------------------------

    println("Mảng: ${arr.toList()}")
    println()

    // Cách 1: So sánh từng cặp (CHẬM nhưng TIẾT KIỆM bộ nhớ)
    println("--- Cách 1: Brute Force ---")
    println("  Time: O(n²) | Space: O(1)")
    findDuplicateBruteForce(arr)

    // Cách 2: Dùng HashSet (NHANH nhưng TỐN bộ nhớ)
    println("--- Cách 2: HashSet ---")
    println("  Time: O(n) | Space: O(n)")
    findDuplicateHashSet(arr)

    println()
    println("=== CÁCH PHÂN TÍCH ĐỘ PHỨC TẠP ===")
    println()
    analyzeExamples()
}

/**
 * Brute Force: So sánh mọi cặp (i, j)
 * Time:  O(n²) - 2 vòng lặp lồng nhau
 * Space: O(1)  - không dùng thêm bộ nhớ
 */
fun findDuplicateBruteForce(arr: IntArray) {
    var steps = 0
    val duplicates = mutableListOf<Int>()
    for (i in arr.indices) {
        for (j in i + 1 until arr.size) {
            steps++
            if (arr[i] == arr[j] && arr[i] !in duplicates) {
                duplicates.add(arr[i])
            }
        }
    }
    println("  Phần tử trùng: $duplicates | Số bước: $steps")
    println()
}

/**
 * HashSet: Duyệt 1 lần, dùng Set để nhớ phần tử đã gặp
 * Time:  O(n) - duyệt 1 lần
 * Space: O(n) - lưu tối đa n phần tử trong Set
 */
fun findDuplicateHashSet(arr: IntArray) {
    var steps = 0
    val seen = HashSet<Int>()
    val duplicates = mutableListOf<Int>()
    for (num in arr) {
        steps++
        if (num in seen) {
            if (num !in duplicates) duplicates.add(num)
        } else {
            seen.add(num)
        }
    }
    println("  Phần tử trùng: $duplicates | Số bước: $steps")
    println("  Bộ nhớ dùng thêm: HashSet chứa ${seen.size} phần tử")
    println()
}

/**
 * Hướng dẫn cách phân tích độ phức tạp
 */
fun analyzeExamples() {
    // RULE 1: Bỏ hằng số
    println("📌 Rule 1: Bỏ hằng số")
    println("   O(2n) → O(n)")
    println("   O(n/2) → O(n)")
    println("   O(100) → O(1)")
    println()

    // RULE 2: Lấy số hạng lớn nhất
    println("📌 Rule 2: Lấy số hạng lớn nhất")
    println("   O(n² + n) → O(n²)")
    println("   O(n + log n) → O(n)")
    println("   O(2ⁿ + n³) → O(2ⁿ)")
    println()

    // RULE 3: Vòng lặp lồng nhau → nhân
    println("📌 Rule 3: Vòng lặp lồng nhau → NHÂN")
    println("   for i in 0..n:")
    println("     for j in 0..n:    → O(n × n) = O(n²)")
    println()

    // RULE 4: Vòng lặp nối tiếp → cộng
    println("📌 Rule 4: Vòng lặp nối tiếp → CỘNG")
    println("   for i in 0..n:      → O(n)")
    println("   for j in 0..m:      → O(m)")
    println("   Tổng: O(n + m)")
    println()

    // VÍ DỤ THỰC HÀNH
    println("=== BÀI TẬP: Phân tích độ phức tạp ===")
    println()
    println("Bài 1: fun example1(n: Int) {")
    println("          for (i in 0 until n) {")
    println("            for (j in 0 until n) {")
    println("              println(i + j)")
    println("            }")
    println("          }")
    println("        }")
    println("→ Đáp án: Time O(n²), Space O(1)")
    println()

    println("Bài 2: fun example2(n: Int) {")
    println("          val arr = IntArray(n)")
    println("          for (i in 0 until n) {")
    println("            arr[i] = i * 2")
    println("          }")
    println("        }")
    println("→ Đáp án: Time O(n), Space O(n)")
    println()

    println("Bài 3: fun example3(n: Int) {")
    println("          var i = n")
    println("          while (i > 0) {")
    println("            i /= 2")
    println("          }")
    println("        }")
    println("→ Đáp án: Time O(log n), Space O(1)")
}