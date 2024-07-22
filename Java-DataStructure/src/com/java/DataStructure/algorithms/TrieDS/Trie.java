package com.java.DataStructure.algorithms.TrieDS;

public class Trie {
 public TrieNode root;
 public Trie() {
	 root=new TrieNode();
	 System.out.println("trie has been created successfully...");
 }
 
 public void Insert(String word) {
	 TrieNode current=root;
	 for (int i = 0; i < word.length(); i++) {
		char ch=word.charAt(i);
		TrieNode node=current.children.get(ch);
		if(node==null) {
			 node=new TrieNode();
			current.children.put(ch, node);
		}
		current=node;
	}
	 current.endOfString=true;
	 System.out.println("Successfully "+ word+ " added in tie");
 }
 public boolean Search(String word) {
	 TrieNode current=root;
	 for (int i = 0; i < word.length(); i++) {
		char ch=word.charAt(i);
		TrieNode node=current.children.get(ch);
		if(node==null) {
			System.out.println(word+" does not exist in trie");	
			return false;
		}
		current=node;		
	}
	 if(current.endOfString==true) {
		 System.out.println(word+" exist in trie");	
		 return true;
	 }else {
		 System.out.println(word+" is prifix of string in trie");	
	 }
	 return current.endOfString;
 }
}
