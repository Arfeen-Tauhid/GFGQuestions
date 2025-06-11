class Solution {
    public int findLength(int[] color, int[] radius) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < color.length; i++) {
            if (!stack.isEmpty()) {
                int topIndex = stack.peek();
                if (color[topIndex] == color[i] && radius[topIndex] == radius[i]) {
                    stack.pop();
                    continue;
                }
            }
            stack.push(i);
        }

        return stack.size();
    }
}
