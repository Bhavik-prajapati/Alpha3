package BST;

import java.security.SecureRandom;
import java.util.ArrayList;

public class BST {

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
        }
    }
    public static Node insert(Node root,int val){

        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
            root.left=insert(root.left,val);
        }else{
            root.right= insert(root.right,val);
        }
        return root;
    }
    public  static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static boolean Search(Node root, int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        if(root.data>key){

            return Search(root.left,key);

        }else{
            return Search(root.right,key);
        }

    }
    public static Node delete(Node root,int val)
    {
        if(root.data<val){
            root.right=delete(root.right,val);
        }else if(root.data>val){
            root.left=delete(root.left,val);
        }else{
            if(root.left==null && root.right==null){
                return null;
            }

            //case-2

            if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }
            Node is=findinorderSuccessor(root.right);
            root.data=is.data;
            root.right=delete(root.right,is.data);
        }
        return root;
    }

    private static Node findinorderSuccessor(Node root) {
        while (root.left!=null){
            root=root.left;
        }
        return root;
    }

    public static void printinRange(Node root,int k1,int k2){
        if(root==null)
        {
            return;
        }
        if(root.data>=k1 && root.data<=k2){

            printinRange(root.left,k1,k2);
            System.out.print(root.data+" ");
            printinRange(root.right,k1,k2);

        }else if(root.data<k1){
            printinRange(root.left,k1,k2);
        }else{
            printinRange(root.right,k1,k2);
        }
    }

    public static void printPath(ArrayList<Integer> path){
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i)+"->");

        }
        System.out.println("Null");
    }

    public static void prinRoot2Leaf(Node root, ArrayList<Integer> path){

        if(root== null){
            return;
        }
        path.add(root.data);
        if(root.left==null && root.right==null){
            printPath(path);
        }
        prinRoot2Leaf(root.left,path);
        prinRoot2Leaf(root.right,path);
        path.remove(path.size()-1);
    }

    public static boolean isValidBst(Node root,Node min,Node max){
        if(root==null){
            return true;
        }
        if(min!=null && root.data<=min.data){
            return false;
        }else if(max!=null && root.data>=max.data){
            return false;
        }

        return isValidBst(root.left,min,root) &&
                isValidBst(root.right,root,max);

    }






    public static void main(String[] args) {
        int[] values ={8,5,3,6,10,11,14};

        Node root=null;
        for (int i = 0; i <values.length ; i++) {
            root=insert(root,values[i]);
        }

//        inorder(root);
//        System.out.println();
//        if(Search(root,7)){
//            System.out.println("found");
//        }else{
//            System.out.println("not found");
//        }
//        root=delete(root,1);
//        System.out.println();
//        System.out.println();
//        printinRange(root,5,12);
////        inorder(root);
//        prinRoot2Leaf(root,new ArrayList<Integer>());

        if(isValidBst(root,null,null)){
            System.out.println("valid");
        }else{
            System.out.println("not valid..");
        }


    }
}

