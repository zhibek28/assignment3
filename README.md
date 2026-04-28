# Assignment 3

**Student:** Zhibek Abdikerim

**Group:** BDA-2504

## 1.Overview
This assignment involves the implementation and examination of sorting and searching algorithms in Java. The objective is to evaluate their performance by measuring execution time.

## 2.Algorithm Descriptions

1. **Bubble Sort:** Comparative algorithm that repeatedly compares elements, and swaps them if they are in the wrong order.
Complexity: $O(n^2)$
2. **Merge Sort:** Divide-and-conquer algorithm that divides the array into parts, recursively sorts them, and then merges the sorted parts.
   Complexity: $O(n \log n)$
3. **Binary Search:** Search algorithm that searches for the element by repeatedly dividing.
   Complexity: $O(\log n)$

## 3.Results


| Size | Input Type | Bubble Sort | Merge Sort | Binary Search |
| :--- | :--- |:------------|:-----------|:--------------|
| 10 | Random | 3334ns      | 9292ns     | 1541ns        |
| 100 | Random | 188833ns    | 50416ns    | 709ns         |
| 1000 | Random | 10605500ns  | 596041ns   | 1041ns        |

## 4.Screenshot
![Output](./docs/output.png)



## 5.Conclusion
Big-O predicts how algorithms scale. While Bubble Sort is easy to write, its $O(n^2)$ nature makes it unusable for large dataset. Merge Sort is more consistent. Ensuring Binary Search receiveS a sorted array is not easy, as it would fail if not.