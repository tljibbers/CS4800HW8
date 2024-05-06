public class VendingMachine {

    private StateOfVendingMachine state = new idleState();

    public void setState(StateOfVendingMachine state)
    {
        this.state = state;
    }

    public StateOfVendingMachine getState()
    {
        return this.state;
    }

    public void selectSnack(Snack snack)
    {
        System.out.println("You are selecting " + snack.getName());
        getState().waitForMoney(this);
    }

    public double insertMoney(double money, Snack snack)
    {
        if(money >= snack.getPrice())
        {
            if(snack.getQuantity() != 0)
            {
                getState().DispensingSnack(this);
                money = money - snack.getPrice();
             System.out.println("You now have " + money + " dollars");
                return money;
            }
            else
            {
                System.out.println("There are no more " + snack.getName());
                state = new idleState();
                getState().idle(this);
            }
        }
        else
        {
            System.out.println("You do not have sufficient enough money for this snack.");
            state = new idleState();
            getState().idle(this);
        }
        return money;
    }

    public void dispenseSnack(SnackDispenseHandler snackDispenseHandler, String requestType)
    {
        snackDispenseHandler.handleRequest(requestType);
        getState().idle(this);
    }
}
