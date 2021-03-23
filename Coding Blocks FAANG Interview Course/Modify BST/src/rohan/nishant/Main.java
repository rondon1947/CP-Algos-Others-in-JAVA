package rohan.nishant;

import java.util.Scanner;

public class Main {

    class Tree {
        int data;
        Tree left, right;
        Tree(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
        Tree createTree() {
            Scanner sc = new Scanner(System.in);
            int data;
            data = sc.nextInt();
            if (data == -1)
                return null;
            Tree root = new Tree(data);
            root.left = createTree();
            root.right = createTree();
            return root;
        }
        void preOrder(Tree root) {
            if (root == null)
                return;
            System.out.print(root.data + "\t");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public static void main(String[] args) {
        Tree tree = null;
        tree.createTree();
    }
}
