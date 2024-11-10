package funcinterface;

public class Scheme {
    
    public static double ExpenseSequence(int year){
        return 5 * year - 2;
    }

    public static double IncomeSequence(int year){
        return year * year + 1;
    }

    public double myOwnSequence(int year){
        return year*year+9;
    }

    public static double commonSum(int year,Sequenceable sequenceable){
        double total=0;
        for(int i=1;i<=year;++i){
            total+=sequenceable.Sequence(i);
        }
        return total;
    }
}  
