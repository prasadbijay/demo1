package com.binarytree;

class Node{
	int key;
	Node left,right;
	public Node(int item) {
		key=item;
		left=right=null;
	}
	
}
public class BinaryTree {
	Node root;
	BinaryTree(){
		root=null;
	}
	void insert(int key) {
		root=insertRec(root,key);
	}
	 Node insertRec(Node root, int key) {
		 if(root==null) {
			 root=new Node(key);
			 return root;
		 }
	if (key<root.key) 
		root.left=insertRec(root.left,key);
		else if(key> root.key)
			root.right=insertRec(root.right,key);
	 return root;
		
	}
	 void inorder() {
		 inorderRec( root);
	 }
	 void inorderRec(Node root) {
		 if (root!=null) {
			 inorderRec(root.left);
			 System.out.println(root.key+" ");
			 inorderRec(root.right);
		 }
	 }
	 boolean search(int key) {
		 return searchRec(root,key);
	 }
	 boolean searchRec(Node root,int key) {
		 if(root ==null) {
			 return false;
		 }
		 if(root.key==key) {
			 return true;
		 }
		 if(root.key< key) {
			 return searchRec(root.right,key);
		 }
		return searchRec(root.left,key);
	 }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree=new BinaryTree();
		tree.insert(50);
		tree.insert(20);
		tree.insert(60);
		tree.insert(10);
		tree.insert(70);
		tree.insert(30);
		tree.insert(40);
		
		System.out.println(" in-order traversal of the given tree: ");
		tree.inorder();
		System.out.println();
		int key=100;
		if(tree.search(key)) {
			System.out.println("key"+key+" found in BST: ");
		}
		else {
			System.out.println("key"+ key+" not found in BST: ");
		}
	}

}
