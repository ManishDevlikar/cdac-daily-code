namespace func

{
    public class FunctionDele{
        public delegate double Sequence (int year);

        public static double ExpenseSequence(int year){
            return 5 * year - 2;
        }

        public static double IncomeSequence(int year){
            return year * year + 1;
        }

        public static double Omkar(int y){
            return y*3;
        }

        public static double CommonSum(int year, Sequence seq){
            double total = 0;
            for(int i = 1; i <= year; ++i)
            {
                total += seq(i);
            }
            return total;
        }





        
    }
}

/*
#include <cstdio>

double ExpenseSequence(int year)
{
	return 5 * year - 2;
}

double IncomeSequence(int year)
{
	return year * year + 1;
}

double CommonSum(int years, double (*sequence)(int))
{
	double total = 0;

	for(int year = 1; year <= years; ++year)
	{
		total += sequence(year);
	}

	return total;
}


int main(void)
{
	int count;

	printf("Number of Years: ");
	scanf("%d", &count);

	printf("Total Expense: %.2f\n", CommonSum(count, &ExpenseSequence));
	printf("Total Income : %.2f\n", CommonSum(count, &IncomeSequence));
}



*/