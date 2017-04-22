package testJava;

import java.util.Scanner;

public class run {

	public static void main(String[] args) throws Exception {

	       Scanner in = new Scanner(System.in);
	        String ipv4 = in.nextLine();
	        String[] ip = ipv4.split("\\.");
	        String ipString = " ";
	        for(int i=0; i<ip.length; i++)
	        {
	            ipString += Integer.toBinaryString(Integer.parseInt(ip[i]));
	        }
	        int res = Integer.parseInt(ipString.trim(), 2);
	        System.out.println(res);
		
		
	      /*  STreeNode tree = new STreeNode();
	        tree.root = new TreeNode(1);
	        tree.root.left = new TreeNode(2);
	        tree.root.right = new TreeNode(3);
	        tree.root.left.left = new TreeNode(4);
	        tree.root.left.right = new TreeNode(5); 
	        
	        ArrayList<Integer> list = tree.preorderTravesal(tree.root);
	        for (Integer integer : list) {
				System.out.print(integer+" ");
			}*/
        
		/*Queue<String> player1 = new LinkedList<String>();
		Queue<String> player2 = new LinkedList<String>();
		
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			String cardp1 = in.next();
			player1.offer(cardp1.replace("A", "-1"));
		}
		
		int m = in.nextInt();
		for (int i = 0; i < m; i++) {
			String cardp2 = in.next();
			player2.offer(cardp2);
		}
		
		for(int i = 0; i < n; i++){
			String cartP1 = player1.element();
			String cartP2 = player2.element();
		}
		for (Iterator<String> iterator = player1.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);			
		}		
		for (Iterator<String> iterator = player2.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}*/
		
	}
	
	
}

/*
Scanner in = new Scanner(System.in);
        String message = in.nextLine();
        int n = message.length()/2;
        char[][] tab = new char[n][n];
        for(int i=0; i <n; i++)
        {
            for(int j=0; j<n; j++)
            {
                tab[i][j] = message.charAt(i);
            }
        }
        String res = "";
        for(int i=0; i <n; i++)
        {
            for(int j=0; j<n; j++)
            {
                res += tab[j][i] ;
            }
        }

        System.out.println(res);
*/
