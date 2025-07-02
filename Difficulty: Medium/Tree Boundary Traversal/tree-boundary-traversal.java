/*
class Node
{
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    ArrayList<Integer> boundaryTraversal(Node node) {
        ArrayList<Integer> result = new ArrayList<>();
        if (node == null) return result;

        if (!isLeaf(node)) result.add(node.data); // root (only if not a leaf)

        // Left Boundary
        addLeftBoundary(node.left, result);

        // Leaves
        addLeaves(node, result);

        // Right Boundary
        addRightBoundary(node.right, result);

        return result;
    }

    boolean isLeaf(Node node) {
        return (node.left == null) && (node.right == null);
    }

    void addLeftBoundary(Node node, ArrayList<Integer> res) {
        while (node != null) {
            if (!isLeaf(node)) res.add(node.data);
            if (node.left != null) node = node.left;
            else node = node.right;
        }
    }

    void addLeaves(Node node, ArrayList<Integer> res) {
        if (node == null) return;
        if (isLeaf(node)) {
            res.add(node.data);
            return;
        }
        addLeaves(node.left, res);
        addLeaves(node.right, res);
    }

    void addRightBoundary(Node node, ArrayList<Integer> res) {
        Stack<Integer> stack = new Stack<>();
        while (node != null) {
            if (!isLeaf(node)) stack.push(node.data);
            if (node.right != null) node = node.right;
            else node = node.left;
        }

        while (!stack.isEmpty()) {
            res.add(stack.pop());
        }
    }
}
