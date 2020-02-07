package com.company;

public class MyBinaryTree {

    public static class TreeNode{
        int key;
        private TreeNode left,right;

        public TreeNode(int key) {
            this.key = key;
            left=right=null;
        }
    }
    TreeNode root;

    public MyBinaryTree() {
        root=null;
    }

    public void insert(int key){
        root=insertRec(root,key);
    }

    private TreeNode insertRec(TreeNode root,int key){
        if(root==null){
            root=new TreeNode(key);
            return root;
        }
        if(key<root.key)
            root.left=insertRec(root.left,key);
        else if (key>root.key)
            root.right = insertRec(root.right,key);

    return root;
    }

    private TreeNode searchNode(TreeNode root,int key){
        if(root==null){
            System.out.println("Was not found");
            return null;
        }
        if(root.key==key) {
            System.out.println("Found");
            return root;
        }
        if(root.key>key)
            return searchNode(root.left,key);
        if(root.key<key)
            return searchNode(root.right,key);

        System.out.println("Was not found");
        return null;
    }

    public void search(int key){
        searchNode(root,key);
    }


    public void inorder(){
        inorderRec(root);
    }

    private void inorderRec(TreeNode root) {
        if(root!=null){
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }


}
