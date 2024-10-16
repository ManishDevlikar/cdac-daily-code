using System.Reflection;
using  MetTours;
using totalRent=System.Func<int ,int ,double>;

// class
Type type = Type.GetType($"MetTours.{args[0]},tourslib",true);
object obj = Activator.CreateInstance(type);  

// method
var method = type.GetMethod(args[1]);
var exeFun=method.CreateDelegate<totalRent>(obj);

// function arguments
int noOfDays=int.Parse(args[2]);
int noOfPersons=int.Parse(args[3]);

// attribute
var modTax=type.GetCustomAttribute<LuxuryTaxAttribute>();
double taxPer=(modTax?.tax??8)/100.0;
Console.WriteLine($"{taxPer}");

// function calling
double finalRent=exeFun(noOfDays,noOfPersons);

finalRent=finalRent*taxPer+finalRent;
Console.WriteLine($"Total Rent: {finalRent}");

