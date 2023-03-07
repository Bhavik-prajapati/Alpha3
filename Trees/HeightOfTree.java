package Trees;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class HeightOfTree {

    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    }

  public static int count(Node root){
        if(root==null){
            return 0;
        }
        int lh=count(root.left);
        int rh=count(root.right);
        return (lh+rh)+1;
    }

    public static int SumofNodes(Node root){
        if(root==null){
            return 0;
        }
        int lh=SumofNodes(root.left);
        int rh=SumofNodes(root.right);
        return (lh+rh)+root.data;
    }


    public static int diameter2(Node root){
        if (root == null) {
            return 0;
        }
        int leftdiam=diameter2(root.left);
        int leftHt=height(root.left);
        int rightdiam=diameter2(root.right);
        int rightHt=height(root.right);

        int selfdiam=leftHt+rightHt;
        return  Math.max(selfdiam,Math.max(leftdiam,rightdiam));
    }

    static class Info2{
        int diam;
        int ht;
        public Info2(int diam,int ht){
            this.diam=diam;
            this.ht=ht;
        }
    }
    public static Info2 diameter(Node root){
        if(root==null){
            return new Info2(0,0);
        }
        Info2 leftinfo=diameter(root.left);
        Info2 rightinfo=diameter(root.right);
        int diam=Math.max(Math.max(leftinfo.diam,rightinfo.diam),leftinfo.ht+rightinfo.ht+1);
        int ht=Math.max(leftinfo.ht,rightinfo.ht)+1;
        return new Info2(diam,ht);
    }



    public static boolean isSubtree(Node root,Node subRoot){
        if(root.data==subRoot.data){
            if(Isidentical(root,subRoot)){
                return true;
            }
        }
        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);

    }

    public static boolean Isidentical(Node node, Node subRoot) {

        if(node==null && subRoot==null){
            return true;
        }
        else if(node==null || subRoot==null || node.data!=subRoot.data){
            return false;
        }

        if(!Isidentical(node.left,subRoot.left)){
            return false;
        }
        if(!Isidentical(node.right,subRoot.right)){
            return false;
        }

        return true;

    }

    static class Info{
        int node;
        int hd;
        public Info(int node,int hd){
            this.node=node;
            this.hd=hd;
        }
    }



    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
//        --------------
//        Node subroot=new Node(2);
//        subroot.left=new Node(4);
//        subroot.right=new Node(5);

//        System.out.println(height(root));
//        System.out.println(count(root));
//        System.out.println(SumofNodes(root));
//        System.out.println(diameter2(root));
//        System.out.println(diameter(root).diam);
//        System.out.println(diameter(root).ht);
//        System.out.println(isSubtree(root,subroot));


    }

}

