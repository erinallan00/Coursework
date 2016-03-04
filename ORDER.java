public class ORDER
{
    private String customerID;
    private String ticketID;
    private int NoOfTickets;
    private String MethodOfPurchase;
   
    public ORDER()
    {
        customerID = "";
        ticketID = "";
        NoOfTickets = 0;
        MethodOfPurchase = "";
        
    }

    public void readOrderDetails(String dataItems) 
    {
        String[] rowItems = dataItems.split(",");
        customerID = rowItems[0];
        ticketID = rowItems[1];
        NoOfTickets = Integer.parseInt(rowItems[2]);
        MethodOfPurchase = (rowItems[3]);
    }

    public String writeDetails()
    {
        String orderData = "";
        orderData = orderData.concat(customerID);
        orderData = orderData.concat(",");
        orderData = orderData.concat(ticketID);
        orderData = orderData.concat(",");
        orderData = orderData.concat(Integer.toString(NoOfTickets));
        orderData = orderData.concat(",");
        orderData = orderData.concat(MethodOfPurchase);
        return orderData;
    }
    
    public int getNoOfTickets()
    {
        return NoOfTickets;
    }
    
    public String getticketID()
    {
        return ticketID;
    }
    
    public String getMethodOfPurchase()
    {
        return MethodOfPurchase;
    }

}
