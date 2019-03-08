import java.util.Scanner; 
 
public class SalesComm

{

    private double salary; 
 

    public double getSalary( int gross_sales ) 

    {

        double salary = ((gross_sales * 0.09) + 200);

        return salary;

    }

 

 

 

    public void displayMessage( int counter_array[]) 
    {

        for (int displaycount = 0; displaycount < 9; displaycount++ )

              
        System.out.println(displaycount + ": " + counter_array[displaycount]);

 

    }

 

 

 
    public void increaseArray( double salary, int counter_array [] ) // method to find out which counter to increase based on salary

    {

 

     

    if (salary >= 1000.00) {

            counter_array[8]++;

        } else if (salary >= 900.00) {

            counter_array[7]++;

        } else if (salary >= 800.00) {

            counter_array[6]++;

        } else if (salary >= 700.00) {

            counter_array[5]++;

        } else if (salary >= 600.00) {

            counter_array[4]++;

        } else if (salary >= 500.00) {

            counter_array[3]++;

        } else if (salary >= 400.00) {

            counter_array[2]++;

        } else if (salary >= 300.00) {

           counter_array[1]++;

        } else if (salary >= 200.00) {

            counter_array[0]++;

 

        }

    }

 

    public void salesMethod() 

    {

    int counter_array[] = new int [ 9 ];

    int gross_sales; 

    double salary = 0.0;

 
    Scanner input = new Scanner( System.in );
 
    System.out.printf( "Enter sales amount (Negative to end) ");
    gross_sales = input.nextInt();
 

    while ( gross_sales >= 0 ) 
    {

        salary = getSalary( gross_sales ); 

        increaseArray( salary, counter_array ); 
 
        System.out.printf( "Enter sales amount (Negative to end) "); 

        gross_sales = input.nextInt();
 
    }
 
 
    displayMessage(counter_array);
 
    }
 
}
