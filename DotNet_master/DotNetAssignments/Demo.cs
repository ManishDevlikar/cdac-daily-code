using System;

class Demo{
	static void Main(string[] args)
	{	string number1 = args[0];
		string number2 = args[1];
		string sum = number1 + number2;
		Console.WriteLine("The Sum of {0} and {1} is: {2}", number1, number2, sum);
		int sum2=doSum(10,20);
		Console.WriteLine("The Sum Of Two Number is {0}",sum2);
		Console.WriteLine("----------------------------------------------------");
		Console.WriteLine("PRIME / !PRIME");
		Console.Write("Enter Number :");

		if(int.TryParse(Console.ReadLine(), out int userIn)){
			isPrime(userIn);		
	         }

		Console.WriteLine("--------------- Array Prime Numbers-------------");
		int[] primeArr={1,2,3,4,5,6,7,8,9,10};

		printPrime(primeArr);

		Console.WriteLine("------------------ Prime Between Start Index to End Index");
		Console.WriteLine("Enter start Index :");
		Console.WriteLine("Enter end Index  :");
		if(int.TryParse(Console.ReadLine(), out int start) && int.TryParse(Console.ReadLine(), out int end)){
			 printPrintBetRange(start,end);
		}		

	}

	static int doSum(int num1,int num2){
		return num1+num2;
	}

	static void isPrime(int num){
		int count=0;
		for(int i=1;i<=num;++i){
			if(num%i==0){
				count++;
			}
		}
		if(count>2){
			Console.WriteLine("The num {0} is Not Prime",num);
		}else{
			Console.WriteLine("The num {0} is Prime",num);
		}
	}

	static void printPrime(int[] arr){
for(int i=0;i<arr.Length;++i){
			isPrime(arr[i]);
		}
	}

	static void printPrintBetRange(int start,int end){
		for(int i=start;i<=end;++i){
			isPrime(i);
		}
	}

};
