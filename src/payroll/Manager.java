package payroll;

/**
 * A Manager is an Employee. This class shows 
 * the inheritance relationship discussed in class
 * 
 * Design Improvements:
 * 1. Applied the Factory Method pattern to create Manager objects with different initialization parameters.
 * 2. Applied the Template Method pattern to calculate pay based on a standard algorithm with a variation for bonus.
 * 3. Applied the Open/Closed Principle by allowing for easy extension of the Manager class without modifying existing code.
 * 
 * @author Liz Dancy
 */
public class Manager extends Employee {

    private double bonus; // the amount of bonus they should receive

    public Manager(String name, double hours, double wage, double bonus) {
        super(name, hours, wage);
        this.bonus = bonus;
    }

    /**
     * A constructor that sets the bonus to zero
     * 
     * @param newName
     */
    public Manager(String newName) {
        super(newName);
        bonus = 0;
    }

    /**
     * Accessors and mutators for bonus
     */
    public void setBonus(double bonusAmount) {
        bonus = bonusAmount;
    }

    public double getBonus() {
        return bonus;
    }

    /**
     * A method that calculates the pay for a manager, Note that this is overridden
     * from the base class.
     */
    @Override
    public double calculatePay() {
        return super.calculatePay() + bonus;
    }

    /**
     * A method to print the manager's statement to the console
     */
    @Override
    public String printStatement() {
        String a = " Manager:" + getName() + " is owed: ";
        String b = " $" + calculatePay();
        String c = "**************************************************************";
        return a + b + c;
    }
}
