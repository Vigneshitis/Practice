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
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 