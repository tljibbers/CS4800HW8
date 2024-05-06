public class doritosSnackDispenseHandler extends SnackDispenseHandler{
    public doritosSnackDispenseHandler(SnackDispenseHandler next)
    {
        super(next);
    }    

    public void handleRequest(String requestType)
    {
        if(requestType.equals("Doritos"))
        {
            System.out.println("Doritos Dispensed");
        }
        else
        {
            System.out.println("I was passed from Doritos");
            super.handleRequest(requestType);
        }
    }
}
