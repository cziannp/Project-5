public class Customer {
    public double balance;
    public String name;

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public Customer() {
        name = "Doe";
        balance = 0.00;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void printData() {
        System.out.println("STATS:" + "\nName: " + name + "\nBudget: $" + balance);
    }

    public String goodEnding() {
        return name + " had a delicious meal, paid, and went their merry way.";
    }

    public String badEnding() {
        return name + " was vaporized by the cafe manager for being poor.";
    }

    public String pickyEaterEnding() {
        return name + " was curb stomped by the cafe manager for being too picky.";
    }

}
