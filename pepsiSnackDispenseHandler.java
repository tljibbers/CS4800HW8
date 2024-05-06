public class pepsiSnackDispenseHandler extends SnackDispenseHandler{
    public pepsiSnackDispenseHandler(SnackDispenseHandler next)
    {
        super(next);
    }

    public void handleRequest(String requestType)
    {
        if(requestType.equals("Pepsi"))
        {
            System.out.println("Pepsi Dispensed");
        }
        else
        {
            System.out.println("I was passed from Pepsi");
            super.handleRequest(requestType);
        }
    }
    
}
