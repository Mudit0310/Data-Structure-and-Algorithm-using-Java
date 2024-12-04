package Practice;
class queue{
	int capacity;
	int front;
	int rear;
	int arr[];
	
	public queue(int capacity)
	{
		this.capacity= capacity;
		this.front = -1;
		this.rear = -1;
		arr = new int[capacity];
	}
	
	public void enqueue(int data)
	{
		if((rear+1)%capacity == front)
		{
			System.out.println("Stack is full");
		}
		else {
			if(front == -1)
			{
				front =0;
			}
			
			rear = (rear+1)%capacity;
			arr[rear] = data;
		}
	}
	public void dequeue()
	{
		if(rear == -1)
		{
			System.out.println("Stack is empty");
		}
		
		else {
			//if there is only single element in stack
			if(front == 0 && rear == 0)
			{
				front = -1;
				rear = -1;
			}
			
			front = (front + 1)%capacity;
		}
	}
	
	public void displayQueue()
	{
		int i = front;
		while(true)
		{
			System.out.print(arr[i] + "\t");
			if(i == rear) {
				break;
			}
			i = (i+1)%capacity;
		}
	}
}

public class CircularQueue {
	public static void main(String args[])
	{
		queue q = new queue(5);
		q.enqueue(4);
		q.enqueue(8);
		q.enqueue(1);
		q.enqueue(9);
		q.enqueue(3);
		q.dequeue();
		q.displayQueue();
	}
}
