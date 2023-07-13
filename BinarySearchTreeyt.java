public class BinarySearchTreeyt {

    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int d)
        {
            this. data = d;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insertBST(Node root, int d)
    {
        Node newnode = new Node(d);
        if(root == null)
        {
            root = newnode;
            return root;
        }
        else {
            if(root.data>d)
                root.left =  insertBST(root.left,d);
            else
                root.right =  insertBST(root.right,d);
        }
        return root;
    }
    public static void inorder(Node root)
    {
        if(root == null)
            return;

        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);

    }

    public static boolean Search(Node root, int k)
    {
        if(root == null)
            return false;

        if(root.data == k)
            return true;

        if(root.data>k)
            return Search(root.left,k);

        else
            return Search(root.right,k);

    }
    public static Node delete(Node root, int val) {
        if (root.data > val)
            root.left = delete(root.left, val);
        else if (root.data < val) {
            root.right = delete(root.right, val);
        } else {

            //Case 1
            if (root.left == null && root.right == null)
                return null;

            //Case 2

            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            //Case 3

            Node IS = inorderSucc(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data); //Deleting inorder successor
        }
        return root;
    }
        public static Node inorderSucc(Node root){
            while(root.left != null)
                root = root.left;

            return root;

    }


    public static void main(String[] args) {
        int values[] = {8,5,3,1,4,6,10,11,14};

        Node root = null;

        for(int i =0;i< values.length;i++)
        {
            root = insertBST(root,values[i]);
        }
        inorder(root);
        System.out.println(Search(root,5));

        delete(root , 5);

        inorder(root);
       // System.out.println(Search(root,5));



    }

}
