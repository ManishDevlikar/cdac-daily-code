package com.queue;

public class DeQueue {
	 int front1,front2,rear1,rear2;
	    int Maxsize;
	    int queue[];

	    void create_queue(int size)
	    {
	        Maxsize=size;
	        front1=0;
	        rear1=-1;
	        front2=Maxsize-1;
	        rear2=Maxsize;

	        queue=new int[Maxsize];
	    }
	    void enqueue1(int e) {
	        rear1++;
	        queue[rear1] = e;
	    }

	    void enqueue2(int e) {
	        rear2--;
	        queue[rear2] = e;
	    }
	    boolean is_full()
	    {
	        if(rear1==Maxsize-1 || rear2==0 || (rear1+1)==rear2)
	            return true;
	        else
	            return false;
	    }
	    int dequeue1()
	    {
	        int temp=queue[front1];
	        front1++;
	        return(temp);
	    }
	    int dequeue2()
	    {
	        int temp=queue[front2];
	        front2--;
	        return(temp);
	    }
	    boolean is_empty1()
	    {
	        if(front1>rear1)
	            return true;
	        else
	            return false;
	    }
	    boolean is_empty2()
	    {
	        if(front2<rear2)
	            return true;
	        else
	            return false;
	    }
	    void print_queue1()
	    {
	        for(int i=front1 ;i<=rear1;i++)
	            System.out.print(queue[i]+"--");
	    }
	    void print_queue2()
	    {
	        for(int i=front2 ;i>=rear2;i--)
	            System.out.print(queue[i]+"--");
	    }
}
