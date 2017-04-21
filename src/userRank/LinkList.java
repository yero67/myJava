package userRank;

public class LinkList {
	public Node head;

	public static class Node {
		int value;
		public Node next;

		public Node(int value) {
			this.value = value;
			next = null;
		}
	}

	public void push(int data) {
		Node n = new Node(data);
		n.next = head;
		head = n;
	}

	public void inserAfter(Node prev, int data) {
		Node newNode = new Node(data);
		newNode.next = prev.next;
		prev.next = newNode;
	}

	public void append(int data) {
		Node n = new Node(data);
		if (head == null) {
			head = new Node(data);
			return;
		}

		n.next = null;
		Node last = head;
		while (last.next != null) {
			last = last.next;
		}
		last.next = n;
	}

	public void delete(int key) {
		Node tmp = head, prev = null;
		if (tmp != null && tmp.value == key) {
			head = tmp.next;
			return;
		}
		if (tmp == null) {
			return;
		}
		while (tmp != null && tmp.value != key) {
			prev = tmp;
			tmp = tmp.next;
		}
		prev.next = tmp.next;
	}
	
	public void deleteNode(int position)
	{
		Node tmp = head;
		if(head==null)
		{
			return;
		}
		if(position==0)
		{
			head = tmp.next;
			return;
		}
		
		for(int i=0; tmp!=null && i<position-1; i++)
		{
			tmp = tmp.next;
		}
		
		if(tmp==null || tmp.next==null)
		{
			return;
		}
		Node n = tmp.next.next;
		tmp.next = n;
	}

	public int getCount() {
		Node n = head;
		int count = 0;
		if (head == null) {
			return 0;
		}

		while (n != null) {
			count++;
			n = n.next;
		}
		return count;
	}
	
	public int getNode(int index)
	{
		Node node = head;
		if(head==null)
		{
			return 0;
		}
		int count=0;
		while(node!=null)
		{
			if(count==index)
			{
				return node.value;
			}
			count++;
			node = node.next;			
		}
		return 0;
	}
	
	public int countNumber(int data)
	{
		Node n = head;
		if(head == null)
		{
			return 0;
		}
		int count=0;
		
		while(n!=null)
		{
			if(n.value==data)
			{
				count++;
			}
			n = n.next;
		}
		return count;
	}
	public void printList() {
		Node n = head;
		while (n != null) {
			System.out.print(n.value + " ");
			n = n.next;
		}
	}
}
