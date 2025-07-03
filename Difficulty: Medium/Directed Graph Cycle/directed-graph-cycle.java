class Solution {
    public boolean isCyclic(int V, int[][] edges) {
        // Step 1: Create adjacency list
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());
        for (int[] edge : edges)
            adj.get(edge[0]).add(edge[1]);

        // Step 2: Initialize visited and recursion stack arrays
        boolean[] visited = new boolean[V];
        boolean[] recStack = new boolean[V];

        // Step 3: Run DFS for each unvisited node
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (dfs(i, adj, visited, recStack))
                    return true;
            }
        }
        return false;
    }

    // Helper DFS function to detect cycle
    private boolean dfs(int node, List<List<Integer>> adj, boolean[] visited, boolean[] recStack) {
        visited[node] = true;
        recStack[node] = true;

        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                if (dfs(neighbor, adj, visited, recStack))
                    return true;
            } else if (recStack[neighbor]) {
                return true; // Cycle detected
            }
        }

        recStack[node] = false; // Remove from recursion stack
        return false;
    }
}
