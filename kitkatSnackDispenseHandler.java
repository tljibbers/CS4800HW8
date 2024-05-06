public class kitkatSnackDispenseHandler extends SnackDispenseHandler{
    public kitkatSnackDispenseHandler(SnackDispenseHandler next)
    {
        super(next);
    }

    public void handleRequest(String requestType)
    {
        if(requestType.equals("Kit Kat"))
        {
            System.out.println("Kit Kat Dispensed");
        }
        else
        {
            System.out.println("I was passed from Kit Kat");
            super.handleRequest(requestType);
        }
    }
}
