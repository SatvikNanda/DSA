package dsa.learning.heaps;
import java.util.*;

public class heapsIntro {
    public static void main(String[] args) {
        System.out.println("Welcome to heaps!");
        Heap<Integer> heap = new Heap<>();
        

        heap.insert(34);
        heap.insert(45);
        heap.insert(22);
        heap.insert(89);
        heap.insert(76);

        ArrayList list = heap.heapSort();
        System.out.println(list);
    }
}
