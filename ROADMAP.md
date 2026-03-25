# ROADMAP: Cấu Trúc Dữ Liệu & Giải Thuật

> Ngôn ngữ sử dụng: **Kotlin** (duy nhất)
> Roadmap dành cho người mới bắt đầu, từ cơ bản đến nâng cao.
> Mỗi giai đoạn có lý thuyết + bài tập thực hành.

---

## TỔNG QUAN LỘ TRÌNH

```
Phase 1: Nền Tảng (2-3 tuần)
    │
Phase 2: Cấu Trúc Dữ Liệu Cơ Bản (3-4 tuần)
    │
Phase 3: Giải Thuật Sắp Xếp & Tìm Kiếm (2-3 tuần)
    │
Phase 4: Cấu Trúc Dữ Liệu Nâng Cao (3-4 tuần)
    │
Phase 5: Giải Thuật Nâng Cao (3-4 tuần)
    │
Phase 6: Dynamic Programming (3-4 tuần)
    │
Phase 7: Graph Algorithms (3-4 tuần)
    │
Phase 8: Luyện Đề & Phỏng Vấn (Liên tục)
```

---

## PHASE 1: NỀN TẢNG LẬP TRÌNH (2-3 tuần)

### Mục tiêu
- Hiểu Big-O Notation (Độ phức tạp thuật toán)
- Thành thạo Đệ quy (Recursion) - nền tảng cho mọi thuật toán

> **Ghi chú:** Kotlin cơ bản đã nắm vững → bỏ qua, đi thẳng vào DSA.

### Nội dung học

#### 1.1 Big-O Notation (Độ phức tạp)
- [ ] O(1) - Hằng số
- [ ] O(log n) - Logarit
- [ ] O(n) - Tuyến tính
- [ ] O(n log n) - Tuyến tính logarit
- [ ] O(n²) - Bình phương
- [ ] O(2ⁿ) - Luỹ thừa
- [ ] O(n!) - Giai thừa
- [ ] Phân biệt Time Complexity vs Space Complexity

#### 1.2 Đệ quy (Recursion) - **RẤT QUAN TRỌNG**
- [ ] Hiểu base case và recursive case
- [ ] Đệ quy vs Vòng lặp
- [ ] Call stack và tràn stack (Stack Overflow)
- [ ] Tail recursion (`tailrec` trong Kotlin)

### Bài tập thực hành
| STT | Bài tập | Độ khó | Ghi chú |
|-----|---------|--------|---------|
| 1 | Tính giai thừa bằng đệ quy | Easy | Hiểu đệ quy |
| 2 | Dãy Fibonacci | Easy | Đệ quy + Vòng lặp |
| 3 | Tìm ước chung lớn nhất (GCD) | Easy | Thuật toán Euclid |
| 4 | Kiểm tra số nguyên tố | Easy | Tối ưu O(√n) |
| 5 | Tính luỹ thừa nhanh | Medium | O(log n) |

### Tài liệu
- Sách: "Grokking Algorithms" - Aditya Bhargava (rất trực quan)
- Video: CS50 Harvard (YouTube)
- Kotlin: kotlinlang.org/docs (tài liệu chính thức)

---

## PHASE 2: CẤU TRÚC DỮ LIỆU CƠ BẢN (3-4 tuần)

### 2.1 Array (Mảng)
- [ ] `IntArray`, `Array<T>`, `MutableList<T>` trong Kotlin
- [ ] Duyệt mảng, thêm, xoá phần tử
- [ ] Two Pointer technique
- [ ] Sliding Window technique
- [ ] Prefix Sum

#### Bài tập Array
| STT | Bài tập (LeetCode) | Độ khó | Kỹ thuật |
|-----|---------------------|--------|----------|
| 1 | Two Sum (#1) | Easy | HashMap |
| 2 | Best Time to Buy and Sell Stock (#121) | Easy | Greedy |
| 3 | Contains Duplicate (#217) | Easy | HashSet |
| 4 | Maximum Subarray (#53) | Medium | Kadane's Algorithm |
| 5 | Product of Array Except Self (#238) | Medium | Prefix/Suffix |
| 6 | 3Sum (#15) | Medium | Two Pointer |
| 7 | Container With Most Water (#11) | Medium | Two Pointer |
| 8 | Merge Intervals (#56) | Medium | Sorting |

### 2.2 String (Chuỗi)
- [ ] Thao tác với chuỗi trong Kotlin (`substring`, `split`, `toCharArray`,...)
- [ ] `StringBuilder` trong Kotlin
- [ ] Pattern matching cơ bản

#### Bài tập String
| STT | Bài tập (LeetCode) | Độ khó |
|-----|---------------------|--------|
| 1 | Valid Palindrome (#125) | Easy |
| 2 | Valid Anagram (#242) | Easy |
| 3 | Longest Substring Without Repeating (#3) | Medium |
| 4 | Longest Palindromic Substring (#5) | Medium |
| 5 | Group Anagrams (#49) | Medium |

### 2.3 Linked List (Danh sách liên kết)
- [ ] Singly Linked List (Liên kết đơn)
- [ ] Doubly Linked List (Liên kết đôi)
- [ ] Circular Linked List (Liên kết vòng)
- [ ] Tự cài đặt Linked List bằng Kotlin (`data class ListNode(var value: Int, var next: ListNode? = null)`)

#### Bài tập Linked List
| STT | Bài tập (LeetCode) | Độ khó | Kỹ thuật |
|-----|---------------------|--------|----------|
| 1 | Reverse Linked List (#206) | Easy | Iterative + Recursive |
| 2 | Merge Two Sorted Lists (#21) | Easy | Two Pointer |
| 3 | Linked List Cycle (#141) | Easy | Fast & Slow Pointer |
| 4 | Remove Nth Node From End (#19) | Medium | Two Pointer |
| 5 | Reorder List (#143) | Medium | Tổng hợp |
| 6 | Merge k Sorted Lists (#23) | Hard | Heap / Divide & Conquer |

### 2.4 Stack & Queue
- [ ] Stack (LIFO) - Dùng `ArrayDeque<T>` trong Kotlin
- [ ] Queue (FIFO) - Dùng `ArrayDeque<T>` hoặc `LinkedList<T>`
- [ ] Deque (Double-ended Queue)
- [ ] Priority Queue - Dùng `PriorityQueue<T>` trong Kotlin

#### Bài tập Stack & Queue
| STT | Bài tập (LeetCode) | Độ khó |
|-----|---------------------|--------|
| 1 | Valid Parentheses (#20) | Easy |
| 2 | Min Stack (#155) | Medium |
| 3 | Evaluate Reverse Polish Notation (#150) | Medium |
| 4 | Daily Temperatures (#739) | Medium |
| 5 | Implement Queue using Stacks (#232) | Easy |
| 6 | Sliding Window Maximum (#239) | Hard |

### 2.5 HashMap & HashSet
- [ ] `HashMap<K, V>`, `HashSet<T>` trong Kotlin
- [ ] `getOrDefault()`, `getOrPut()` - các hàm tiện ích của Kotlin
- [ ] `mutableMapOf()`, `mutableSetOf()`
- [ ] HashMap vs TreeMap (`sortedMapOf()`)

#### Bài tập HashMap
| STT | Bài tập (LeetCode) | Độ khó |
|-----|---------------------|--------|
| 1 | Two Sum (#1) | Easy |
| 2 | Top K Frequent Elements (#347) | Medium |
| 3 | Encode and Decode TinyURL (#535) | Medium |
| 4 | Subarray Sum Equals K (#560) | Medium |
| 5 | LRU Cache (#146) | Medium |

---

## PHASE 3: GIẢI THUẬT SẮP XẾP & TÌM KIẾM (2-3 tuần)

### 3.1 Sắp xếp (Sorting)
- [ ] Bubble Sort - O(n²)
- [ ] Selection Sort - O(n²)
- [ ] Insertion Sort - O(n²)
- [ ] **Merge Sort - O(n log n)** ← QUAN TRỌNG
- [ ] **Quick Sort - O(n log n)** ← QUAN TRỌNG
- [ ] Counting Sort - O(n+k)
- [ ] Radix Sort - O(nk)
- [ ] Sử dụng `sorted()`, `sortedBy()`, `sortedWith()` trong Kotlin

> Phải tự cài đặt được Merge Sort và Quick Sort từ đầu bằng Kotlin!

### 3.2 Tìm kiếm (Searching)
- [ ] Linear Search - O(n)
- [ ] **Binary Search - O(log n)** ← RẤT QUAN TRỌNG
- [ ] Binary Search trên mảng đã sắp xếp
- [ ] Binary Search trên đáp án (Binary Search on Answer)
- [ ] Sử dụng `binarySearch()` có sẵn trong Kotlin

#### Bài tập Binary Search
| STT | Bài tập (LeetCode) | Độ khó |
|-----|---------------------|--------|
| 1 | Binary Search (#704) | Easy |
| 2 | Search a 2D Matrix (#74) | Medium |
| 3 | Koko Eating Bananas (#875) | Medium |
| 4 | Find Minimum in Rotated Sorted Array (#153) | Medium |
| 5 | Search in Rotated Sorted Array (#33) | Medium |
| 6 | Median of Two Sorted Arrays (#4) | Hard |

---

## PHASE 4: CẤU TRÚC DỮ LIỆU NÂNG CAO (3-4 tuần)

### 4.1 Tree (Cây)
- [ ] Binary Tree (Cây nhị phân)
- [ ] Binary Search Tree (BST)
- [ ] Duyệt cây: Inorder, Preorder, Postorder, Level-order (BFS)
- [ ] Chiều cao, độ sâu của cây
- [ ] Balanced BST (AVL Tree cơ bản)
- [ ] Cài đặt TreeNode trong Kotlin: `class TreeNode(var value: Int, var left: TreeNode? = null, var right: TreeNode? = null)`

#### Bài tập Tree
| STT | Bài tập (LeetCode) | Độ khó |
|-----|---------------------|--------|
| 1 | Maximum Depth of Binary Tree (#104) | Easy |
| 2 | Invert Binary Tree (#226) | Easy |
| 3 | Same Tree (#100) | Easy |
| 4 | Subtree of Another Tree (#572) | Easy |
| 5 | Lowest Common Ancestor of BST (#235) | Medium |
| 6 | Binary Tree Level Order Traversal (#102) | Medium |
| 7 | Validate Binary Search Tree (#98) | Medium |
| 8 | Construct Binary Tree from Preorder and Inorder (#105) | Medium |
| 9 | Binary Tree Maximum Path Sum (#124) | Hard |
| 10 | Serialize and Deserialize Binary Tree (#297) | Hard |

### 4.2 Heap / Priority Queue
- [ ] Min Heap, Max Heap
- [ ] Cài đặt Heap bằng Array
- [ ] Heap Sort
- [ ] Ứng dụng: Top K, Median
- [ ] Dùng `PriorityQueue<T>` và `compareBy()` / `compareByDescending()` trong Kotlin

#### Bài tập Heap
| STT | Bài tập (LeetCode) | Độ khó |
|-----|---------------------|--------|
| 1 | Kth Largest Element (#215) | Medium |
| 2 | Top K Frequent Elements (#347) | Medium |
| 3 | Find Median from Data Stream (#295) | Hard |
| 4 | Task Scheduler (#621) | Medium |

### 4.3 Trie (Prefix Tree)
- [ ] Cài đặt Trie bằng Kotlin (`class TrieNode(val children: Array<TrieNode?> = arrayOfNulls(26), var isEnd: Boolean = false)`)
- [ ] Insert, Search, StartsWith
- [ ] Ứng dụng: Auto-complete, Spell checker

#### Bài tập Trie
| STT | Bài tập (LeetCode) | Độ khó |
|-----|---------------------|--------|
| 1 | Implement Trie (#208) | Medium |
| 2 | Word Search II (#212) | Hard |

---

## PHASE 5: GIẢI THUẬT NÂNG CAO (3-4 tuần)

### 5.1 Backtracking (Quay lui)
- [ ] Hiểu nguyên lý quay lui
- [ ] Template backtracking
- [ ] Pruning (Cắt tỉa)

#### Bài tập Backtracking
| STT | Bài tập (LeetCode) | Độ khó |
|-----|---------------------|--------|
| 1 | Subsets (#78) | Medium |
| 2 | Permutations (#46) | Medium |
| 3 | Combination Sum (#39) | Medium |
| 4 | Word Search (#79) | Medium |
| 5 | Palindrome Partitioning (#131) | Medium |
| 6 | N-Queens (#51) | Hard |

### 5.2 Greedy (Tham lam)
- [ ] Khi nào dùng Greedy?
- [ ] Chứng minh tính đúng của Greedy

#### Bài tập Greedy
| STT | Bài tập (LeetCode) | Độ khó |
|-----|---------------------|--------|
| 1 | Jump Game (#55) | Medium |
| 2 | Jump Game II (#45) | Medium |
| 3 | Gas Station (#134) | Medium |
| 4 | Hand of Straights (#846) | Medium |
| 5 | Partition Labels (#763) | Medium |

### 5.3 Bit Manipulation
- [ ] AND, OR, XOR, NOT, Shift
- [ ] Toán tử bit trong Kotlin: `and`, `or`, `xor`, `inv()`, `shl`, `shr`
- [ ] Ứng dụng thực tế

#### Bài tập Bit Manipulation
| STT | Bài tập (LeetCode) | Độ khó |
|-----|---------------------|--------|
| 1 | Single Number (#136) | Easy |
| 2 | Number of 1 Bits (#191) | Easy |
| 3 | Counting Bits (#338) | Easy |
| 4 | Reverse Bits (#190) | Easy |
| 5 | Missing Number (#268) | Easy |

---

## PHASE 6: DYNAMIC PROGRAMMING - QUY HOẠCH ĐỘNG (3-4 tuần)

> Đây là phần khó nhất nhưng cũng quan trọng nhất!

### Lộ trình học DP
- [ ] Hiểu khái niệm: Overlapping Subproblems + Optimal Substructure
- [ ] Top-down (Memoization) vs Bottom-up (Tabulation)
- [ ] Nhận diện bài DP
- [ ] Memoization trong Kotlin: dùng `HashMap` hoặc `IntArray` để cache

### Phân loại bài DP

#### 6.1 DP 1 chiều (1D DP)
| STT | Bài tập (LeetCode) | Độ khó |
|-----|---------------------|--------|
| 1 | Climbing Stairs (#70) | Easy |
| 2 | House Robber (#198) | Medium |
| 3 | House Robber II (#213) | Medium |
| 4 | Longest Increasing Subsequence (#300) | Medium |
| 5 | Coin Change (#322) | Medium |
| 6 | Word Break (#139) | Medium |
| 7 | Decode Ways (#91) | Medium |

#### 6.2 DP 2 chiều (2D DP)
| STT | Bài tập (LeetCode) | Độ khó |
|-----|---------------------|--------|
| 1 | Unique Paths (#62) | Medium |
| 2 | Longest Common Subsequence (#1143) | Medium |
| 3 | Edit Distance (#72) | Medium |
| 4 | 0/1 Knapsack (Bài toán cái túi - Classic) | Medium |
| 5 | Target Sum (#494) | Medium |
| 6 | Interleaving String (#97) | Medium |
| 7 | Longest Palindromic Subsequence (#516) | Medium |
| 8 | Burst Balloons (#312) | Hard |

---

## PHASE 7: GRAPH ALGORITHMS - THUẬT TOÁN ĐỒ THỊ (3-4 tuần)

### 7.1 Biểu diễn đồ thị trong Kotlin
- [ ] Adjacency Matrix: `Array(n) { IntArray(n) }`
- [ ] Adjacency List: `Array(n) { mutableListOf<Int>() }` hoặc `HashMap<Int, MutableList<Int>>()`
- [ ] Edge List: `List<Triple<Int, Int, Int>>` (từ, đến, trọng số)

### 7.2 Duyệt đồ thị
- [ ] **BFS (Breadth-First Search)** - Duyệt theo chiều rộng (dùng `ArrayDeque`)
- [ ] **DFS (Depth-First Search)** - Duyệt theo chiều sâu (đệ quy hoặc Stack)
- [ ] Phát hiện chu trình (Cycle Detection)
- [ ] Topological Sort (Sắp xếp topo)

### 7.3 Đường đi ngắn nhất
- [ ] Dijkstra's Algorithm (dùng `PriorityQueue`)
- [ ] Bellman-Ford Algorithm
- [ ] Floyd-Warshall Algorithm

### 7.4 Union Find (Disjoint Set)
- [ ] Union by Rank
- [ ] Path Compression
- [ ] Cài đặt bằng Kotlin với `IntArray`

#### Bài tập Graph
| STT | Bài tập (LeetCode) | Độ khó | Kỹ thuật |
|-----|---------------------|--------|----------|
| 1 | Number of Islands (#200) | Medium | BFS/DFS |
| 2 | Clone Graph (#133) | Medium | BFS/DFS |
| 3 | Pacific Atlantic Water Flow (#417) | Medium | DFS |
| 4 | Course Schedule (#207) | Medium | Topological Sort |
| 5 | Course Schedule II (#210) | Medium | Topological Sort |
| 6 | Graph Valid Tree (#261) | Medium | Union Find |
| 7 | Number of Connected Components (#323) | Medium | Union Find |
| 8 | Rotting Oranges (#994) | Medium | BFS |
| 9 | Word Ladder (#127) | Hard | BFS |
| 10 | Alien Dictionary (#269) | Hard | Topological Sort |
| 11 | Network Delay Time (#743) | Medium | Dijkstra |

---

## PHASE 8: LUYỆN ĐỀ & CHUẨN BỊ PHỎNG VẤN (Liên tục)

### Nguyên tắc luyện tập
1. **Mỗi ngày giải 1-2 bài** LeetCode
2. **Hiểu bài giải**, không chỉ submit xong rồi bỏ
3. **Viết lại lời giải** từ đầu sau 2-3 ngày
4. **Phân tích độ phức tạp** cho mọi lời giải
5. **Học từ lời giải của người khác** (Discussion tab)

### Lịch luyện tập gợi ý

| Ngày | Nội dung |
|------|----------|
| Thứ 2 | Array / String |
| Thứ 3 | Linked List / Stack / Queue |
| Thứ 4 | Tree / Graph |
| Thứ 5 | Dynamic Programming |
| Thứ 6 | Binary Search / Sorting |
| Thứ 7 | Backtracking / Greedy |
| CN | Ôn tập + Làm lại bài sai |

### Các nguồn luyện tập
- **LeetCode**: leetcode.com (Bắt đầu với NeetCode 150 hoặc Blind 75)
- **NeetCode**: neetcode.io (Có roadmap và video giải thích)
- **HackerRank**: hackerrank.com
- **Codeforces**: codeforces.com (Cho competitive programming)

---

## MỘT SỐ MẸO QUAN TRỌNG

### Khi gặp bài khó, không giải được:
1. Đọc bài và suy nghĩ **15-20 phút**
2. Nếu không ra ý tưởng → đọc gợi ý (Hint)
3. Sau 30 phút → đọc lời giải, **hiểu thuật toán**
4. Tự code lại **không nhìn lời giải**
5. Sau 2-3 ngày → làm lại bài đó

### Kỹ thuật nhận dạng bài:
| Dấu hiệu | Kỹ thuật |
|-----------|----------|
| "Sắp xếp" hoặc "tìm kiếm" | Binary Search, Sorting |
| "Tất cả các trường hợp" | Backtracking |
| "Số lượng đường đi" / "Giá trị tối ưu" | Dynamic Programming |
| "Kết nối" / "Đường đi ngắn nhất" | Graph (BFS/DFS) |
| "Liên tiếp" / "Chuỗi con" | Sliding Window |
| "Cặp" / "Đã sắp xếp" | Two Pointer |
| "Top K" / "Phần tử nhỏ/lớn nhất" | Heap |
| "Ngoặc" / "Hoàn tác" | Stack |

### Mẹo Kotlin cho DSA:
| Tính năng | Ví dụ |
|-----------|-------|
| Destructuring | `val (a, b) = pair` |
| Scope functions | `let`, `also`, `apply`, `run` |
| Ranges | `for (i in 0 until n)`, `for (i in n downTo 0)` |
| sortedBy | `list.sortedBy { it.second }` |
| groupBy | `list.groupBy { it }` cho đếm tần suất |
| buildList | `buildList { add(1); add(2) }` |
| maxOf / minOf | `maxOf(a, b, c)` |

---

## THEO DÕI TIẾN ĐỘ

- [ ] Phase 1: Nền Tảng
- [ ] Phase 2: Cấu Trúc Dữ Liệu Cơ Bản
- [ ] Phase 3: Sắp Xếp & Tìm Kiếm
- [ ] Phase 4: Cấu Trúc Dữ Liệu Nâng Cao
- [ ] Phase 5: Giải Thuật Nâng Cao
- [ ] Phase 6: Dynamic Programming
- [ ] Phase 7: Graph Algorithms
- [ ] Phase 8: Luyện Đề Liên Tục

> Tổng thời gian ước tính: **5-7 tháng** (học 1-2 tiếng/ngày)
> Mục tiêu: Giải được 150-200 bài LeetCode với sự tự tin!

---

*"Không ai giỏi từ đầu, chỉ có những người không bỏ cuộc." - Chúc bạn thành công!*