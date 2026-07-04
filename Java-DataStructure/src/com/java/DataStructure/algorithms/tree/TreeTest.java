package com.java.DataStructure.algorithms.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeTest {

    public static class Node{
        int data;
         Node left;
         Node right;
         public Node(int data){
             this.data=data;
         }

    }

    Node root;
    public void Insert(int data, Scanner scanner){
        if(root==null){
            root=new Node(data);
        }
        InsertNode(root,scanner);
    }

    private void InsertNode(Node node,Scanner scanner) {
        System.out.println("insert the node in left");
        boolean left=scanner.nextBoolean();
        if(left) {
            System.out.println("Enter the left node data");
            int data=scanner.nextInt();
            node.left=new Node(data);
            InsertNode(node.left,scanner);
        }else {
            System.out.println("Enter the right node data");
            int data=scanner.nextInt();
            node.right=new Node(data);
            InsertNode(node.right,scanner);
        }
    }

    public static void main(String[] args) {
        TreeTest treeTest=new TreeTest();
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the root node >>>");
//        int rootData=sc.nextInt();
//        treeTest.Insert(rootData,sc);
        Node root=new Node(60);
        /*treeTest.InsertBST(root,50);
        treeTest.InsertBST(root,70);
        treeTest.InsertBST(root,55);
        treeTest.InsertBST(root,40);
        treeTest.InsertBST(root,65);
        treeTest.InsertBST(root,80);*/

        treeTest.InsertLevel(root,1);
        treeTest.InsertLevel(root,2);
        treeTest.InsertLevel(root,3);
        treeTest.InsertLevel(root,4);
        treeTest.InsertLevel(root,5);
        treeTest.InsertLevel(root,6);
        InorderPrint(root);


    }

    private static void InorderPrint(Node root) {
        if(root==null){
            return;
        }
        InorderPrint(root.left);
        System.out.println(root.data);
        InorderPrint(root.right);
    }

    private Node InsertLevel(Node root, int data) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node temp=q.remove();

            if(temp.left!=null){
                q.add(temp.left);
            }else {
                temp.left=new Node(data);
                return root;
            }
            if(temp.right!=null){
                q.add(temp.right);
            }else {
                temp.right=new Node(data);
                return root;
            }
        }
        return root;
    }

    private void InsertBST(Node node, int data) {
        if(data< node.data){
            if(node.left!=null){
              InsertBST(node.left,data);
            }else {
                System.out.println("Node Inserted successfully in left at "+data);
                node.left=new Node(data);
            }
        }else{
            if(node.right!=null){
                InsertBST(node.right,data);
            }else {
                System.out.println("Node Inserted successfully  in right at "+data);
                node.right=new Node(data);
            }
        }
    }
}
