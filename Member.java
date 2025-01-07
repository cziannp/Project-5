
public class Member extends Customer {
    private boolean membership;

    public Member(String name, double balance, boolean memebership) {
        this.name = name;
        this.balance = balance;
        this.membership = memebership;
    }

    @Override
    public String badEnding() {
        return "Realizing that they couldn't afford the bill, the cafe manager prepared to smite " + name + ". \nSeconds before sending the customer back to their creator, the manager noticed their membership card on the table. \n" + name + " was spared to see another day.";
    }

    @Override
    public void printData() {
        System.out.println("STATS:" + "\nName: " + name + "\nBudget: $" + balance + "\nMember: " + membership);
    }
}
