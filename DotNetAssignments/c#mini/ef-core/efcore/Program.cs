// See https://aka.ms/new-console-template for more information
using System;
using efcore.model;
using efcore.dbcontext;

public class Program{
    public static void Main(string[] args){

        Console.WriteLine("Hello, World!");

        EmpModel model = new EmpModel();

        model.DisplayAllDepartments(); 
    }
}