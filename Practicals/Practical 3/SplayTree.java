public class SplayTree {
    public Node root;
    /*
     * The functions below this line was given
     */

    @Override
    public String toString() {
        return (root == null ? "Empty Tree" : toString(root, "", true));
    }

    public String toString(Node node, String prefix, boolean end) {
        String res = "";
        if (node.right != null) {
            res += toString(node.right, prefix + (end ? "│   " : "    "), false);
        }
        res += prefix + (end ? "└── " : "┌── ") + node.toString() + "\n";
        if (node.left != null) {
            res += toString(node.left, prefix + (end ? "    " : "│   "), true);
        }
        return res;
    }

    public String toStringOneLine() {
        return (root == null ? "Empty Tree" : "{" + toStringOneLine(root) + "}");
    }

    public String toStringOneLine(Node node) {
        return node.toString()
                + (node.left == null ? "{}" : "{" + toStringOneLine(node.left) + "}")
                + (node.right == null ? "{}" : "{" + toStringOneLine(node.right) + "}");
    }

    public SplayTree() {
        root = null;
    }

    /*
     * The functions above this line was given
     */

    public SplayTree(String input) {
        if(input == "Empty Tree"){
            root = null;
        }
        else{
            
        }
    }

    public Node access(int studentNumber) {
        return access(studentNumber,null);
    }

    public Node access(int studentNumber, Integer mark) {
        if(root == null){
            root = new Node(studentNumber, mark);
        }
        Node result = search(root, studentNumber, mark);
        if(result != null){
            moveToRoot(result, result.parent);
        }
        moveToRoot(result, null);

        root.parent = null;
        return root;
        
    }

     public Node remove(int studentNumber) {
        Node node = access(studentNumber);

        Node right = node.right;
        root = root.left;

        if(root != null){
            Node curr = root;
            if(curr.right != null){
                while (curr.right.right != null) {
                    curr = curr.right; 
                }

                access(curr.right.studentNumber);
            }
            root.right = right;
            
        }
        else{
            root = right;
        }
        
        root.parent = null;


        return node;
    }

    // public String sortByStudentNumber() {
    // }

    // public String sortByMark() {
    // }


    // ======Helper functions======Helper functions======Helper functions======Helper functions======Helper functions======
    
    private Node search(Node current, int studentNumber, Integer mark) {

        if(current.studentNumber < studentNumber){
            if(current.right != null){
                return search(current.right, studentNumber, mark);
            }
            else{
                current.right = new Node(studentNumber, mark);
                current.right.parent = current;
                return current.right; //this the std number is not found so we insert. this node is then returned to be splayed by the splay function
            }
        }
        else{
            if(current.studentNumber > studentNumber){
                if(current.left != null){
                    return search(current.left, studentNumber, mark);
                }
                else{
                    current.left = new Node(studentNumber, mark);
                    current.left.parent = current;
                    return current.left; //this is when the std number is not found so we insert. this node is then returned to be splayed by the splay function
                }
            }else{
                if(mark != null){
                    current.mark = mark;
                }
                return current;
            }
        }
        

    }

    private void moveToRoot(Node x, Node parent) {
        while (x.parent != null) {
            if (x.parent.parent == null) {
                if (x == x.parent.left) {
                    rightRotate(x.parent);
                } else {
                    leftRotate(x.parent);
                }
            } else if (x == x.parent.left && x.parent == x.parent.parent.left) {
                rightRotate(x.parent.parent);
                rightRotate(x.parent);
            } else if (x == x.parent.right && x.parent == x.parent.parent.right) {
                leftRotate(x.parent.parent);
                leftRotate(x.parent);
            } else if (x == x.parent.right && x.parent == x.parent.parent.left) {
                leftRotate(x.parent);
                rightRotate(x.parent);
            } else {
                rightRotate(x.parent);
                leftRotate(x.parent);
            }
        }
    }

    private void rightRotate(Node x) {
        Node y = x.left;
        x.left = y.right;
        if (y.right != null) {
            y.right.parent = x;
        }
        y.parent = x.parent;
        if (x.parent == null) {
            root = y;
        } else if (x == x.parent.right) {
            x.parent.right = y;
        } else {
            x.parent.left = y;
        }
        y.right = x;
        x.parent = y;
    }

    // Helper method to perform a left rotation
    private void leftRotate(Node x) {
        Node y = x.right;
        x.right = y.left;
        if (y.left != null) {
            y.left.parent = x;
        }
        y.parent = x.parent;
        if (x.parent == null) {
            root = y;
        } else if (x == x.parent.left) {
            x.parent.left = y;
        } else {
            x.parent.right = y;
        }
        y.left = x;
        x.parent = y;
    }

    // private Node constructTree(char[] input, int index) {
    //     if (index >= input.length || input[index] == '}') {
    //         return null;
    //     }


    //     Node newNode = new Node(input[index]);

    //     // Move to the next character after '{'
    //     index++;

    //     // Build the left subtree
    //     newNode.left = constructTree(input, index);

    //     // Move to the next character after '}'
    //     index++;

    //     // Build the right subtree
    //     newNode.right = constructTree(input, index);

    //     // Move to the next character after '}'
    //     index++;

    //     return newNode;
    // }

}
