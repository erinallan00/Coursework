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
        int SchoolSales = 0;
        int OnlineSales = 0;
        for (int i = 0; i < noOfOrders; i++)
        {
            // decide if customer bought ticket in school.
            if ((OrderList[i].getMethodOfPurchase().equals("S")))
            {
                SchoolSales = SchoolSales +1;
            }
            //count all S values then take away from 300 to find O values.
            //use an if statement to decide which is most popular method of sales.
            // if CountSchoolSales is greater than CountOnlineSales then CountSchoolSales is the most popular, if CountOnlineSales is greater than CountSchoolSales then CountOnlineSales is most popular.
            OnlineSales = NoOfOrders - SchoolSales;
            if ((
            System.out.println("\n The most popular method of sales is : " + );
        }

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