
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

    public String sortByStudentNumber() {
        
        if(root == null){
            return "Empty Tree";
        }

        StringBuilder sb = new StringBuilder();
        studentNumberHelper(root, sb);
        return sb.toString();
    }

    public String sortByMark() {

        String stringOfNodes = sortByStudentNumber();

        int count = 0;
        for (int i = 0; i < stringOfNodes.length(); i++) {
            if (stringOfNodes.charAt(i) == '[') {
                count++;
            }
        }

        Node[] nodes = parseNodes(sortByStudentNumber(), count);

        sortNodes(nodes);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nodes.length; i++) {
            sb.append(nodes[i].toString());
        }
        
        return sb.toString();
    }


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
                } 
                else{
                    leftRotate(x.parent);
                }
            } 
            else 
                if (x == x.parent.left && x.parent == x.parent.parent.left) {
                    rightRotate(x.parent.parent);
                    rightRotate(x.parent);
                }
            else 
                if (x == x.parent.right && x.parent == x.parent.parent.right) {
                    leftRotate(x.parent.parent);
                    leftRotate(x.parent);
                } 
            else 
                if (x == x.parent.right && x.parent == x.parent.parent.left) {
                    leftRotate(x.parent);
                    rightRotate(x.parent);
                }
            else {
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
        } 
        else 
            if (x == x.parent.right) {
                x.parent.right = y;
            } 
        else {
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
        } 
        else 
            if (x == x.parent.left) {
                x.parent.left = y;
            } 
        else {
            x.parent.right = y;
        }
        y.left = x;
        x.parent = y;
    }

    private void studentNumberHelper(Node curr, StringBuilder sb){
        if(curr != null){
            studentNumberHelper(curr.left, sb);
            sb.append(curr.toString());
            studentNumberHelper(curr.right, sb);
        }
    }


    private static Node[] parseNodes(String input, int noOfNodes) {
        String[] nodeStrings = splitNodes(input, "][", noOfNodes);

        Node[] nodes = new Node[nodeStrings.length];
        for (int i = 0; i < nodeStrings.length; i++) {
            
            String nodeString = nodeStrings[i].replace("[", "").replace("]", "");
            String[] parts = splitNodes(nodeString, ":",noOfNodes);
            int studentNumber = Integer.parseInt(parts[0].substring(1)); // Remove the "u" prefix

            Integer mark;
            if(parts[1].split("%")[0].equals("null")){
                mark = null;
            }
            else{
                mark = Integer.parseInt(parts[1].split("%")[0]);
            }
            
            nodes[i] = new Node(studentNumber, mark);
        }
        return nodes;
    }

    private static String[] splitNodes( String delim, String str, int noOfNodes) {
        String[] partsArray = new String[noOfNodes];
        int arrayIndex = 0;
        int beginning = 0;
        int index = str.indexOf(delim, beginning);

        while (index  != -1) {
            partsArray[arrayIndex] = str.substring(beginning, index);
            beginning = index + delim.length();
            index = str.indexOf(delim, beginning);
            arrayIndex++;
        }

        partsArray[arrayIndex] = str.substring(beginning);
        return partsArray;
    }

    private static void sortNodes(Node[] nodes) {
        
        for (int i = 0; i < nodes.length - 1; i++) {
            for (int j = 0; j < nodes.length - i - 1; j++) {
                if (compare(nodes[j], nodes[j+1]) > 0) {
                    Node temp = nodes[j];
                    nodes[j] = nodes[j + 1];
                    nodes[j + 1] = temp;
                }
            }
        }
    }

    private static int compare(Node node1, Node node2) {
        
        if (node1.mark == null && node2.mark == null) {
            return Integer.compare(node1.studentNumber, node2.studentNumber);
        } 

        if (node1.mark == null) {
            return -1;
        }

        if (node2.mark == null) {
            return 1;
        } 
            
        return Integer.compare(node1.mark, node2.mark);
    
    }
}
