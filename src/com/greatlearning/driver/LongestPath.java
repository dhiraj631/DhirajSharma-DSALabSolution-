package com.greatlearning.driver;
import java.util.ArrayList;


public class LongestPath {
	   static class Node{
		   int data;
		   Node right, left;
		   
		   public Node (int data) {
			   this.data = data;
			   left = right = null;
		   }
		   
	   }

	   private static ArrayList<Integer> findLongestPath(Node root) {
		   if (root.left == null && root.right == null) {
		    ArrayList<Integer> a = new ArrayList<Integer>();
		    a.add(root.data);
		    return a;
		   }
		   
		   ArrayList<Integer> L = findLongestPath(root.left);
		   
		   ArrayList<Integer> R = findLongestPath(root.left); 
		   
		   if (L.size() > R.size() ) {
			  L.add( root.data );
			  return L;
			  
		   }
		   else
		   {
			   R.add( root.data );
			   return R;
		   }
			   
		// return ()
		   
	   }

	  public static void main (String[] args)
	  {
		Node root = new Node(100);
		root.left = new Node (20);
		root.right = new Node (130);
		root.left.left = new Node(10);
		root.left.right = new Node(50);
		root.right.left = new Node(110);
		root.right.right = new Node(140);
		root.left.left.left = new Node(5);
		
		ArrayList<Integer> longestPath = findLongestPath(root);
		System.out.println(longestPath.size());
		int n = longestPath.size();
		
		System.out.print(longestPath.get(n - 1));
	    for (int i = longestPath.size() - 2; i>= 0; i--) {
	    	System.out.print(" -> " + longestPath.get(i) );
	    }
	 }
	} 
