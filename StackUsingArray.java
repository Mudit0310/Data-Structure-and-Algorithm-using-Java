package Practice;

class Operations{
	int arr[];
	int capacity = 5;
	int top = -1;
	
	public Operations(int capacity)
	{
		super();
		arr = new int[capacity];
	}
	
	public void push(int data)
	{
		if(isFull())
		{
			System.out.println("Stack is full");
		}
		else {
			arr[++top] = data;
		}
	}
	
	public void pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack is Empty");
		}
		else {
			arr[top] = 0;
			top--;
		}
	}
	
	public void peek()
	{
		System.out.println("Top element is " + arr[top]);
	}
	
	
	public boolean isFull()
	{
		return top == capacity-1;
	}
	
	public boolean isEmpty()
	{
		return top == -1;
	}
}
public class StackUsingArray {
	public static void main(String args[])
	{
		Operations o = new Operations(10);
		o.push(10);
		o.push(20);
		o.peek();
		o.pop();
		o.peek();
	}
}
