import javax.swing.JOptionPane;
import java.io.*;
public class SCHOOL
{
    private ORDER orderList[];
    int noOfOrders;
    FILEREADCSV orderFile;

    public SCHOOL()
    {
        orderFile = new FILEREADCSV();

    }
    // top level algorithm
    public void processOrders() throws IOException
    {
        setUpOrderList();
        calculateMethodOfSales();
        countMoneyRaised();
        generateFunction();
        saveFriNightSales();
    }

    public void setUpOrderList() throws IOException
    {
        System.out.println("");
        System.out.println("");
        String[] dataRows = orderFile.readCSVtable();
        noOfOrders = dataRows.length;
        System.out.println("** " + noOfOrders + " rows read.\n\n");
        orderList = new ORDER[noOfOrders];
    }

    public void calculateMethodOfSales()
    {
        
    }
    
    public void countMoneyRaised()
    {
        
    }
    
    public void generateFunction()
    {
        
    }
    
    public void saveFriNightSales()
    {
        
    }
    

}