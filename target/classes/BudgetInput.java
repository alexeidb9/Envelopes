public class BudgetInput {

    // Currency
    public double usd;
    public double eu;
    public double zl;

    //public double currencyOutput;
    //public double sum;

    // Constructor
    public BudgetInput(double usd, double eu, double zl) {
        this.usd = usd;
        this.eu = eu;
        this.zl = zl;

    }

    //This variable store the input of todays.
    public double sum = this.sum + budgetInput(double);




       //Using method overloading, to create a choice of a type of currency that will be entered.

       public double budgetInput(double this.usd) {
           //Here I set a checking method whether the inputed value of budgetInput methods is valid.
           if (int budgetInput <= 0 ) {
               System.out.println("Incorrect value");
           }


            return budgetInput(this.usd);
    }

        public double budgetInput(double this.eu) {

            return budgetInput(eu);
    }

        public double budgetInput(int this.zl) {

            return budgetInput(zl);
    }

}