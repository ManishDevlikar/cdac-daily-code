package com.queue;

public class PriorityQueue {
	  //data members
    int front,Maxsize, rear,queue[];
    //function members
   void create_queue(int size)
        {
            front=0;
            Maxsize=size;
            rear=-1;
            queue=new int[Maxsize];
        }
    void enqueue(int e)
    {
        rear++;
        queue[rear]=e;
        
        for(int i= front; i<rear; ++i) {
        	for(int j=front; j<rear; ++j) {
        		if(queue[j]>queue[j+1]) {
        			int temp = queue[j];
        			queue[j] = queue[j+1];
        			queue[j+1]= temp;
        		}
        	}
        }
    }
    boolean is_full()
    {
        if(rear==Maxsize-1)
            return true;
        else
            return false;
    }
    int dequeue()
    {
        int temp=queue[front];
        front++;
        return(temp);
    }
    int peek()
    {
        return(queue[front]);
    }
    boolean is_empty()
    {
        if(front>rear)
            return true;
        else
            return false;
    }
    void print_queue()
    {
        for(int i=front ;i<=rear;i++)
            System.out.print(queue[i]+"->");
    }

}
