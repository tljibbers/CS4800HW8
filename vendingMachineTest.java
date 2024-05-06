import org.junit.Test;

public class vendingMachineTest {
    Snack testSnack = new Snack("Snickers", 2.50, 3);
    VendingMachine testVendingMachine = new VendingMachine();
    SnackDispenseHandler snackDispenseHandler = new cokeSnackDispenseHandler(new pepsiSnackDispenseHandler(new cheetosSnackDispenseHandler(new doritosSnackDispenseHandler(new kitkatSnackDispenseHandler(new snickersSnackDispenseHandler(null))))));
    idleState idle = new idleState();
    waitForMoneyState wfm = new waitForMoneyState();
    dispensingSnackState dss = new dispensingSnackState();
    double money = 13.50;
    double money2 = 1.00;

    @Test
    public void testStates()
    {
        idle.idle(testVendingMachine);
        wfm.waitForMoney(testVendingMachine);
        dss.DispensingSnack(testVendingMachine);
    }

    @Test
    public void testSelectSnack()
    {
        testVendingMachine.selectSnack(testSnack);
    }

    @Test
    public void testInsertMoney()
    {
        testVendingMachine.insertMoney(money, testSnack);
        testVendingMachine.insertMoney(money2, testSnack);
    }

    @Test
    public void testDispenseSnack()
    {
        testVendingMachine.dispenseSnack(snackDispenseHandler, "Snickers");
    }
}
