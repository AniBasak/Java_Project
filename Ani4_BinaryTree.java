//import java.util.*;

//import java.net.SocketTimeoutException;

public class Ani4_BinaryTree{

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int idx = -1;
        public Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public void preorder(Node root)
        {
            if(root == null)
            {
                return; 
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }

        public void inorder(Node root)
        {
            if(root == null)
            {
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }

        public void postorder(Node root)
        {
            if(root == null)
            {
                return;
            }
            postorder(root.right);
            postorder(root.left);
            System.out.print(root.data+" ");
        }
    } 



    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);  
        System.out.println(root.data);
        System.out.print("Preorder Traversel : ");
        tree.preorder(root);
        System.out.println("");
        System.out.print("Inorder Traversel : ");
        tree.inorder(root);
        System.out.println("");
        System.out.print("Postorder Traversel : ");
        tree.postorder(root);
    }
}