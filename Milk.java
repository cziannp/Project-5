
public class Milk extends Customer {
    private boolean lactoseIntolerant;

    public Milk(String name, double balance, boolean lactoseIntolerant) {
        this.name = name;
        this.balance = balance;
        this.lactoseIntolerant = lactoseIntolerant;
    }

    @Override
    public String goodEnding() {
        return name + " had a delicious meal, paid, and went their merry way. Unfortunately, they succumbed to lactose intolerance only ten feet away from the establishment and promptly disintegrated.";
    }
    @Override
    public String badEnding() {
        return name + " upon realizing they couldn't afford the bill, made a run for it. \nUnfortunately, they succumbed to lactose intolerance only ten feet away and promptly disintegrated.";
    }

    @Override
    public void printData() {
        System.out.println("STATS:" + "\nName: " + name + "\nBudget: $" + balance + "\nLactose Tolerant: " + lactoseIntolerant);

    }
}
