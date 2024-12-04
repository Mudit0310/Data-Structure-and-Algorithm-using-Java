package Practice;
class ListNode{
	int data;
	ListNode next;
	
	public ListNode(int data)
	{
		this.data = data;
	}
}

public class StackUsingList {
	
	static ListNode head;
	public static void push(int data)
	{
		ListNode newnode = new ListNode(data);
		newnode.next = head;
		head = newnode;
	}
	
	public static void peek()
	{
		if(head == null)
		{
			System.out.println("Stack is empty!");
			return;
		}
		System.out.println(head.data);
	}
	
	public static void pop()
	{
		if(head == null)
		{
			System.out.println("Stack is empty!");
			return;
		}
		head = head.next;
	}
	
	public static void main(String args[])
	{
		push(20);
		push(30);
		pop();
		push(40);
		peek();
	}
}
