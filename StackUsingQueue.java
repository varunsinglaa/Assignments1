import java.util.ArrayDeque;
import java.util.Queue;
class StackUsingQueue<T>
{
	Queue<T> qa, qb;

	public StackUsingQueue()
         {
		qa = new ArrayDeque<>();
		qb = new ArrayDeque<>();
	}

	void add(T data)
	{
		while (!qa.isEmpty()) {
			qb.add(qa.peek());
			qa.poll();
		}


		qa.add(data);

		while (!qb.isEmpty()) {
			qa.add(qb.peek());
			qb.poll();
		}
	}

	public T poll()
	{
	
		if (qa.isEmpty()) 
                {
			
            System.exit(0);
			
		}

		T front = qa.peek();
		qa.poll();

		return front;
	}

	public static void main(String[] args)
	{
		int[] data1 = { 6, 2, 8, 4, 5 };

		
		StackUsingQueue a = new StackUsingQueue();

		for (int data : data1) 
                 {
			a.add(data);
		}

		for (int i = 0; i <= data1.length; i++) {
			System.out.println(a.poll());
		}
	}
}