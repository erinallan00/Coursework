import javax.swing.JOptionPane;
import java.io.*;
public class Academy
{
    private Academy OrderList[];
    int noOfOrders;
    FILEREADCSV orderFile;

    public Academy()
    {
        orderFile = new FILEREADCSV();

    }
    // top level algorithm
    public void processOrders()throws IOException
    {
        setUpOrderList();
        calculateMethodOfSales();
        countMoneyRaised();
        generateFunction();
        saveFriNightSales();
    }

    public void setUpOrderList()throws IOException
    {
        System.out.println("");
        System.out.println("");
        String[] dataRows = orderFile.readCSVtable();
        

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