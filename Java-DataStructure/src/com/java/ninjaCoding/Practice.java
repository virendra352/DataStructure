package com.java.ninjaCoding;
public class Practice {
public static void main(String[] args) {
	String s="ghffhgsdhhh";
	String sn="";
	int count=1;
	for(int i=0;i<s.length()-1;i++) {
		
		if(s.charAt(i)==s.charAt(i+1)) {
			count++;
		}else {
			sn=sn+Integer.toString(count)+s.charAt(i);
			count=1;
		}
		if(i+1==s.length()-1&&count==1) {
			sn=sn+Integer.toString(1)+s.charAt(i+1);
		}else if(count>1&&i==s.length()-2) {
			sn=sn+Integer.toString(count)+s.charAt(i+1);
		}
	}
	System.out.println(sn);
}
}
