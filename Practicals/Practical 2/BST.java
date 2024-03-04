public class BST<T extends Comparable<T>> {

    BinaryNode<T> root;

    public BST() {

    }

    public void delete(T data) {

    }

    public boolean contains(T data) {
        return false;
    }

    public void insert(T data) {

    }

    public int getHeight() {
        return 0;
    }

    public String printSearchPath(T data) {
        return "";
    }

    public int getNumLeaves() {
        return 0;
    }

    public BST<T> extractBiggestSuperBalancedSubTree() {
        return null;
    }

    public BinaryNode<T> getNode(T data) {
        return null;
    }

    public boolean isSuperBalanced() {
        return false;
    }

    public BinaryNode<T> findMax() {
        return null;
    }

    public BinaryNode<T> findMin() {
        return null;
    }

    ///////////////

    private StringBuilder toString(BinaryNode<T> node, StringBuilder prefix, boolean isTail, StringBuilder sb) {
        if (node.right != null) {
            toString(node.right, new StringBuilder().append(prefix).append(isTail ? "│   " : "    "), false, sb);
        }
        sb.append(prefix).append(isTail ? "└── " : "┌── ").append(node.data.toString()).append("\n");
        if (node.left != null) {
            toString(node.left, new StringBuilder().append(prefix).append(isTail ? "    " : "│   "), true, sb);
        }
        return sb;
    }

    @Override
    public String toString() {
        return root == null ? "Empty tree" : toString(root, new StringBuilder(), true, new StringBuilder()).toString();
    }

}
