package com.queue;

public class Queue_Class {
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
