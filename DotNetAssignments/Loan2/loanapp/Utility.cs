namespace loanapp
{
    public static class Utility
    {
        public static double GetTotalDiscount(params Loan[] laonarr){
            double totalDiscount = 0;
            foreach (var item in laonarr)
            {
                IDiscountable discount = item as IDiscountable;

                if(discount!=null && discount is IDiscountable){
                    totalDiscount += discount.getDiscount(item.getEMI());
                }
            }
            return totalDiscount;
        }

        public static double GetTotalTax(params Loan[] loanarr){
            double totalTax = 0;
            foreach (var item in loanarr){
                ITaxable tax = item as ITaxable;
                if(tax!=null && tax is ITaxable){
                    totalTax += tax.getTax(item.getEMI());
                }
            }
            return totalTax;
        }

    }
}