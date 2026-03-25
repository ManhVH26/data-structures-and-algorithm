package phase1.bigo

/**
 * ============================================================
 *  BÀI 1: BIG-O NOTATION (ĐỘ PHỨC TẠP THUẬT TOÁN)
 * ============================================================
 *
 * Big-O cho biết thuật toán chạy CHẬM đến mức nào khi dữ liệu TĂNG LÊN.
 * Nó không đo thời gian chính xác (giây), mà đo TỐC ĐỘ TĂNG TRƯỞNG.
 *
 * Ví dụ thực tế:
 * - Bạn có 10 cuốn sách → tìm 1 cuốn mất 1 giây
 * - Bạn có 1000 cuốn sách → mất bao lâu?
 *   + Nếu tìm từng cuốn (O(n)): ~100 giây
 *   + Nếu sách đã sắp xếp, dùng chia đôi (O(log n)): ~10 giây
 *   + Nếu biết chính xác vị trí (O(1)): 1 giây
 *
 * BẢNG XẾP HẠNG (từ nhanh → chậm):
 * ┌────────────┬──────────────────┬───────────────────────────┐
 * │ Big-O      │ Tên gọi          │ n=1000 → số bước          │
 * ├────────────┼──────────────────┼───────────────────────────┤
 * │ O(1)       │ Hằng số          │ 1                         │
 * │ O(log n)   │ Logarit          │ ~10                       │
 * │ O(n)       │ Tuyến tính       │ 1,000                     │
 * │ O(n log n) │ Tuyến tính log   │ ~10,000                   │
 * │ O(n²)      │ Bình phương      │ 1,000,000                 │
 * │ O(2ⁿ)      │ Luỹ thừa         │ 🔥 VÔ HẠN                │
 * │ O(n!)      │ Giai thừa        │ 🔥 VÔ HẠN                │
 * └────────────┴──────────────────┴───────────────────────────┘
 */

fun main() {
    val n = 10_000
    println("=== BIG-O NOTATION - VÍ DỤ MINH HOẠ ===")
    println("Kích thước dữ liệu: n = $n")
    println()

    // -------------------------------------------------------
    // 1. O(1) - HẰNG SỐ
    // Không phụ thuộc vào n. Dù n = 10 hay n = 1 tỷ, vẫn chạy 1 bước.
    // -------------------------------------------------------
    println("--- O(1): Hằng số ---")
    o1Example(intArrayOf(1, 2, 3, 4, 5))

    // -------------------------------------------------------
    // 2. O(log n) - LOGARIT
    // Mỗi bước chia đôi dữ liệu → rất nhanh.
    // Ví dụ: Binary Search, tìm trong từ điển đã sắp xếp.
    // -------------------------------------------------------
    println("--- O(log n): Logarit ---")
    oLogNExample(n)

    // -------------------------------------------------------
    // 3. O(n) - TUYẾN TÍNH
    // Duyệt qua từng phần tử 1 lần. n phần tử → n bước.
    // -------------------------------------------------------
    println("--- O(n): Tuyến tính ---")
    oNExample(n)

    // -------------------------------------------------------
    // 4. O(n log n) - TUYẾN TÍNH LOGARIT
    // Thường thấy ở các thuật toán sắp xếp tốt: Merge Sort, Quick Sort.
    // -------------------------------------------------------
    println("--- O(n log n): Tuyến tính Logarit ---")
    oNLogNExample(n)

    // -------------------------------------------------------
    // 5. O(n²) - BÌNH PHƯƠNG
    // 2 vòng lặp lồng nhau. n=1000 → 1 triệu bước. RẤT CHẬM!
    // -------------------------------------------------------
    println("--- O(n²): Bình phương ---")
    oN2Example(1000) // dùng n nhỏ hơn để không chờ lâu

    // -------------------------------------------------------
    // 6. O(2ⁿ) - LUỸ THỪA
    // Mỗi bước tạo ra 2 nhánh. Fibonacci đệ quy naive là ví dụ điển hình.
    // KHÔNG BAO GIỜ dùng cho n lớn!
    // -------------------------------------------------------
    println("--- O(2ⁿ): Luỹ thừa ---")
    o2NExample(25) // n=25 thôi đã rất chậm rồi!

    // -------------------------------------------------------
    // 7. O(n!) - GIAI THỪA
    // Tính tất cả hoán vị. n=10 → 3.6 triệu bước.
    // Chỉ dùng cho n rất nhỏ (thường n ≤ 10-12).
    // -------------------------------------------------------
    println("--- O(n!): Giai thừa ---")
    oFactorialExample(10)
}

// ===================== CÁC HÀM VÍ DỤ =====================

/**
 * O(1) - Truy cập phần tử theo index.
 * Dù mảng có 10 hay 1 triệu phần tử, truy cập BẤT KỲ vị trí nào cũng chỉ 1 bước.
 * arr[0], arr[500], arr[999999] → đều là O(1).
 */
fun o1Example(arr: IntArray) {
    var steps = 0

    val first = arr[0]          // 1 bước
    steps++
    val middle = arr[arr.size / 2]  // 1 bước
    steps++
    val last = arr[arr.lastIndex]   // 1 bước
    steps++

    println("  arr[0] = $first, arr[${arr.size / 2}] = $middle, arr[${arr.lastIndex}] = $last")
    println("  Truy cập 3 vị trí khác nhau → Số bước: $steps (luôn cố định, không phụ thuộc kích thước mảng)")
    println()
}

/**
 * O(log n) - Mỗi bước chia đôi → dữ liệu giảm rất nhanh.
 * VD: n = 1000 → log₂(1000) ≈ 10 bước
 *
 * Ở đây mình chia đôi một con số → không cần sắp xếp.
 * Nhưng nếu dùng Binary Search để TÌM KIẾM trong mảng → mảng PHẢI được sắp xếp trước!
 * (Vì chia đôi chỉ có nghĩa khi biết nửa nào chứa đáp án → cần thứ tự)
 */
fun oLogNExample(n: Int) {
    var steps = 0
    var current = n
    while (current > 1) {
        current /= 2   // chia đôi mỗi bước
        steps++
    }
    println("  n = $n → Số bước khi chia đôi liên tục: $steps")
    println()
}

/**
 * O(n) - Duyệt qua n phần tử.
 * n phần tử → n bước.
 */
fun oNExample(n: Int) {
    var steps = 0
    for (i in 0 until n) {
        steps++         // mỗi phần tử = 1 bước
    }
    println("  n = $n → Số bước: $steps")
    println()
}

/**
 * O(n log n) - Mô phỏng: với mỗi phần tử, chia đôi.
 * Đây là độ phức tạp của Merge Sort, Quick Sort (trung bình).
 */
fun oNLogNExample(n: Int) {
    var steps = 0
    for (i in 0 until n) {          // n lần
        var current = n
        while (current > 1) {       // log n lần
            current /= 2
            steps++
        }
    }
    println("  n = $n → Số bước: $steps (≈ n × log n)")
    println()
}

/**
 * O(n²) - Hai vòng lặp lồng nhau.
 * n = 1000 → 1,000,000 bước. CHẬM!
 */
fun oN2Example(n: Int) {
    var steps = 0L
    for (i in 0 until n) {          // n lần
        for (j in 0 until n) {      // n lần
            steps++
        }
    }
    println("  n = $n → Số bước: $steps (= n²)")
    println()
}

/**
 * O(2ⁿ) - Fibonacci đệ quy naive.
 * Mỗi lần gọi tạo ra 2 lần gọi con → tổng 2ⁿ bước.
 *
 * ⚠️ ĐÂY LÀ CÁCH LÀM SAI! Sau này sẽ học cách tối ưu bằng DP.
 */
var fibSteps = 0L
fun fibNaive(n: Int): Long {
    fibSteps++
    if (n <= 1) return n.toLong()
    return fibNaive(n - 1) + fibNaive(n - 2)
}

fun o2NExample(n: Int) {
    fibSteps = 0
    val result = fibNaive(n)
    println("  Fibonacci($n) = $result → Số bước: $fibSteps")
    println("  ⚠️ Thử n=50 sẽ chờ CẢ NGÀY! Đó là sức mạnh (đáng sợ) của O(2ⁿ)")
    println()
}

/**
 * O(n!) - Đếm số hoán vị.
 * n = 10 → 3,628,800 hoán vị.
 */
fun oFactorialExample(n: Int) {
    var result = 1L
    for (i in 1..n) {
        result *= i
    }
    println("  $n! = $result hoán vị → Nếu duyệt hết sẽ cần $result bước!")
    println()
}