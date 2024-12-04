package Practice;
class StackArray{
	int front;
	int rear;
	int capacity;
	int arr[];
	
	public StackArray(int capacity)
	{
		this.capacity=capacity;
		int front =	 -1;
		int rear = -1;
		arr = new int[capacity];
	}
	
	public void Enqueue(int data)
	{
		if(rear == arr.length-1)
		{
			System.out.println("Queue Overflow!");
			return;
		}
		else {// if queue is empty
			if(front == -1 && rear == -1)
			{
				//update the value of front and read as an element has to be entered
				front = 0;
				rear = 0;
			}
			
			arr[rear++] = data;//add data into queue
		}
	}
	
	public void Dequeue()
	{
		if(front == -1 || front > rear)
		{
			System.out.println("Queue Underflow!");
			return;
		}
		
		if(front==rear)//queue contains only one element and that has to be deleted
		{
			front = rear = -1;
		}
		
		else {
			front++;
		}
	}
	
	public void display()
	{
		for(int i=front;i<rear;i++)
		{
			System.out.println(arr[i]);
		}
	}
}

public class QueueUsingArray {
	
	public static void main(String args[])
	{
		StackArray sa = new StackArray(5);
		sa.Enqueue(3);
        sa.Enqueue(6);
        sa.Enqueue(9);
        sa.Enqueue(12);
        sa.Dequeue();
        sa.display();
	}
}
