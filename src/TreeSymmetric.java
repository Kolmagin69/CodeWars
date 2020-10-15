public class TreeSymmetric {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public TreeNode(int val) {
            this.val = val;
        }

    }

    public static boolean isSymmetric(TreeNode root) {
      return isSymmetric(root.left, root.right);
    }

    private static boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null)
            return true;
        if ((left == null || right == null) && right != left)
            return false;
        if (left.val != right.val)
            return false;
        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }


    public static void main(String[] args) {
        /*                 1
                          / \
                        /     \
                       2       2
                      / \     / \
                     4   3    3  4
                    /\   /\   /\ /\
                   5  6 8  7 7 8 6 5  */

        TreeNode root = new TreeNode(1,
            new TreeNode(2,
                    new TreeNode(4,
                            new TreeNode(5), new TreeNode(6)) ,
                    new TreeNode(3,
                            new TreeNode(8), new TreeNode(7))),
            new TreeNode(2,
                    new TreeNode(3,
                            new TreeNode(7), new TreeNode(8)),
                    new TreeNode(4,
                            new TreeNode(6), new TreeNode(5))));
        System.out.println(isSymmetric(root));
    }
}

