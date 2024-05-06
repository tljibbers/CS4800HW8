public abstract class cheetosSnackDispenseHandler extends SnackDispenseHandler{
    public cheetosSnackDispenseHandler(SnackDispenseHandler next)
    {
        super(next);
    }

    public void handleRequest(String requestType)
    {
        if(requestType.equals("Cheetos"))
        {
            System.out.println("Cheetos Dispensed");
        }
        else
        {
            System.out.println("I was passed from Cheetos");
            super.handleRequest(requestType);
        }
    }
    
}
