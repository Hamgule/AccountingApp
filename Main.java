public class Main {
    public static void main(String[] args) {
        User u1 = new User("A", 3);
        
        double[] rates = new double[u1.getNumberOfDividend()];

        u1.setValueOfSupply(Integer.parseInt(args[0]));
        u1.setVat();
        u1.setProfit();
        u1.setExpense();
        u1.setNetProfit();

        if (u1.getNetProfit() > 10000) {
            rates[0] = 0.5;
            rates[1] = 0.3;
            rates[2] = 1 - rates[0] - rates[1];
        }
        else {
            rates[0] = 1.0;
            rates[1] = 0.0;
            rates[2] = 1 - rates[0] - rates[1];
        }

        u1.setDividendRates(rates);
        u1.setDividends();
        u1.print();
    }

}