public class cokeSnackDispenseHandler extends SnackDispenseHandler{
    public cokeSnackDispenseHandler(SnackDispenseHandler next)
    {
        super(next);
    }

    public void handleRequest(String requestType)
    {
        if(requestType.equals("Coke"))
        {
            System.out.println("Coke Dispensed");
        }
        else
        {
            System.out.println("I was passed from Coke");
            super.handleRequest(requestType);
        }
    }
    
}
