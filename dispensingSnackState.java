public class dispensingSnackState implements StateOfVendingMachine{

    public void idle(VendingMachine vendingMachine)
    {
        vendingMachine.setState(new idleState());
        System.out.println("Snack dispensed. Going back to idle state.");
    }

    public void waitForMoney(VendingMachine vendingMachine)
    {
        //nothing
    }

    public void DispensingSnack(VendingMachine vendingMachine)
    {
        //nothing
    }
    
}
