package Practice;
class LinkedList{
	int data;
	LinkedList next;
	
	public LinkedList(int data)
	{
		this.data =data;
		next = null;
	}
}

public class CircularLL {
	static LinkedList head =null;
	static LinkedList last =null;
	
	public static void insertAtBeginning(int data)
	{
		LinkedList temp = new LinkedList(data);
		if(head == null)
		{
			head = temp;
			last = temp;
			last.next = head;
		}else {
			temp.next = head;
			head = temp;
			last.next = head;
		}
	}
	
	public static void insertAtMiddle(int data, int pos)
	{
		LinkedList node = new LinkedList(data);
		LinkedList temp = head;
		int count = 1;
		while(temp!=last)
		{
			if(pos == count)
			{
				node.next = temp.next;
				temp.next = node;
				break;
			}
			temp = temp.next;
			count++;
		}
	}
	
	public static void insertAtEnd(int data)
	{
		LinkedList temp = new LinkedList(data);
		last.next = temp;
		temp.next = head;
		last = temp;
	}
	
	public static void deleteFromHead()
	{
		head = head.next;
		last.next = head;
	}
	
	public static void deleteFromMiddle(int pos)
	{
		int count = 1;
		LinkedList temp = head;
		while(temp!=last)
		{
			if(pos == count)
			{
				temp.next = temp.next.next;
				break;
			}
			temp = temp.next;
			count++;
		}
	}
	
	public static void deleteFromEnd()
	{
		LinkedList temp = head;
		while(temp.next!=last)
		{
			temp = temp.next;
		}
		temp.next = head;
	}
	
	public static void displayLinkedList()
	{
		LinkedList temp = head;
		do {
			System.out.print(temp.data + "\t");
			temp = temp.next;
		}while(temp!=head);
	}
	
	public static void main(String args[])
	{
		insertAtBeginning(10);
		insertAtBeginning(11);
		insertAtBeginning(12);
		displayLinkedList();
		insertAtEnd(21);
		insertAtEnd(22);
		System.out.println();
		displayLinkedList();
		deleteFromHead();
		System.out.println();
		displayLinkedList();
		System.out.println();
		deleteFromEnd();
		displayLinkedList();
		System.out.println();
		insertAtMiddle(41,1);
		displayLinkedList();
		System.out.println();
		deleteFromMiddle(1);
		displayLinkedList();
	}
}
