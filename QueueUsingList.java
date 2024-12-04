package Practice;
class LinkedListN{
	int data;
	LinkedListN next;
	
	public LinkedListN(int data)
	{
		this.data = data;
	}
}

public class QueueUsingList {
	
	static LinkedListN head;
	
	public static void Enqueue() {
		LinkedListN temp = head;
		while(temp!=null)
		{
			if(temp.next.next == null)
			{
				temp.next = temp.next.next;
			}
			temp = temp.next;
		}
	}
	
	public static void Dequeue(int data)
	{
		LinkedListN temp = new LinkedListN(data);
		temp.next = head;
		head = temp;
	}
	
	public static void display()
	{
		LinkedListN temp = head;
		while(temp!=null)
		{
			System.out.print(temp.data + "\t");
			temp = temp.next;
		}
	}
	
	public static void main(String args[])
	{
		Dequeue(15);
		Dequeue(17);
		Dequeue(18);
		Dequeue(25);
		display();
		System.out.println();
		Enqueue();
		display();
		Dequeue(27);
		System.out.println();
		display();
	}
}
