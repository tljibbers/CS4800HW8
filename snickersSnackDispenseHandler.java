public class snickersSnackDispenseHandler extends SnackDispenseHandler{
    public snickersSnackDispenseHandler(SnackDispenseHandler next)
    {
        super(next);
    }

    public void handleRequest(String requestType)
    {
        if(requestType.equals("Snickers"))
        {
            System.out.println("Snickers Dispensed");
        }
        else
        {
            System.out.println("I was passed from Snickers");
            super.handleRequest(requestType);
        }
    }
}
