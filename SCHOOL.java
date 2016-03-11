import javax.swing.JOptionPane;
import java.io.*;
public class SCHOOL
{
    private ORDER OrderList[];
    int noOfOrders;
    FILEREADCSV OrderFile;

    public SCHOOL()
    {
        OrderFile = new FILEREADCSV();

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
        String[] dataRows = OrderFile.readCSVtable();
        noOfOrders = dataRows.length;
        System.out.println("** " + noOfOrders + " rows read.\n\n");
        OrderList = new ORDER[noOfOrders];

        for  (int i = 0; i < noOfOrders; i++) {
            OrderList[i] = new ORDER()    ;  
            OrderList[i].readOrderDetails(dataRows[i]);
        }
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