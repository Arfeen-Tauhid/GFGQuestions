class Solution {
    public boolean isCycle(int V, int[][] edges) {
        // Create adjacency list
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());
        
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);  // because it's undirected
        }

        boolean[] visited = new boolean[V];

        // DFS for each component
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (dfs(i, -1, visited, adj)) return true;
            }
        }

        return false;
    }

    private boolean dfs(int node, int parent, boolean[] visited, List<List<Integer>> adj) {
        visited[node] = true;

        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                if (dfs(neighbor, node, visited, adj)) return true;
            } else if (neighbor != parent) {
                // Found a back-edge (cycle)
                return true;
            }
        }

        return false;
    }
}