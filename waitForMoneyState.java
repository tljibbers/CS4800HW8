public class waitForMoneyState implements StateOfVendingMachine{
    public void idle(VendingMachine vendingMachine)
    {
        //nothing
    }

    public void waitForMoney(VendingMachine vendingMachine)
    {
        //nothing
    }

    public void DispensingSnack(VendingMachine vendingMachine)
    {
        vendingMachine.setState(new dispensingSnackState());
        System.out.println("Money has been inserted. Now attempting to dispense snack.");
    }  
}
