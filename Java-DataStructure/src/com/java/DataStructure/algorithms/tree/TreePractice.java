package com.java.DataStructure.algorithms.tree;

public class TreePractice {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    //Binary search tree
     void Insert(Node node,int value){
        if(value<node.data){
            if(node.left!=null){
                Insert(node.left,value);
            }else{
                System.out.println("Inserted "+value+ " to left of "+ node.data);
                node.left=new Node(value);
            }
        } else if (value>node.data) {
            if(node.right!=null){
                Insert(node.right,value);
            }else{
                System.out.println("Inserted "+value+ " to Right of "+ node.data);
                node.right=new Node(value);
            }
        }
     }

     void TraverseInOrder(Node node){
        if(node!=null){
            TraverseInOrder(node.left);
            System.out.println(" "+node.data);
            TraverseInOrder(node.right);
        }
     }
    public static void main(String[] args) {
        TreePractice tree=new TreePractice();
        Node root=new Node(5);
        tree.Insert(root,4);
        tree.Insert(root,6);
        tree.TraverseInOrder(root);


    }
}
