package com.stack;
import java.util.Scanner;
public class Stack_Main_Prg
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        Stack_Class obj=new Stack_Class();
        System.out.println("Enter size of stack:");
        int choice;
        int size=in.nextInt();
        obj.create_stack(size);
        do
        {
            System.out.print("\nStack Menu");
            System.out.print("\n-----------");
            System.out.print("\n1.Push");
            System.out.print("\n2.Pop");
            System.out.print("\n3.Peek");
            System.out.print("\n4.Print Stack");
            System.out.print("\n0.Exit");
            System.out.print("\nchoice:");
            choice=in.nextInt();
            switch (choice)
            {
                case 1:
                    if(!obj.is_full())//if not full
                    {
                        System.out.print("\nEnter element:");
                        int e=in.nextInt();
                        obj.push(e);
                    }
                    else
                    {
                        System.out.print("\nStack Full:");
                    }
                    break;
                case 2:
                    if(!obj.is_empty())//if not empty
                    {
                        System.out.print("\nElement poped:"+obj.pop());
                    }
                    else
                    {
                        System.out.print("\nStack Empty:");
                    }
                    break;
                case 3:
                    if(!obj.is_empty())//if not empty
                    {
                        System.out.print("\nElement @ Peek is:"+obj.peek());
                    }
                    else
                    {
                        System.out.print("\nStack Empty:");
                    }
                    break;
                case 4:
                    if(!obj.is_empty())//if not empty
                    {
                        System.out.println("\nElements on stack");
                        obj.print_stack();
                    }
                    else
                    {
                        System.out.print("\nStack Empty:");
                    }
                    break;
                case 0:
                    System.out.print("\nExiting code...bye");
                    break;
                default:
                    System.out.print("\nWrong option selected..");
                    break;
            }
        }while(choice!=0);
    }
}