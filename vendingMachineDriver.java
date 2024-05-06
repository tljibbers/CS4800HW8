public class vendingMachineDriver {

    public static void main(String[] args) {
        double money = 13.50;
        Snack coke = new Snack("Coke", 1.50, 3);
        Snack pepsi = new Snack("Pepsi", 1.50, 3);
        Snack cheetos = new Snack("Cheetos", 2.50, 2);
        Snack doritos = new Snack("Doritos", 2.50, 3);
        Snack kitKat = new Snack("Kit Kat", 2.50, 5);
        Snack snickers = new Snack("Snickers", 3.50, 1);
        Snack snickers0 = new Snack("Snickers", 3.50, 0);
        VendingMachine vm = new VendingMachine();
        SnackDispenseHandler sdh = new cokeSnackDispenseHandler(new pepsiSnackDispenseHandler(new cheetosSnackDispenseHandler(new doritosSnackDispenseHandler(new kitkatSnackDispenseHandler(new snickersSnackDispenseHandler(null))))));
        vm.selectSnack(coke);
        vm.insertMoney(money, coke);
        vm.dispenseSnack(sdh, "Coke");

        vm.selectSnack(pepsi);
        vm.insertMoney(money, coke);
        vm.dispenseSnack(sdh, "Pepsi");

        vm.selectSnack(cheetos);
        vm.insertMoney(money, cheetos);
        vm.dispenseSnack(sdh, "Cheetos");

        vm.selectSnack(doritos);
        vm.insertMoney(money, doritos);
        vm.dispenseSnack(sdh, "Doritos");

        vm.selectSnack(kitKat);
        vm.insertMoney(money, kitKat);
        vm.dispenseSnack(sdh, "Kit Kat");

        vm.selectSnack(snickers);
        vm.insertMoney(money, snickers);
        vm.dispenseSnack(sdh, "Snickers");

        vm.selectSnack(snickers0);
        vm.insertMoney(money, snickers0);
        




    }
    
}
