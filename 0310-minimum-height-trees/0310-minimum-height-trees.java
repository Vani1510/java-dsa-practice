class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> result = new ArrayList<>();
        if (n == 1) {
            result.add(0);
            return result;
        }
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        int[] degree = new int[n];
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
            degree[u]++;
            degree[v]++;
        }
        Queue<Integer> leaves = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (degree[i] == 1) {
                leaves.offer(i);
            }
        }
        int remainingNodes = n;
        while (remainingNodes > 2) {
            int leavesCount = leaves.size();
            remainingNodes -= leavesCount;
            for (int i = 0; i < leavesCount; i++) {
                int leaf = leaves.poll();
                for (int neighbor : graph.get(leaf)) {
                    degree[neighbor]--;
                    if (degree[neighbor] == 1) {
                        leaves.offer(neighbor);
                    }
                }
            }}
        result.addAll(leaves);
        return result;
    }
}
