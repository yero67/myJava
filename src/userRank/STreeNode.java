package userRank;

import java.util.ArrayList;
import java.util.Stack;

public class STreeNode {
public TreeNode root;
	public static class TreeNode {

		public int data;
		public TreeNode left;
		public TreeNode right;

		public TreeNode(int item) {
			this.data = item;
			this.left = null;
			this.right = null;
		}
	}
	
	public ArrayList<Integer> preorderTravesal(TreeNode root)
	{
		ArrayList<Integer> result = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		if(root == null)
		{
			return null;
		}
		stack.push(root);
		while(!stack.isEmpty())
		{
			TreeNode n = stack.pop();
			result.add(n.data);
			if(n.right!=null)
			{
				stack.push(n.right);
			}
			if(n.left!=null)
			{
				stack.push(n.left);
			}
		}
		return result;
	}
}
