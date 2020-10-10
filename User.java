public class User {
    private String name;
    
    private int numberOfDividend;
    private double[] dividendRates;

    private int valueOfSupply;
    private int vat;
    private int profit;
    private int expense;
    private int netProfit;
    private int[] dividends;

    // constructor
    public User(String name, int number) {
        this.name = name;
        numberOfDividend = number;
        dividendRates = new double[numberOfDividend];
        dividends = new int[numberOfDividend];
    }

    public void print() {
        System.out.println("User name: " + name);
        System.out.println("Value of supply: " + valueOfSupply);
        System.out.println("VAT: " + vat);
        System.out.println("profit: " + profit);
        System.out.println("expense: " + expense);
        System.out.println("net profit: " + netProfit);
        for (int i = 0; i < numberOfDividend; i++) {
            System.out.println("person" + (i + 1) + ": " + dividends[i]);
        }
    }

    // getter
    public int getNumberOfDividend() { return numberOfDividend; }
    public int getValueOfSupply() { return valueOfSupply; }
    public int getVat() { return vat; }
    public int getProfit() { return profit; }
    public int getExpense() { return expense; }
    public int getNetProfit() { return netProfit; }
    public int getDivendends(int num) { return dividends[num]; }

    // setter
    public void setVat() {
        double vatRate = 0.1;
        vat = (int) (valueOfSupply * vatRate);
    }
    public void setProfit() {
        profit = (int) (valueOfSupply - vat);
    }
    public void setExpense() {
        double expenseRate = 0.3;
        expense = (int) (profit * expenseRate);
    }
    public void setNetProfit() {
        netProfit = profit - expense;
    }
    public void setDividends() {
        for (int i = 0; i < numberOfDividend; i++) dividends[i] = (int) (netProfit * dividendRates[i]);
    }
    public void setValueOfSupply(int value) { 
        valueOfSupply = value; 
    }
    public void setDividendRates(double[] rates) {
        for (int i = 0; i < numberOfDividend; i++) dividendRates[i] = rates[i];
    }

}