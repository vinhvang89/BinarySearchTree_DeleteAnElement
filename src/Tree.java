public class Tree {
    Node root;
    int size;
    public Tree(){

    }
    private class Node{
        Node left;
        Node right;
        int number;
        public Node(int number){
            this.number = number;
        }
    }
    public void insert(int number){
        if( root == null)
            root = new Node(number);
        else {
            Node parent = null;
            Node current = root;
            while (current!= null){
                if(number > current.number){
                    parent = current;
                    current = current.right;
                } else if( number < current.number){
                    parent = current;
                    current = current.left;
                } else
                    System.out.println("Cant insert " + number);
            }
            if(number < parent.number)
                parent.left = new Node(number);
            if( number> parent.number)
                parent.right = new Node(number);
        }
        size++;
    }
    public int findTheMostOfLeft(Node root){
        while (root.left != null){
            root = root.left;
        }
        return root.number;
    }
    public void delete(int number){
        root = deleteRec(root,number);
    }
    public Node deleteRec(Node root,int number){
        if( root == null)
            return null;
        if( number < root.number){
            root.left = deleteRec(root.left,number);
        } else if(number > root.number)
            root.right = deleteRec(root.right,number);
        else {
            if(root.left == null)
                return root.right;
            else if(root.right == null)
                return root.left;
            root.number = findTheMostOfLeft(root.right);
            root.right = deleteRec(root.right,root.number);
        }
        return root;
    }
    public void inorder(){
        inorder(root);
    }
    protected void inorder(Node root){
        if( root == null)
            return;
        inorder(root.left);
        System.out.print(root.number + " , ");
        inorder(root.right);
    }
}
