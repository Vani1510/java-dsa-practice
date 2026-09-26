import java.util.PriorityQueue;
import java.util.Collections;

class Solution {
    public int lastStoneWeight(int[] stones) {
        // Create a Max Heap to store the stones
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        // Add all stones to the heap
        for (int stone : stones) {
            maxHeap.add(stone);
        }
        
        // Smash the two heaviest stones until 1 or 0 stones remain
        while (maxHeap.size() > 1) {
            int stone1 = maxHeap.poll(); // Heaviest
            int stone2 = maxHeap.poll(); // Second heaviest
            
            if (stone1 != stone2) {
                maxHeap.add(stone1 - stone2); // Add the remaining weight back
            }
        }
        
        // If heap is empty, return 0. Otherwise, return the last stone.
        return maxHeap.isEmpty() ? 0 : maxHeap.poll();
    }
}