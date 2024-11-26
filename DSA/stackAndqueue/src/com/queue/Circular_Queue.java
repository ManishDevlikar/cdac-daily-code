package com.queue;

public class Circular_Queue {
	  //data members
    int front,Maxsize, rear,queue[], count;
    //function members
   void create_queue(int size)
        {
            front=0;
            count=0;
            Maxsize=size;
            rear=-1;
            queue=new int[Maxsize];
        }
    void enqueue(int e)
    {
        rear=(rear+1)%Maxsize;
        queue[rear]=e;
        count++;
    }
    boolean is_full()
    {
    	return count==Maxsize?true:false;
    }
    int dequeue()
    {
        int temp=queue[front];
        front = (front+1)%Maxsize;
        count--;
        return(temp);
    }
    int peek()
    {
        return(queue[front]);
    }
    boolean is_empty()
    {
    	return count==0?true:false;
    }
    void print_queue()
    {
        int c=0;int i=front;
        
        while(c<count) {
        	System.out.print(queue[i]);
        	i=(i+1)%Maxsize;
        	c++;
        }
    }
}
