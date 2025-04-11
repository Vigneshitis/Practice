/*import java.util.Scanner;
class Practice1
{
	public static void main(String[]args)
	{
    Pdogg();
	}
	
	public static void Pdogg()
	{
		
	Scanner myScan=new Scanner(System.in);
	 System.out,println("Enter the value of a");
	 long a=myScan.nextlong();
		System.out.println("Enter the value of b");
		long b=myScan.nextlong();
		
	int c=a+b;

	System.out.println("Result_____"      +c);*/
	

  /*
	Scanner myScan=new Scanner(System.in);
		String Name="";
		System.out.println("Enter the name");
		Name=myScan.nextLine();
		System.out.println("User name is"+Name);
		*/
/*Program for checking whether the given number is positive or negative*/
/*
		import java.util.Scanner;
		class Practice1	
		{
			public static void main(String[] args)
			{
				Scanner ooLo=new Scanner(System.in);
				System.out.println("Enter the number");
				int number=ooLo.nextInt();
				
				if(number>0)
				{
					System.out.println("Number is positive");
					
				}
				else if(number<0)
				{
					System.out.println("Number is negative");
					
				}
				else
				{
					System.out.println("Number is neutral");
				}
			}
		}
		*/
		/*Program to check correct username and password*/
		/*import java.util.Scanner;
		class Practice1
		{
		    String a="Vignesh";
		    String b="Loft";
			public static void main(String[] args)
			{
				
				//Accessing non static member outside method using object//
				
				Practice1 c= new Practice1();
				String a=c.a;
				String b=c.b;
				System.out.println("Hint:"+a);
				System.out.println("Hint"+b);
				Scanner myObj=new Scanner(System.in);
				
				System.out.println("Welcome to Gmail");
				
				
				while(true)
				{
				
				System.out.println("Enter the username");
				String userinput=myObj.nextLine();
				
				
				System.out.println("Enter the Password");
				String userpassword=myObj.nextLine();
				
				if(userinput.equals(a) && userpassword.equals(b))
				{
				 System.out.println("Welcome!!!!!!!!!!!!!!!!!!!!!!!!!!!");
				 break;
				
				}
				
				
				else
				{
				System.out.println("Invalid");
				}
				
				}
					
			} 
			
		}
		*/
		
		/*
		class Practice1
		{
			public static void main(String[] args)
			{
				int a=5;
				int b=3;
				int temp=a;
				a=b;
				b=temp;
				System.out.println("A="+a);
				System.out.println("B="+b);
			}
			
		}*/
		
		/*class Practice1
		{
			public static void main(String[]args)
			{
				int a=5;
				int b=9;
				a=a+b;
				b=a-b;
				a=a-b;
				System.out.println("A-"+a);
				System.out.println("B-"+b);
				
				}
		}

		*/
		/*
class Practice1
{
	public static void main(String[] args)
	{
		int rows=5;
		
		for(int i=0;i<rows;i++)
		{
		for(int j=0;j<rows;j++)
		{
			System.out.println("* ");
		}
			System.out.println();
		}
	}
}		
		
	*/	
	/*Write a program to get the difference
	between a given number and 13, 
	if the difference value is greater than 13 return double
	the absolute difference*/
	/*
	import java.util.Scanner;
	class Practice1
	{
		public static void main(String[] args)
		{
			Scanner s1 =new Scanner(System.in);
			
			System.out.println("Enter the number");
			int a=s1.nextInt();
			int c=a-13;
			int d=c*2;
			if(c>13)
			{
				System.out.println(d);
				
			}
			else
			{
				System.out.println(c);
			}
		}
		
	}
	*/
	// Arguments and return types/
	
	
	
	/*without argument, without retyrn type

class Practice1
{
	void m1()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args)
	{
		
		Practice1 f=new Practice1();
		f.m1();
		
	}
}
*/

//with argument, with retun type
/*class Practice1
{
	int m1(int a,int b)
	{
		int c=a+b;
		return c;
	}
	
	public static void main(String[] args)
	{
		
		Practice1 f=new Practice1();
		//int x=f.m1(10,5);
		//System.out.println(x);
		
		System.out.println(f.m1(5,5));
	}
}
*/
//without argument, with return type//
/*
class Practice1
{
	int m1()
	{
		return 100;
	}
	
	public static void main(String[] args)
	{
		
		Practice1 f=new Practice1();
		int x=f.m1();
		
		System.out.println(x);
		
	}
}
*/
/*
class Practice1
{
	public static void main(String[] args)
	{
		if(args.length>2)
		{
			System.out.println("First argument"+args[0]);
			System.out.println("Second argument"+args[1]);
			System.out.println("Third argument"+args[2]);
			
		}
		
		
		else
		{
			System.out.println("no arguments");
		}
	}
}
*/
//pattern programs//
/*class Practice1
 {
   public static void main(String[] args)
   {
	   int rows=5;
	   
	   for(int i=0;i<rows;i++)
	   { 
   System.out.print("*");
	   }
	   System.out.println();
	   for(int i=0;i<rows;i++)
	   { 
   System.out.print("*");
	   }
	   System.out.println();
	    for(int i=0;i<rows;i++)
	   { 
   System.out.print("*");
	   }
	   System.out.println();
	   
	    for(int i=0;i<rows;i++)
	   { 
   System.out.print("*");
	   }
	   
	   System.out.println();
	    for(int i=0;i<rows;i++)
	   { 
   System.out.print("*");
	   }
   }
 }
 */
 /*
 class Practice1
{
	public static void main(String[] args)
	{
		int rows=5;
		
		for(int i=0;i<rows;i++)
		{
		for(int j=0;j<rows;j++)
		{
			System.out.print("* ");
		}
			System.out.println();
		}
	}
}
*/
/* 

* * * * *
* * * *
* * *
* *
* 
class Practice1
{
	public static void main(String[] args)
	{
		int rows=5;
		int columns=5;
		int temp=0;
		
		for(int i=0;i<rows;i++)
		{
			if(temp!=0)
			{
				columns=columns-1;
			}
			for(int j=0;j<columns;j++)
		{
			System.out.print("*");
		
		}
		temp++;
		System.out.println();
		}
	}
}
*/ 
/*
* 
* * 
* * *
* * * *
* * * * *
*/
/*
class Practice1
{
	public static void main(String[] args)
	{
		int rows=5;
		int columns=1;
		int temp=0;
		for(int i=0;i<rows;i++)
		{
			if(temp!=0)
			{
				columns=columns+1;
			}
			for(int j=0;j<columns;j++)
			{
				System.out.print("*");
			}
			temp++;
			System.out.println();
		}
	}
}
*/
/*
        * 
      * * 
    * * *
  * * * *
* * * * *
*/
 
 /*
 class Practice1
 {
	 public static void main(String [] args)
	 {
		 int rows=8;
		 int columns=8;
		 int temp=0;
		 
		 for(int i=0;i<rows;i++)
		 {
			 if(temp!=0)
			 {
				 columns=columns-1;
			 }
			 for(int j=0;j<columns;j++)
			 {
				 System.out.print(" ");
				
				 
			 }
			 
			  for(int k=0;k<=i;k++)
				 {
					 System.out.print("*");
				 }
				 
			 temp++;
			 
			 
		 System.out.println();
	 }
		 }
		 
 }
 */
 /*Passing the Arguments, Returning the value,
 creating an object to access non static variable in both the methods */
 
 /*
 class Practice1
 { 
 int a=30;
 int b=50;
 
	 public static void main(String [] args)
	 {

		 Practice1 s1=new Practice1();
		 int h= lom(1,2);
		 int f=s1.b-s1.a;
		 System.out.println("========"+f);
		 System.out.println("Returned value"+h);
		
	 }
	 public static int lom(int x,int y)
	 {
		
		 Practice1 s1=new Practice1();
		 int c=s1.a +s1.b;
		 System.out.println("c="+c);
		 int d=x+y;
		 int h=90+y;
		 System.out.println("Operation on the passed argument="+d);
		 return h;
	 }
 }
 */
 /*Write a program to find a value which is nearest to 100
 from to different given values*/
 /* Parcially correct*/
 
 /*
 import java.util.Scanner;
 class Practice1
 {
	 public static void main(String[] args)
	 {
		 System.out.println("HI There !!!!!!!");
		
		Scanner s1=new Scanner(System.in);
		
		while(true)
		{
		System.out.print("Enter the first number=");
		int first_no=s1.nextInt();
		
		System.out.print("Enter the second number=");
		int second_no=s1.nextInt();
		
				
		if(first_no>100 && second_no<100 || first_no<100 && second_no>100)
		{
			
			System.out.println("Enter the other values");
			
		}	
		
		else if(first_no>100 && second_no>100)
		{
			if(first_no>second_no)
			{
				System.out.print("Second number is nearer ");
			break;
			}

			else if(first_no<second_no)
			{
				System.out.print("First number is nearer ");
			break;
			}
			else
			{
				System.out.println("Both the numbers are same");
				
			}
			
			
		}
		else if(first_no<100 && second_no<100)
		{
		  
				if(first_no<second_no)
				{
					System.out.print("Second number is nearer");
					break;
				}
				
				
				else if(first_no>second_no)
				{
					System.out.print("First number is nearer");
					break;		
				}	
				else
				{
					System.out.println("Both the numbers are equal");
					
				}
		}		
		}				
	 }
 }
 */
 /*
 
 import java.util.Scanner;
class Bol
{
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
		System.out.println("Enter the number");
        int a=n.nextInt();
      int x=a%2;
        if(x!=0)
        {
            System.out.println("Weird");
        }
        else if(x==0 && 2<=a){
			if(a<=6)
				
        {
            System.out.println("Not Weird");      
        }
		}
        else if(x==0 && 6<=a){
			if(a<=20)
        {
            System.out.println("Weird");
        }
		}
        else if(x==0 && a>20);
        {
        System.out.println("Not Weird");
        }
    }
}

 */
 
 /*	
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        // JDBC connection parameters
        String url = "jdbc:mysql://localhost:3306/loft";
        String username = "root";
        String password = "";

        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            Connection connection = DriverManager.getConnection(url, username, password);

            // SQL query to insert data into the 'college_information' table
            String insertQuery = "INSERT INTO college_information (usn, mobile, mail) VALUES (?, ?, ?)";

            // Using Scanner to get input from the console
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.print("Enter USN: ");
                String usn = scanner.nextLine();

                System.out.print("Enter Mobile: ");
                int mobile = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                System.out.print("Enter Email: ");
                String mail = scanner.nextLine();

                // Create a PreparedStatement for the query
                try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
                    // Set values for parameters
                    preparedStatement.setString(1, usn);
                    preparedStatement.setInt(2, mobile);
                    preparedStatement.setString(3, mail);

                    // Execute the query
                    preparedStatement.executeUpdate();

                    System.out.println("Data inserted successfully");
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            // Close the connection
            connection.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
*/
 
 /*
 import java.io.IOException;

public class Practice1 {

    public static void main(String[] args) {
        try {
            // For Windows, try opening the Camera app directly
            if (System.getProperty("os.name").startsWith("Windows")) {
                Runtime.getRuntime().exec("cmd /c start microsoft.windows.camera:");
            } else {
                // For other systems, open a web browser which might have camera access
                // You can replace this with the appropriate command for your system if necessary
                // For example, on macOS, you might use: Runtime.getRuntime().exec("open -a Photo Booth");
                // And on Linux, you might use: Runtime.getRuntime().exec("xdg-open /dev/video0");
                Runtime.getRuntime().exec("xdg-open http://localhost");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
*/
/*
import javax.swing.*;

public class Practice1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple GUI");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Center the frame on the screen

        JButton minimizeButton = new JButton("-");
        minimizeButton.setBounds(340, 10, 40, 40);
        minimizeButton.addActionListener(e -> {
            frame.setState(JFrame.ICONIFIED); // Minimize the frame
        });

        JButton cancelButton = new JButton("X");
        cancelButton.setBounds(370, 10, 40, 40);
        cancelButton.addActionListener(e -> {
            frame.dispose(); // Close the frame
        });

        frame.setLayout(null);
        frame.add(minimizeButton);
        frame.add(cancelButton);
        frame.setVisible(true);
    }
}
*/
/*
 import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator {

    private JFrame frame;
    private JPanel panel;
    private JTextField textField;
    private JButton[] numberButtons;
    private JButton[] functionButtons;
    private JButton addButton, subButton, mulButton, divButton, eqlButton, clrButton;
    private Font font = new Font("Arial", Font.PLAIN, 20);
    private double num1 = 0, num2 = 0, result = 0;
    private char operator;

    public SimpleCalculator() {
        frame = new JFrame("Simple Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 550);
        frame.setLayout(null);

        textField = new JTextField();
        textField.setBounds(50, 25, 300, 50);
        textField.setFont(font);
        textField.setEditable(false);

        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].setFont(font);
            numberButtons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton button = (JButton) e.getSource();
                    textField.setText(textField.getText() + button.getText());
                }
            });
        }

        functionButtons = new JButton[6];
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        eqlButton = new JButton("=");
        clrButton = new JButton("C");

        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = eqlButton;
        functionButtons[5] = clrButton;

        for (int i = 0; i < 6; i++) {
            functionButtons[i].setFont(font);
            panel.add(functionButtons[i]);
        }

        addButton.addActionListener(e -> {
            num1 = Double.parseDouble(textField.getText());
            operator = '+';
            textField.setText("");
        });

        subButton.addActionListener(e -> {
            num1 = Double.parseDouble(textField.getText());
            operator = '-';
            textField.setText("");
        });

        mulButton.addActionListener(e -> {
            num1 = Double.parseDouble(textField.getText());
            operator = '*';
            textField.setText("");
        });

        divButton.addActionListener(e -> {
            num1 = Double.parseDouble(textField.getText());
            operator = '/';
            textField.setText("");
        });

        eqlButton.addActionListener(e -> {
            num2 = Double.parseDouble(textField.getText());
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0)
                        result = num1 / num2;
                    else
                        textField.setText("Error");
                    break;
            }
            textField.setText(String.valueOf(result));
        });

        clrButton.addActionListener(e -> {
            textField.setText("");
            num1 = num2 = result = 0;
        });

        for (int i = 1; i <= 9; i++) {
            panel.add(numberButtons[i]);
        }
        panel.add(numberButtons[0]);

        frame.add(panel);
        frame.add(textField);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }
}
*/
/*
1
12
123
1234
12345
*/
/*
class Practice1
{
	public static void main(String []args)
	
	{
		int a=1;
		int b=1;
		for(int i=0;i<5;i++)
		{
			for(int j=1;j<=a;j++)
			{
			System.out.print(j);
			}
			System.out.println("  ");
			a=a+1;
		}
		
	}
	
}
 */
 /*
 
        *
	   * *	
	  * * *
	 * * * *
    * * * * *
     
 */
 /*
 class Practice1
 {
	 public static void main(String[]args)
	 {
		 int a=5
		 int b=5;
		 int p=1;
		 int k=0;
		 for(int i=0;i<a;i++)
		 {
			 for(int j=1;j<b;j++)
				 
			      {
				 
				 				 
					 System.out.print(" ");
					
				 }
				 b=b-1;
				 for(k=0;k<p;k++)
					 
					 {
						  System.out.print("*");
						  System.out.print(" ");
					 }
			      p=p+1;
			 System.out.println(" ");
		 }
	 }
 }
 
 
 */
 /*
 
 *         *
 **       **
 ***     ***
 ****   ****
 ***********
 ****   ****
 ***     ***
 **       **
 *         *
 
 */
 
 /*
 class Practice1
 {
	 public static void main(String []args)
	 {
		 
		 
		 
		 
		 
		 
		 
	 }
 }
 
 */
 
 
 
 
 
 /*import java.util.*;
 class Practice1
 {
	 public static void main(String[] args)
	 {
		 Scanner scnn=new Scanner(System.in);
		 while(true)
		 {
		 System.out.print("Kindly enter the number"+"  ");
		
		 int x=scnn.nextInt();
		 scnn.nextLine();
		 
		 System.out.print(x);
		 
		 System.out.println(" ");
		 if(prm(x))
		 {
			 System.out.println("given number"+" "+x+" " +"is a prime ");
		 }
		 else 
		 {
			 System.out.println("given number"+ " " +x+" "+"is a not a prime");
		 }
		 System.out.println("Want to Exit?");
	    String exit= scnn.nextLine();
	   if(exit.equals("yes"))
	   {
		   break;
	   }
	 }
	   
	 }
	 
	 
	 public static boolean prm(int number)
	 {   
	     if(number<=1)
		 {
			 return false;
		 }
		  for (int i = 2; i <= Math.sqrt(number); i++) 
		  {
            if (number % i == 0) 
			{
				return false;
			}
			
		   }
		  return true;
	 }
	 
 }
  
 */
 
 
 //carry c and b value
 /*class Practice1
 {
	 public static void main(String []args)
	 {   
		int a=0;
		int b=1;
		
		 for(int i=1;i<100;i++)
		 {   
	         
			 int c=b+a;
			 System.out.println(c);
			 
			 a=b;
			 b=c;
		 }
		 
	 }
 }
 */
 /*
 class Practice1
 {
	 public static void main(String []args)
	 {   
		int a=0;
		int b=1;
		
		 for(int i=1;i<100;i++)
		 {   
	         
			 int c=b+a;
			 System.out.println(c);
			 
			 a=b;
			 b=c;
		 }
 }
 
 }
 */
 
  
 /*
 class Practice1
 {
	 public static void main(String []args)
	 {     int a=100;
	     
	     for(int i=1; i<100; i++)
		 {
			 System.out.println(a);
			 a=a-1;
		 }
	 }
 }
 */
 /*   
 
import java.util.*;
class Practice1
 {
	 public static void main(String []args)
	 { 
        int age =21;
		 if(age>=18)
		 {
			 System.out.print("Ur eligible to vote");
			 
		 }
		
		else
		{
			System.out.print("ur not eligible");
		}
	 
	 
	 
	 
	 }
 
 }
 */
      *
	   * *	
	  * * *
	 * * * *
    * * * * *
     
 */
 /*
 class Practice1
 {
	 public static void main(String[]args)
	 {
		 int a=5
		 int b=5;
		 int p=1;
		 int k=0;
		 for(int i=0;i<a;i++)
		 {
			 for(int j=1;j<b;j++)
				 
			      {
				 
				 				 
					 System.out.print(" ");
					
				 }
				 b=b-1;
				 for(k=0;k<p;k++)
					 
					 {
						  System.out.print("*");
						  System.out.print(" ");
					 }
			      p=p+1;
			 System.out.println(" ");
		 }
	 }
 }
 
 
 */
 /*
 
 *         *
 **       **
 ***     ***
 ****   ****
 ***********
 ****   ****
 ***     ***
 **       **
 *         *
 
 */
 
 /*
 class Practice1
 {
	 public static void main(String []args)
	 {
		 
		 
		 
		 
		 
		 
		 
	 }
 }
 
 */
 
 
 
 
 
 /*import java.util.*;
 class Practice1
 {
	 public static void main(String[] args)
	 {
		 Scanner scnn=new Scanner(System.in);
		 while(true)
		 {
		 System.out.print("Kindly enter the number"+"  ");
		
		 int x=scnn.nextInt();
		 scnn.nextLine();
		 
		 System.out.print(x);
		 
		 System.out.println(" ");
		 if(prm(x))
		 {
			 System.out.println("given number"+" "+x+" " +"is a prime ");
		 }
		 else 
		 {
			 System.out.println("given number"+ " " +x+" "+"is a not a prime");
		 }
		 System.out.println("Want to Exit?");
	    String exit= scnn.nextLine();
	   if(exit.equals("yes"))
	   {
		   break;
	   }
	 }
	   
	 }
	 
	 
	 public static boolean prm(int number)
	 {   
	     if(number<=1)
		 {
			 return false;
		 }
		  for (int i = 2; i <= Math.sqrt(number); i++) 
		  {
            if (number % i == 0) 
			{
				return false;
			}
			
		   }
		  return true;
	 }
	 
 }
  
 */
 
 
 //carry c and b value
 /*class Practice1
 {
	 public static void main(String []args)
	 {   
		int a=0;
		int b=1;
		
		 for(int i=1;i<100;i++)
		 {   
	         
			 int c=b+a;
			 System.out.println(c);
			 
			 a=b;
			 b=c;
		 }
		 
	 }
 }
 */
 /*
 class Practice1
 {
	 public static void main(String []args)
	 {   
		int a=0;
		int b=1;
		
		 for(int i=1;i<100;i++)
		 {   
	         
			 int c=b+a;
			 System.out.println(c);
			 
			 a=b;
			 b=c;
		 }
 }
 
 }
 */
 
  
 /*
 class Practice1
 {
	 public static void main(String []args)
	 {     int a=100;
	     
	     for(int i=1; i<100; i++)
		 {
			 System.out.println(a);
			 a=a-1;
		 }
	 }
 }
 */
 /*   
 
import java.util.*;
class Practice1
 {
	 public static void main(String []args)
	 { 
        int age =21;
		 if(age>=18)
		 {
			 System.out.print("Ur eligible to vote");
			 
		 }
		
		else
		{
			System.out.print("ur not eligible");
		}
	 
	 
	 
	 
	 }
 
 }
 */
 /*
  class Practice1
  {
	  public static void main(String []args)
	  { 
	       int count=0;
		  String a="AAEFFERRRERRREUYTREEEEHHDFRYRHT";
		  for(int i=0;i<a.length();i++)
		  {
			  if(a.charAt(i)=='E')
			  {
				  System.out.println(i);
			  }
		  }
		  
		  
	  }
  }
 */
 
 /*
 class Practice1
 {
	public static void main(String[] args)
	{
		System.out.print(m1());
	}
	
  public static String m1()
 
	 {
		String a = "MADAM";
        		
	return a;
	
 }
	
			
 }
 */
 /*
 import java.util.*;
 class Practice1
 {
	 public static void main(String args[])
	 {
		  int realmarks=0;
		  int count=0;
		  int sum=0;
		  
		  
		 Scanner scn=new Scanner(System.in); 
		 while(true)
		 {	 
		 System.out.println("Enter the marks");
		 
		 int tempmarks=scn.nextInt();
		 if(tempmarks<=100)
		 {
			realmarks=tempmarks;
			   sum+=realmarks;
			
			count=count+1; 
		 }
		 else if(tempmarks>100)
		 {
			System.out.println("Not Valid"); 
		 } 
		 
		 if(count==5)
		 {
			 break;
		 }	 
		 
		 }
		 System.out.println("The average marks of five subs is"+   "=" +sum/5 );
	 }
 }
 */
/*
import java.util.*;
class Practice1
{     
    
     
	public static void main(String args[])
	{
		int count=0;
		int x=0;
	    int y=1;
	    int z=0;
		Practice1 p=new Practice1();
		
		p.m1(x,y,count);
	}
	
	public void m1(int x,int y,int count)
	{
		
		count=count+1;
		int z=x+y;
		System.out.println(z);
		x=y;
		y=z;
		 if(count<15)
		 {
		     m1(x,y,count);
		 }
		 else{
			 
			 System.out.print("kk");
		 }
		
	}
}
 
 */
 /*
 class Practice1
 {

      public static void main(String args[])
	  {
		  import java.util.*;
class Practice1
{     
    
     
	public static void main(String args[])
	{
		int count=0;
		int x=0;
	    int y=1;
	    int z=0;
		Practice1 p=new Practice1();
		
		p.m1(x,y,count);
	}
	
	public void m1(int x,int y,int count)
	{
		
		count=count++;
		int z=x+y;
		System.out.println(z);
		x=y;
		y=z;
		 if(count<15)
		 {
		     m1(x,y,count);
		 }
		 else{
			 System.out.print("kk");
		 }
		
	}
}
 
*/	
/*	  
 class Practice1
 {
	 public static void main(String args[])
	 {    
	 
		 String a ="ABC";
		 
		 
		 for(int i=0;i<a.length();i++)
		 {         
			 System.out.print(a.charAt(i)+" ");	
			
		 }
		  System.out.print("\n");
	     for(int j=0;j<a.length();j++)
		 {
			 
			for(int y=0;y<a.length();y++)
				
			{
				if(j!=y)
				{
				System.out.print(a.charAt(j)+""+a.charAt(y)+" ");
				}
			}
		 }
		 
		  System.out.print("\n");
	     for(int l=0;l<a.length();l++)
		 {
			 
		   for(int m=0;m<a.length();m++)
				
			{
				for(int n=0;n<a.length();n++)
			   {
				      if(l!=m && m!=n &&  n!=l)
				        {
				          System.out.print(a.charAt(l)+""+a.charAt(m)+""+a.charAt(n)+" ");
				        }
			   }
			   
		    }
			
		 }
		 	 
	 }
	 
 }
 */
 /*
 import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Practice1
 {
    public static void main(String[] args) 
	{
        String data = "This is some text data to be written to a file.";
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt")))
		{
            writer.write(data);  
            System.out.println("Data written to file.");
        } catch (IOException e) 
		{
            e.printStackTrace();
        }
    }
}
*/
/*
class Practice1
{
	public static void main(String args[])
	{
		int arr1[]={1,2,3,4,5,6,7};
		int arr2[]={8,9,10,11,12,13,14};
		
		int arr3[]=new int[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++)
		{
			arr3[i]=arr1[i];
			
		}
		for(int i=0;i<arr2.length;i++)
		{
			arr3[i+arr1.length]=arr2[i];
			
		}
		for(int i=0;i<arr3.length;i++)
		{
			System.out.println(arr3[i]);
		}	
}
}
*/
/*
import java.util.*;
class Practice1
{
  public static void main(String args[])
  {
	  String String1="anagrams";
	  String String2="msaragna";
	   System.out.print(cloud(String1,String2));
	  
  }  
  
  
    public static boolean cloud(String str1,String str2)
	{
		
		ArrayList arr =new ArrayList();
		
		  
		
		
		
		return true;
	}
	
	
	
}
*/
/*
// duplicates
    import java.util.*;
	class Practice1
	{
		public static void main(String args[])
		{
			int arr[]={1,2,4,5,8,9,12,12,34,44,44,66,8,9,100,100,100,100,100,1};
			//linear search
			HashSet hs=new HashSet();
			for(int i=0;i<arr.length;i++)
			{
			hs.add(arr[i]);
			
			
			}
			System.out.println(hs);
		
		}
	}	

*/
/*
// most frequent
    import java.util.*;
	class Practice1
	{
		static int z=0;
		
		public static void main(String args[])
		{
		int count =0;
		
			
			ArrayList r=new ArrayList();
			while(count<10)
			{
				count=count+1;
				
				r.add(m1());
				
			}
			System.out.print(r);
			
		
		}
	   public static int m1()
	   {		
			int freq=0;
			
			int arr[]={1,2,4,5,8,9,12,12,34,44,44,66,8,9,100,100,100,100,100,1};
			
			
			for(int i=z;i<arr.length;i++)
			{
			     for(int j=i+1;j<arr.length;j++)
				 {
					 if(arr[i]==arr[j])
						 freq=freq+1;					 
					 
					 			 					 
				 }	
                    z=z+1;				 
				 return freq+1;
	   
	          }
	   
	  
	   return freq;
	   }
 }	   
*/

/*
//most frequent
import java.util.*;

class Practice1 {
    public static void main(String[] args) 
	{
        
              
        System.out.println(m1()); 
    }

    public static int m1() {
        int freq = 0;
        int arr[] = {1, 2, 4, 5, 8, 9, 12, 12, 34, 44, 44, 66, 8, 9, 100, 100, 100, 100, 100, 1};
        
        
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        
        for (int num : arr) 
		{
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        int mostFrequent = 0;
        int maxCount = 0;
        
        for (int num : frequencyMap.keySet()) {
            if (frequencyMap.get(num) > maxCount) {
                maxCount = frequencyMap.get(num);
                mostFrequent = num;
            }
        }
        
        return mostFrequent;  
    }
}
*/

/*
class Practice1
{
	public static void main(String args[])
	{
		int a='$';
		System.out.print(a);
	}
}
*/
/*
//Negative_positive
import java.util.*;
class Practice1
{
	public static void main(String args[])
	{      
	
	    Scanner scan =new Scanner(System.in);
		System.out.print("Enter the number bruh");
		int a=scan.nextInt();
		
		if(a>0)
		{
			System.out.print(a*-1);
			
		}
		else if(a<0)
		{
			System.out.print(-1*a);
			
		}
		
	}
}
*/
/*
import java.util.Arrays;
class Practice1
{
	public static void main(String args[])
	{   
	
	    
		int arr[]={4,67,85,32,45,23,90,80,70,56,22};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
			
	  

		}
		System.out.println(" ");
	  
		System.out.println(arr[arr.length/2]);
	}
	
}
*/
/*
import java.util.*;
class Practice1
{
	public static void main(String args[])
	{
	      String s="AeEsWWGwFrWJL";
		  
		  for(int i=0;ai<s.length();i++)
		  {
			 if(s.charAt(i)=='W')
			 {				 
			  System.out.println(i);
			 }
		  }
		
	}
}
*/
/*
//

import java.util.Arrays;

public class AnagramChecker {

    static boolean isAnagram(String a, String b)
	{
        
        String c = a.toLowerCase();
        String d = b.toLowerCase();

    
        if (c.length() != d.length()) 
		{
            return false; 
        }

        
        char[] p = c.toCharArray();
        char[] q = d.toCharArray();

       
        Arrays.sort(p);
        Arrays.sort(q);

        
        return Arrays.equals(p, q); 
    }

    public static void main(String[] args) {
        String str1 = "Listen";
        String str2 = "Silent";

        if (isAnagram(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}
*/
/*
//Hashmap
import java.util.HashMap;

class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap to store roll numbers and student names
        HashMap<Integer, String> students = new HashMap<>();

        // Add key-value pairs to the HashMap
        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charlie");
        students.put(104, "David");

        // Display the HashMap
        System.out.println("Student HashMap: " + students);

        // Access a value by key
        String studentName = students.get(102);
        System.out.println("Student with roll number 102: " + studentName);

        // Check if a key exists
        if (students.containsKey(103)) {
            System.out.println("Roll number 103 exists in the HashMap.");
        }

        // Remove a key-value pair
        students.remove(104);
        System.out.println("After removing roll number 104: " + students);

        // Iterate through the HashMap
        System.out.println("Iterating over the HashMap:");
        for (Integer rollNo : students.keySet()) {
            System.out.println("Roll No: " + rollNo + ", Name: " + students.get(rollNo));
        }

        // Get the size of the HashMap
        System.out.println("Total students: " + students.size());
    }
}
*/
/*
//second largest using tree
import java.util.*;
class Practice1
{
     public static void main(String args[])
	 {
		 int arr[]={1,3,4,5,3,2,7,5,3,66,44,87,44,33,99,99,66,44,55,2,1,6};
		
		 TreeSet hs=new TreeSet();
		 for(int i=0;i<arr.length;i++)
		 {
			 hs.add(arr[i]);
		 }
		ArrayList al=new ArrayList(hs);
		 System.out.print(al.get(al.size()-(2)));
		 
	 }	 
}
*/

/*
import java.util.*;
import java.math.*;
class Practice1
{
	public static void main(String args[])
	{
		
		
		   
	       double d =Math.random()*10;
		   
		   int app=(int)(d*10);
		   System.out.print(app);
		   System.out.print("Guess the number");
		   
		   Scanner scan=new Scanner(System.in)
		   int guess=scan.nextInt();
		   
		   while(true)
		   {
			   
		   }
		
	}
}
*/
/*
class Practice1
{
	public static void main(String args[])
	{
		int temp=0;
		int z=1;
		 //1 2 3 4 5 
		 //5 1 2 3 4-->right shift
	     //2 3 4 5 1 left shift
		int arr[]={1,2,3,4,5};
		
		/*
		//left
		for(int i=0;i<arr.length-1;i++)
		{
			temp =arr[i+1];
		   arr[i+1]=arr[i];
		   arr[i]=temp;	   
		}
		*/
		/*
		//right
		int f=arr[0];
		int last =arr.length-1;
		for(int i=0;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];  
		}
		arr[last]=f;
		for(int j=0;j<arr.length;j++)
		{
		 System.out.print(arr[j]+" ");
		}
	}
}
*/

/*
//Maximum subarray 
//using kedane's Algo
class Practice1
 {
    
    public static void main(String args[])
     {
		 int arr[]={1,3,4,5,-7,-9,2};
        int temp=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        
               if(sum>temp)
                  {
                    temp=sum;
                  }
               if(sum<0)
                  {
                     sum=0;
                   }
        }
    System.out.print(temp);
  }
}

*/


/*
//moving zeros to end
class Practice1
 {
    public static void main(String args[])
	{
		int nums[]={12,4,5,0,0,8,0,2,3,0,0,0,1};
        int count = 0;  
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
               
                int temp = nums[count];
                nums[count] = nums[i];
                nums[i] = temp;
                count=count+1;
				
            }
        }
		for(int z=0;z<nums.length;z++)
		{
		System.out.print(nums[z]+" ");
		}
    }
}
*/
/*
class Practice1
 {
    public static void main(String args[]) 
	{
        int nums[] = {12, 4, 5, 0, 0, 8, 0, 2, 3, 0, 0, 0, 1};
        int count = nums.length - 1;  

        
        for (int i = nums.length - 1; i >= 0; i--)
			{
            if (nums[i] != 0) {
                int temp = nums[count];
                nums[count] = nums[i];
                nums[i] = temp;
                count--;
            }
        }

        
        for (int z = 0; z < nums.length; z++) {
            System.out.print(nums[z] + " ");
        }
    }
}


*/

/*
//median of sorted array
import java.util.*;
class Practice1 {
    public static double find(int[] nums1, int[] nums2) 
    { 
        int arr[]=new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++)
        {
            arr[i]=nums1[i];
        }
        for(int j=0;j<nums2.length;j++)
        {
            arr[j+nums1.length]=nums2[j];
        }
        Arrays.sort(arr);
    

        if(arr.length%2==0)//even
        {
            double a=  (arr[arr.length/2]+arr[(arr.length/2)-1])/2.0;// 1 2 3 4-->even --> arr.length/2-->    4/2= 2,,  (arr.length/2)-1==1;
           return a;
        }
        else if (arr.length%2!=0)//odd
        {
           int b=arr[(arr.length)/2];
              return b;
        }

     return -1 ;
    }
	public static void main(String args[])
	{
		int app1[]={1,2,3,4,5,6,7};
		int app2[]={8,9,10,11,12};
		System.out.print(find(app1,app2));
	}
}
*/

/*
//Best time to buy and sell
class Practice1
{
    public static void main(String args[])
    {
		int prices[]={8,4,6,8,9,1,5,3};
        int buytime = prices[0];
        int maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buytime) {
                buytime = prices[i];
            } else if (prices[i] - buytime > maxprofit) {
                maxprofit = prices[i] - buytime;
            }
        }
        System.out.print(maxprofit);
    }
}
*/


/*
//Linked List reversed
class ListNode 
{
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Practice1 {

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null)
			{
            ListNode nextNode = current.next;  // Save the next node
            current.next = prev;               // Reverse the pointer
            prev = current;                    // Move prev forward
            current = nextNode;                // Move current forward
        }
 
        return prev;  // prev becomes the new head
    }

    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args)
	{
        // Create a LinkedList: 1 -> 2 -> 3 -> 4 -> null   
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        System.out.print("Original List: ");
        printList(head);

        ListNode reversedHead = reverseList(head);

        System.out.print("Reversed List: ");
        printList(reversedHead);
    }
}
*/
/*
class Practice1
{
	public static void main(String args)
	{
		int arr1[]={1,2,3,5,6,8,12,10};
		int arr2[]={44,77,1,3,9,3,0,7};
		int arr3[]={2,1,3,55,3,8,5,8,4};
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				for(int k=0;k<arr3.length;k++)
				{
					if(arr)
				}
			}
		}
		
		
		
		
	}
}
*/


/*
//merging two linked list1


class Practice1 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2)
     {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        
        while (list1 != null && list2 != null)
			{
            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        
    //remaining nodes
        if (list1 != null)
        {
            current.next = list1;
        }
        else
        {
             current.next = list2;
        }
        return dummy.next;  
        }
    }
public static void main(String args[])
{
	// call the method here
}
*/
/*
// Linked List

// Define the Node class first
class Node {
    int data;   // Value stored in the node
    Node next;  // Pointer to the next node

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
/*
// Define the LinkedList class
class LinkedList {
    Node head; // Head of the linked list

    // Append a new node at the end
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Display the linked list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Reverse the linked list
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node nextNode;

        while (current != null) {
            nextNode = current.next; // Store next node
            current.next = prev; // Reverse the pointer
            prev = current; // Move prev to current
            current = nextNode; // Move current to next node
        }
        head = prev; // Update head to new first node
    }
}

// Main class
public class Practice1 {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.append(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);

        System.out.println("Original Linked List:");
        ll.display();

        ll.reverse();
        System.out.println("Reversed Linked List:");
        ll.display();
    }
}
*/
/*
class Practice1
{
	public static void main(String args[])
	{
		int nithin_age=21;
		int nithin_got_job=23;
		int nithin_job_salary=3000000;
		int nithin_job_retirement=40;
		int monthly_expense=10000;
		int house_cost=5000000;
		int z=0;
		
		
		//write a program to find at what age nithin bro will be able to 
		//buy a house worth of 51lakhs and find whether he could buy the house
		
		
		
		int a=nithin_job_salary/12;
		int b=a-monthly_expense;//montly savings
		
		
		int c=nithin_job_retirement-nithin_got_job;//years of work
		int d=c*12;//no.of months nithin bro works
		
		
		int e=d*b;//total amount nithin will have after retirement
		
		
		for(int i=0;i<d;i++) 
		{ 
	
	       
			z=b*i; 
			if(z>=house_cost)
			{
				
			int y=nithin_got_job+i/12;
			int g=i%12;
			System.out.println(g);
		  
			System.out.println("Bro gonna build a house at the age "+" "+y+" "+"years "+g+"months");
			
			break;
			
			}
		    
		}
		
		
	}
		
}

*/
/*
class Node
{
	int data;
	Node next;
	public Node(int data)
	{
		this.data=data;
		this.next=null;
	}
	
}	
class LinkedList
{
	
	Node head;
	
	  public LinkedList()
	  {
		  this.head=null;
	  }


	
}
*/
/*
*
**
***
****
*****
*/
/*
public class Practice1
 {
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
			System.out.println("*");
		   
			}
		}
				
			}
		}
		
	*/	

	/*
	class Node 
	{
    int data;
    Node next;

    Node(int data)//Constructor 
	{
        this.data = data;
        this.next = null;
    }
}

class Practice1 {
    private Node head;

    // Insert at the end
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Delete a node by value
    public void delete(int data) {
        if (head == null) return;
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.data != data) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    // Display the list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Practice1 list = new Practice1();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.display(); // Output: 10 -> 20 -> 30 -> null

        list.delete(20);
        list.display(); // Output: 10 -> 30 -> null
    }
}
*/


//a[]=[7,0,5,1,3]  -> E[], Element of E[0] to E[N-1], where input each element is separated by new line 
//b[]=[1,2,1,3,4]   -> L[], Element of L[0] to L[N-1], while input each element is separate by new line.


/*
import java.util.*;
class Practice1
{
	
	public static void main(String args[])
	  {
		  
		  ArrayList<Integer> ar=new ArrayList<>();
		
		int a[]={7,0,5,1,3};
		int b[]={1,2,1,3,4};
        int c=0;
        int s=0;
      for(int i=0;i<a.length;i++)
{
	  c = s+a[i]-b[i];//6,4,
	  ar.add(c);
	  s=c;
	  
	  
	  
}
          System.out.print(Collections.max(ar));



	  }
	 }
*/
/*   
   An intelligence agency has received reports about some threats.
   The reports consist of numbers in a mysterious method.
   There is a number "N" and another number "R".
   Those numbers are studied thoroughly and it is
   concluded that all digits of the number ‘N’ are summed up
   and this action is performed ‘R’ number of times.
   The resultant is also a single digit that is yet to be deciphered. 
   The task here is to find the single-digit sum of the given number ‘N’ by repeating the action ‘R’
   number of times.

If the value of ‘R’ is 0, print the output as ‘0’.

Example 1:

Input :

99 -> Value of N

3  -> Value of R

Explanation:

Here, the number N=99

Sum of the digits N: 9+9 = 18
Repeat step 2 ‘R’ times i.e. 3 tims  (9+9)+(9+9)+(9+9) = 18+18+18 =54
Add digits of 54 as we need a single digit 5+4
Hence , the output is 9.

*/


/*
import java.util.*;
class Practice1
{
	public static void main(String args[])
	{
		int N=99;
		int R=2;
		
		int m=0;
		
		String sv=Integer.toString(N);
		
		for(int i=0;i<sv.length();i++)
		{
			          
			  m= m+ Character.getNumericValue(sv.charAt(i));
			  
					
		}
				
		System.out.println(m);
				
		int ww=m*2;
		
		int y=0;
		
		String kkk=Integer.toString(ww);
		
		for(int i=0;i<kkk.length();i++)
		{			
              
			  y= y+ Character.getNumericValue(kkk.charAt(i));
			  
						
		}
		System.out.print(y);
		
		
		
		
	}
	
}

*/




/*
//KAPREKAR NUMBER
// 45 45^2   == 2025    -->20+25=45    KAPREKAR NUMBER

class Practice1
{
	public static void main(String args[])
	
	{
		StringBuilder sb=new StringBuilder();
		StringBuilder sb2=new StringBuilder();
		
		int num=9;
		int sqr=num*num;
		
		
		
		//45 2025
		String s=Integer.toString(sqr);
		for(int i=0;i<s.length()/2;i++)
		{
			sb.append(s.charAt(i));
		}
		for(int j=s.length()/2;j<s.length();j++)
		{
			sb2.append(s.charAt(j));
			
		}
		
		
		int value1=Integer.parseInt(sb.toString());
		int value2=Integer.parseInt(sb2.toString());
		
		
		int res=value1+value2;
		
		
		
		if(num==res)
		{
			System.out.println("yes it is a  KAPREKAR NUMBER");
		}
		else
		{
			System.out.println("no its not a KAPREKAR NUMBER");
		}
		
		
		
	}
	
}

*/

/*


class Practice1
{
	public static void main(String[] args)
	{
		int a=9;
		String s1="";
		String s2="";

		String res=a*a+"";
		
		if(res.length()%2==0)
		{//2025
			for(int i=0;i<res.length()/2;i++)
			{
				s1=s1+res.charAt(i);
			}
			for(int i=res.length()/2;i<res.length();i++)
			{
				s2=s2+res.charAt(i);
				
			}
			System.out.println(s2);
			int num=Integer.parseInt(s1)+Integer.parseInt(s2);
			
			
			if(num==a)
			{
				System.out.println("The number is KAPREKAR");
			}
			else
			{
				System.out.println("The number is NOT KAPREKAR");
				
			}
		}
		
		
	}
}



*/
/*
import java.util.*;
class Practice1
{
	public static void main(String args[])
	{
		int arr[]={1,2,3,3,4,5,6};
		HashMap<Integer,Integer> hp=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			hp.put(arr[i],hp.getOrDefault(arr[i],0)+1);
		}
		
		for(int key:hp.keySet())
		{
			if(hp.get(key)==1)
			{
				System.out.println(key+" ");
			}
		}
		
		
		
	}
}
*/
/*
import java.util.*;
class Practice1
{
	public static void main(String args[])
	{
		int sum=0;
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		
		for(int i=2;i<=num;i++)
		{
			
			if(m1(i))
			{
				sum+=i;
			}
		}
		System.out.print(sum);
	}
	public static boolean m1(int zz)
	{
		boolean res=true;
		for(int i=2;i<=Math.sqrt(zz);i++)
		{
			if(zz%i ==0)
			{
				return false;
				
			}
			
		}
		return res;
	}
	
	
		
	
}

*/

  /*               
import java.util.*;
class Practice1
{
	public static void main(String args[])
	{
		
		int arr[]={1,2,0,0,9,7,6,0,9};
		int arr1[]=new int[arr.length];
		int count=0;
		
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr[i]!=0)
			{
				arr1[count]=arr[i];
				count++;
			}
		}
		for(int j=0;j<arr1.length;j++)
		{
		System.out.print(arr1[j]+" ");
		}
		
	}
	
}
*/
/*
import java.util.*;
class Practice1
{
	public static void main(String args[])
	{
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter the Word"+" ");
		String word=scn.nextLine();
		
		System.out.println("The first non repeating character is" +" "+ m1(word));
		System.out.println("The most frequent character in the String is"+" "+ m2(word));
	
	}
	
	public static String m1(String ee)
	{
		ee=ee.toLowerCase();
		String res="None";
		LinkedHashMap<Character,Integer> hp=new LinkedHashMap<>();
		
		for(char c:ee.toCharArray())
		{
			hp.put(c,hp.getOrDefault(c,0)+1);
		}
		for(char d:hp.keySet())
		{
			if(hp.get(d)==1)
			{
				return String.valueOf(d);
			}
		}
		return res; 
	}
	
	public static char m2(String ee)
		{
			
		
		ee=ee.toLowerCase();
		LinkedHashMap<Character,Integer> hp=new LinkedHashMap<>();
		for(char c:ee.toCharArray())
		{
			hp.put(c,hp.getOrDefault(c,0)+1);
		}
		int max=0;
		char ans=ee.charAt(0);
		
		for(char d:hp.keySet())
		{
			if(max<hp.get(d))
			{
				
				max=hp.get(d);
				
				ans=d;
				
			}
			
		}
		return ans;
		 
	}
	
	
}
*/
//LinkedHashMap
//LinkedHashSet



/*
//Valid Parenthesis
import java.util.Stack;

public class Practice1 
{
	public static void main(String[] args)
	{
		Practice1 obj = new Practice1();
		System.out.println(obj.isValid("()[]"));
	}

	public boolean isValid(String s) 
	{

		Stack<Character> stack_obj = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') 
			{
				stack_obj.push(s.charAt(i));
			} 
			else 
			{
				if (stack_obj.isEmpty())
					return false;
				else if (s.charAt(i) == '}') 
				{
					if (stack_obj.peek() == '{')

						stack_obj.pop();

					else
						return false;
					
				} 
				else if (s.charAt(i) == ')') {
					if (stack_obj.peek() == '(')

						stack_obj.pop();

					else
						return false;
					
				} else if (s.charAt(i) == ']') {
					if (stack_obj.peek() == '[')

						stack_obj.pop();

					else
						return false;
				}
			}

		}
		if (stack_obj.size() == 0)
			return true;
		else
			return false;

	}

	
}
*/
/*
////a1b2c3  alpha number
        
import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a string");
        String s=obj.nextLine();//a1b2c3  or
        //a12b15
       char []ch=new char[s.length()];
     
       
       for(int i=0;i<s.length();i++)
       {
    	   ch[i]=s.charAt(i);
       }
  
     
       for(int i=0;i<ch.length;i++)
       {
    	   int num=0;
    	   if(ch[i]>='0' && ch[i]<='9')
    	   {
    		   char temp =ch[i-1];
    		   for(int j=i;j<ch.length;j++)
    		   {
    			   if(ch[j]>='0' && ch[j]<='9')
    			   {
    				   num=(num*10)+ch[j]-48;  
    			   }
    			   else
    			   {
    				   break;
    			   }
    			   i++;
    		   }
    		 
    		   for(int k=0;k<num;k++)
    		   {
    			System.out.print(temp);
    		   }
    	   }
    	   
       }
	   
	   
       
}
}
*/

/*
//roman to Integer
public class Practice1
{
	
	public static void main(String[] args)
	{

		Practice1 obj = new Practice1();
		System.out.println(obj.romanToInt("XX"));
	}

	public int value(char r)
	{
		if (r == 'I')
			return 1;
		if (r == 'V')
			return 5;
		if (r == 'X')
			return 10;
		if (r == 'L')
			return 50;
		if (r == 'C')
			return 100;
		if (r == 'D')
			return 500;
		if (r == 'M')
			return 1000;
		return -1;
	}

	public int romanToInt(String s) 
	{

		int total = 0;

		for (int i = 0; i < s.length(); i++) {
			int s1 = value(s.charAt(i));

			if (i + 1 < s.length())
			{
				int s2 = value(s.charAt(i + 1));

				if (s1 >= s2) 
					
				{

					total = total + s1;
				} else {

					total = total - s1;
				}
			} else {
				total = total + s1;
			}
		}

		return total;

	}


}
*/

import java.util.Scanner;

class Practice1 {
    public String firstPalindrome(String[] words) {
        for (String input : words) {
            if (isPalindrome(input.trim().toLowerCase())) { // Trim spaces & make it case-insensitive
                return input.trim();
            }
        }
        return "No palindromic word found";
    }

    public static boolean isPalindrome(String s) {
        int start = 0, end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter words separated by spaces: ");
        String input = scanner.nextLine().trim(); // Trim leading and trailing spaces
        scanner.close();
        
        String[] words = input.split("\\s+"); // Splitting words based on spaces
        Practice1 obj = new Practice1();
        System.out.println("First Palindromic Word: " + obj.firstPalindrome(words));
    }
}

/*
//peak element
class Practice1
 {
	 public static void main(String args[])
	 {
		 int arr[]={10,40,80,3,2};
		 Practice1 pp=new Practice1();
		 System.out.println(pp.findPeakElement(arr));
	 }
	 
	 
	 
	 
    public int findPeakElement(int[] nums)
	{
         int start=0;
        int end=nums.length-1;

        while(start<end)
        {
            int mid=start+(end-start)/2;

            if(nums[mid]>nums[mid+1])
                end=mid;
            else
                start=mid+1;
        }

        return nums[start];
		//index means return only start
    }
}
*/
/*
//permutation
import java.util.*;

public class Practice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.println("Unique Permutations:");
        generatePermutations(str, 0, str.length() - 1);
        scanner.close();
    }

    public static void generatePermutations(String str, int left, int right) {
        if (left == right) {
            System.out.println(str);
            return;
        }

        HashSet<Character> used = new HashSet<>(); // Track swapped characters

        for (int i = left; i <= right; i++) {
            if (used.contains(str.charAt(i))) continue; // Skip duplicates

            used.add(str.charAt(i)); // Mark character as used
            str = swap(str, left, i);
            generatePermutations(str, left + 1, right);
            str = swap(str, left, i); // Backtrack
        }
    }

    public static String swap(String str, int i, int j) {
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return new String(charArray);
		
    }
}
*/

/*
//Bubble sort
import java.util.*;

public class Practice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        bubbleSort(arr);

        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(arr));

        scanner.close();
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no elements were swapped, array is already sorted
            if (!swapped) break;
        }
    }
}

*/

/*

//Valid IP address

class Practice1 {
    public String validIPAddress(String IP) {
        if (IP.length() == 0) 
            return "Neither";
        
        if (IP.indexOf(".") >= 0) 
            return validateIPV4(IP);
        
        if (IP.indexOf(":") >= 0) 
            return validateIPV6(IP);
        
        return "Neither";
    }

    private String validateIPV4(String ip) {
        try {
            if (ip == null || ip.isEmpty())
                return "Neither";
            
            String arr[] = ip.split("\\.");
            if (arr.length != 4)
                return "Neither";
            
            for (String s : arr) {
                int no = Integer.parseInt(s);
                if (no < 0 || no > 255 || s.charAt(0) == '0' && s.length() > 1)
                    return "Neither";
            }
        
            if (ip.endsWith("."))
                return "Neither";
                
            return "IPv4";
        } catch (Exception e) {
            return "Neither";
        }
    }

    public String validateIPV6(String ip) {
        if (ip == null || ip.isEmpty())
            return "Neither";
        
        String[] arr = ip.split(":");
        
        if (arr.length != 8)
            return "Neither";
        
        for (String s : arr) {
            
            if (s.isEmpty() || s.length() > 4)
                return "Neither";
            
            
            for (char c : s.toCharArray()) {
                if (!isHexCharacter(c))
                    return "Neither";
            }

            if (ip.endsWith(":"))
                return "Neither";
        }
        
        return "IPv6";
    }

    public boolean isHexCharacter(char c) {
        return Character.isDigit(c) || (c >= 'a' && c <= 'f') || (c >= 'A' && c <= 'F');
    }

    public static void main(String[] args) {
        Practice1 obj = new Practice1();
        
        // Test cases
        System.out.println(obj.validIPAddress("192.168.1.1"));
        
    }
}
*/
/*

import java.util.Scanner;

public class Practice1 {
    public static int findSubstring(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();

        // Loop through str1, trying to match str2
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (str1.charAt(i + j) != str2.charAt(j)) {
                    break; // Mismatch found, break and move to next position
                }
            }
            if (j == m) {
                return i; // Found substring starting at index i
            }
        }
        return -1; // Not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string (String1): ");
        String str1 = scanner.nextLine();

        System.out.println("Enter the second string (String2): ");
        String str2 = scanner.nextLine();

        int index = findSubstring(str1, str2);
        System.out.println("Output: " + index);

        scanner.close();
    }
}

*/
/*
//oddo even asc des
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Practice1 {
    public static void main(String[] args) {
        int[] arr = {13, 2, 4, 15, 12, 10, 5};
        sortOddEvenValues(arr);

      
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void sortOddEvenValues(int[] arr) {
        List<Integer> oddValues = new ArrayList<>();
        List<Integer> evenValues = new ArrayList<>();

       
        for (int num : arr) {
            if (num % 2 == 0) {
                evenValues.add(num);
            } else {
                oddValues.add(num);
            }
        }

        
        Collections.sort(oddValues, Collections.reverseOrder());

       
        Collections.sort(evenValues);

        
        int index = 0;
        for (int num : oddValues) {
            arr[index++] = num;
        }
        for (int num : evenValues) {
            arr[index++] = num;
        }
    }
}
*/

/*
//Given two sorted arrays, merge them such that the elements are not repeated


//Array 1: 2,4,5,6,7,9,10,13

//Array 2: 2,3,4,5,6,7,8,9,11,15

//Merged array: 2,3,4,5,6,7,8,9,10,11,13,15 


import java.util.*;
class Practice1
{
	public static void main(String args[])
	{
		int arr1[]={2,4,5,6,7,9,10,13};
		int arr2[]={2,3,4,5,6,7,8,9,11,15};
		
		
		HashSet<Integer> hs=new HashSet<>();
		for(int num1:arr1)
		{
			hs.add(num1);
		}
		for(int num2:arr2)
		{
			hs.add(num2);
			
		}
		ArrayList<Integer> al=new ArrayList<>(hs);
		Collections.sort(al);
		
		
		for(int i=0;i<al.size();i++)
		{
			System.out.print(al.get(i)+" ");
		}
		
	
	}
}

*/
/*
import java.util.*;
class Practice1
{
	public static void main (String args[])
	{
		String a ="Hello";
		int n=a.length();
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j || j+i==n-1)
				{
					System.out.print(a.charAt(i)+" ");
					
				}
				else 
				{
					System.out.print("  ");
				}
			}
			
			
			System.out.println("");
		}
	}

	
}
*/



















 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
