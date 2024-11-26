package com.stack;
public class Stack_Class
{
   //data members
    int tos,Maxsize,stack[];
    //function members
   void create_stack(int size)
        {
            tos=-1;
            Maxsize=size;
            stack=new int[Maxsize];
        }
    void push(int e)
    {
        tos++;
        stack[tos]=e;//stack[++tos]=e;
    }
    boolean is_full()
    {
        if(tos==Maxsize-1)
            return true;
        else
            return false;
    }
    int pop()
    {
        int temp=stack[tos];
        tos--;
        return(temp);
    }
    int peek()
    {
        return(stack[tos]);
    }
    boolean is_empty()
    {
        if(tos==-1)
            return true;
        else
            return false;
    }
    void print_stack()
    {
        for(int i=tos ;i>-1;i--)
            System.out.print(stack[i]);
    }




}