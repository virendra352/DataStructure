package com.java.DataStructure.algorithms.TrieDS;

public class MainTrie {
public static void main(String[] args) {
	Trie t=new Trie();
	t.Insert("AIR");
	t.Insert("ATS");
	t.Search("MAN");
	t.Search("AT");
	t.Search("ATS");
   }
}
