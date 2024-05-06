public class idleState implements StateOfVendingMachine{
    public void idle(VendingMachine vendingMachine)
    {
        //nothing
    }

    public void waitForMoney(VendingMachine vendingMachine)
    {
        vendingMachine.setState(new waitForMoneyState());
        System.out.println("Vending Machine is now waiting for money to be inserted.");
    }

    public void DispensingSnack(VendingMachine vendingMachine)
    {
        //nothing
    }
    
}
