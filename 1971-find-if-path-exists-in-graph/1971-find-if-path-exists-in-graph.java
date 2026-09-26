
class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        // Step 1: Build the adjacency list
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]); // Bi-directional
        }
        
        // Step 2: Initialize visited array
        boolean[] visited = new boolean[n];
        
        // Step 3: Start the recursive DFS traversal
        return dfs(source, destination, graph, visited);
    }
    
    private boolean dfs(int current, int destination, List<List<Integer>> graph, boolean[] visited) {
        // Base Case: We found the destination
        if (current == destination) {
            return true;
        }
        
        // Mark the current node as visited so we don't process it again
        visited[current] = true;
        
        // Recursively visit all unvisited neighbors
        for (int neighbor : graph.get(current)) {
            if (!visited[neighbor]) {
                // If any path from a neighbor reaches the destination, return true
                if (dfs(neighbor, destination, graph, visited)) {
                    return true;
                }
            }
        }
        
        // If we explored all neighbors and couldn't reach the destination, backtrack
        return false;
    }
}