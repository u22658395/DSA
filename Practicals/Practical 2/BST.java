public class BST<T extends Comparable<T>> {

    BinaryNode<T> root;

    public BST() {
        root = null;
    }

    public void delete(T data) {
        root = deleteHelper(root, data);
    }

    public boolean contains(T data) {
        return containsHelper(root, data);
    }

    public void insert(T data) {
        if (root == null) {
            root = new BinaryNode<T>(data);
        }
        else{
            insertHelper(root, data);
        }
    }

    public int getHeight() {
        return 0;
    }

    public String printSearchPath(T data) {

        return printSearchHelper(root, data);
    }

    public int getNumLeaves() {
        return countLeafHelper(root);
    }

    public BST<T> extractBiggestSuperBalancedSubTree() {
        return null;
    }

    public BinaryNode<T> getNode(T data) {
        return getNodeHelper(root, data);
    }

    public boolean isSuperBalanced() {
        return false;
    }

    public BinaryNode<T> findMax() {
        return findMaxHelper(root);
    }

    public BinaryNode<T> findMin() {
        return findMinHelper(root);
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


    //=======Helper Functions=================Helper Functions=================Helper Functions=================Helper Functions=================Helper Functions=================Helper Functions=================Helper Functions==========

    private void insertHelper(BinaryNode<T> current, T data) {
        if(current.data.compareTo(data) < 0){
            if(current.right == null){
                current.right = new BinaryNode<T>(data);
                return;
            }
            else{
                insertHelper(current.right, data);
            }
        }
        else{
            if(current.data.compareTo(data) > 0){
                if(current.left == null){
                    current.left = new BinaryNode<T>(data);
                    return;
                }
                else{
                    insertHelper(current.left, data);
                }
            }
            
        }
    }

    private BinaryNode<T> deleteHelper(BinaryNode<T> current, T data) {
        
        if (current == null) {
            return current;
        }

        
        if (data.compareTo(current.data) < 0) {
            current.left = deleteHelper(current.left, data);
        } else if (data.compareTo(current.data) > 0) {
            current.right = deleteHelper(current.right, data);
        } else {
            // If data is the same as the current node's data, delete

            if (current.left == null) {   //has only a right child
                return current.right;
            } else if (current.right == null) {   //has only a left child
                return current.left;
            }

            
            // Node has both children, get the inorder successor (smallest in the right subtree)
            current.data = leftMost(current.right);

            // Delete the inorder successor
            current.right = deleteHelper(current.right, current.data);
        }

        return current;
    }

    private T leftMost(BinaryNode<T> current) {
        if (current.left == null) {
            return current.data;
        }
        return leftMost(current.left);
    }

    private boolean containsHelper(BinaryNode<T> current, T data){
        if(current == null){
            return false;
        }

        if(current.data.equals(data)){
            return true;
        }

        if(current.data.compareTo(data) > 0){
            return containsHelper(current.left, data);
        }
        
        return containsHelper(current.right, data);
    }

    private String printSearchHelper(BinaryNode<T> node, T data){
        if(node == null)
        {
            return null;
        }

        if(node.data.equals(data)){
            return node.data.toString();
        }

        if (node.data.compareTo(data) < 0) {
            return node.data.toString() +" -> " + printSearchHelper(node.right, data);
        }

        return node.data.toString() +" -> " + printSearchHelper(node.left, data);

    }

    private int countLeafHelper(BinaryNode<T> current) {
        if (current == null) {
            return 0;
        }

        // If the current node is a terminal node, return 1
        if (current.left == null && current.right == null) {
            return 1;
        }

        //count the number of terminal nodes in the left and right subtrees
        int leftTeminal = countLeafHelper(current.left);
        int rightTerminal = countLeafHelper(current.right);

        // Return the sum of terminal nodes in the left and right subtrees
        return leftTeminal + rightTerminal;
    }

    private BinaryNode<T> findMaxHelper(BinaryNode<T> current){
        if(current == null)
        {
            return null;
        }

        if(current.right == null){
            return  current;
        }

        return findMaxHelper(current.right);
    }
    
    private BinaryNode<T> findMinHelper(BinaryNode<T> current){
        if(current == null)
        {
            return null;
        }

        if(current.left == null){
            return  current;
        }

        return findMaxHelper(current.left);
    }

    private BinaryNode<T> getNodeHelper(BinaryNode<T> current, T data){
        if(current == null){
            return null;
        }

        if(current.data.equals(data)){
            return current;
        }

        if(current.data.compareTo(data) > 0){
            return getNodeHelper(current.left, data);
        }
        
        return getNodeHelper(current.right, data);
    }

}
