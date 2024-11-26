package com.linkedlist;

public class Linear_Linked_List
{
    Node root;

    void create_List()
    {
        root=null;
    }
    void insert_left(int data)
    {
        Node n=new Node(data);
        if(root==null)
            root=n;//first
        else
        {
            n.next=root;//1
            root=n; //2
        }
        System.out.println(data+" inserted");
    }
    void delete_left()
    {

        if(root==null)
            System.out.println("\nList Empty");
        else
        {
            Node t=root;//1
            root=root.next;//2
            System.out.println(t.data+" deleted");//3
        }

    }
    void insert_right(int data)
    {
        Node n=new Node(data);
        if(root==null)
            root=n;//first
        else
        {
            Node t=root;//1
            while(t.next!=null)//2
                t=t.next;
            t.next=n;//3
        }
        System.out.println(data+" inserted");
    }
    void delete_right()
    {

        if(root==null)
            System.out.println("\nList Empty");
        else
        {
            Node t=root;//1
            Node t2=root;//1
            while(t.next!=null)//2
            {
                t2=t;
                t=t.next;
            }
            if(root==t)
                root=null;//3 single node
            else
                t2.next=null;//3
            System.out.println(t.data+" deleted");//3
        }
    }
    void print_list()
    {
        if(root==null)
            System.out.println("\nList Empty");
        else
        {
            Node t=root;//1
            while(t!=null)//2
            {
                System.out.print("|"+t.data+"|->");
                t=t.next;
            }
        }
    }

}
