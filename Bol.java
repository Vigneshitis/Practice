
/*Throws an error because the data member is private cant change the value of the variable only it can access 
but cant change or manipulate it*/
/*
class Bol
{
	public static void main(String[] args)
	{
		Stud s1=new Stud(101,"Arun",7.7);
		
		//System.out.println(s1.rno);
		System.out.println(s1.getRno());
		s1.rno=900;
		System.out.println("=="+s1.rno);
		
		
	}
}

class Stud
{
    private int rno;
	private String name;
	private double perc;
	
	Stud(int rno, String name, double perc)
	{
		super();
		this.rno=rno;
		this.name=name;
		this.perc=perc;
	}
	
	public int getRno()
	{
		return rno;
	}
}
*/
/*Program works because the correct access specifier is given ie.public 
here we can change the value because the access specifier is public*/

/*
class Bol
{
	public static void main(String[] args)
	{
		Stud s1=new Stud(101,"Arun",7.7);
		//recieving the returning value=int rno=s1.getRno();
		//System.out.println(s1.rno);
		System.out.println(s1.getRno());
		s1.rno=900;
		System.out.println("=="+s1.rno);
		
		
	}
}

class Stud
{
    public int rno;
	private String name;
	private double perc;
	
	Stud(int rno, String name, double perc)
	{
		super();
		this.rno=rno;
		this.name=name;
		this.perc=perc;
	}
	
	public int getRno()
	{
		return rno;
	}
}
*/
// Getter and Setter Method
/*
class Bol
{
	public static void main(String[] args)
	{
		Stud s1=new Stud(101,"Arun",7.7);
		
		System.out.println(s1.getRno());
		s1.setRno(222);
		System.out.println(s1.getRno());
		s1.setName("Vignesh");
		System.out.println(s1.getName());
		System.out.println(s1.getPerc());
	}
}

class Stud
{
	//all the data members are private
	private int rno;
	private String name;
	private double perc;
	
	Stud(int rno, String name, double perc)
	{
		super();
		this.rno=rno;
		this.name=name;
		this.perc=perc;
	}
	//here  we are creating getter for each datatype all the acess specifier should be public 
	
	public int getRno()
	{
		return rno;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getPerc()
	{
		return perc;
	}
	
	public void setRno(int rno)
	{
		this.rno=rno;
	}
	//Here we creating setter to set the values and 
	//we can access the setted value usind getter once again
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setPerc(double perc)
	{
		this.perc=perc;
	}
	
}

*/





/*polymorphism having same function name but different name but with different signature and the signature are
1)no. of arguments
2)argument type*/

/*
class Bol
{
	public static void main(String[] args)
	{
		
		Test t=new Test();
		t.add(5,5);
		t.add("Hai","Bye");
		t.add(4.6,7.3);
		
	}
}

class Test
{
	void add(int a,int b)
	{
		System.out.println(""+a);
		System.out.println("=="+b);
	}	
	void add(String a,String b)
	{
		System.out.println("2 String");
	}
	void add(double a,double b)
	{
		System.out.println("2 Double");
	}
}
*/


/*
class Bol
{
	public static void main(String[] args)
	{
		
		Test t=new Test();
		t.add(5.5,5.3);
		t.add(5,7);
		
	}
}

class Test
{
	
	void add(int a,int b)
	{
		System.out.print(b-a);
	}
}
*/
// having some doubts in this program
/*
class Bol
{
	public static void main(String[] args)
	{
		
		Test t=new Test();
		t.add(5,3.3);
		t.add(3.3,5);
		
		t.add(2,2);	// ambiguous
		
	}
}

class Test
{
	void add(double a,int b)
	{
		System.out.println("Double Int");
	}	
	
	void add(int a,double b)
	{
		System.out.println("Int Double");
	}
}
*/
/*
class Bol
{
	public static void main(String[] args)
	{
		
		Test t=new Test();
		
		String s=new String("Hello");
		Object obj=new Object();
		
		
		t.add(s);
		t.add(obj);
		
	}
}

class Test
{
	void add(String z)
	{
		System.out.println(z);
	}	
	
	void add(Object o)
	{
		System.out.println("hmm");
	}
	
}
*/
/*
class Bol
{
	public static void main(String[] args)
	{
		
		Test t=new Test();
		//Here Object is father and String is child
		String s=new String("Hello");
		Object obj=new Object();
		
		
		t.add(s);
		t.add(obj);
		t.add(null);
		
	}
}

//Whn parent and child can accept the value
//Child will take 

class Test
{
	void add(String s)
	{
	  //Because of String is a child String will accept the null
		System.out.println("String....");
	}	
	
	void add(Object o)
	{
		System.out.println("Object....");
	}
	
}
*/
/*
class Bol
{
	public static void main(String[] args)
	{
		
		Test t=new Test();
		//Here String and String Buffer are siblings
		//so Ambiguous problem arises
		String s=new String("Hello");
		StringBuffer sb=new StringBuffer("Hello");
		
		
		t.add(s);
		t.add(sb);
		t.add(null);		// ambiguous
		
	}
}

class Test
{
	void add(String s)
	{
		System.out.println("String....");
	}	
	
	void add(StringBuffer sb)
	{
		System.out.println("StringBuffer....");
	}
}
*/
//********Inheritence Started*************
/*
class Bol
{
	public static void main(String[] args)
	{
		Parent p=new Parent();
		System.out.println(p.fname);
		
		Child c=new Child();
		System.out.println(c.sname+" - "+c.fname);
		
	}
}



//Parent : super : Base 
class Parent
{
	String fname="Sachin";
}
//Here child class can access parent members using child object only
class Child extends Parent
{
	String sname="Arjun";
}

*/

/*
//Here we are using getter method to fetch the data
class Bol
{
	public static void main(String[] args)
	{
		Parent p=new Parent();
		System.out.println(p.getFname());
		
		Child c=new Child();
		System.out.println(c.getSName()+" - "+c.getFname());
		
	}
}

//Parent : super : Base 
class Parent
{
	String fname="Sachin";
	
	String getFname()
	{
		return fname;
	}
}

class Child extends Parent
{
	String sname="Arjun";
	
	String getSName()
	{
		return sname;
	}
}
*/
/*
class Bol
{
	public static void main(String[] args)
	{
		Parent p=new Parent();
		System.out.println(p.getFname());
		
		Child c=new Child();
		System.out.println(c.getSName());
		
	}
}

//Parent : super : Base 
class Parent
{
	String fname="Sachin";
	
	String getFname()
	{
		return fname;
	}
}

class Child extends Parent
{
	String sname="Arjun";
	
	String getSName()
	{
		//return sname+" - "+fname;
		return sname+" - "+getFname();
	}
}
*/
//when both classes will have same members
//there is no variable overriding 
//there is a method overriding 
//When already parent is having same function same structrture : defining again the same function in child with same signature


/*
class Bol
{
	public static void main(String[] args)
	{
		Parent p=new Parent();
		System.out.println(p.a);
		p.m1();
		
		
		Child c=new Child();
		System.out.println(c.a);
		c.m1();
		
	}
}

//Parent : super : Base 
class Parent
{
	int a=10;
	
	//Overridden
	void m1()
	{
		System.out.println("Parent m1()");
	}
}

class Child extends Parent
{
	int a=20;
	
	//Overriding
	void m1()
	{
		System.out.println("Child m1()");
	}
}
*/
/*
class Bol
{
	public static void main(String[] args)
	{
		
		Child c=new Child();
		System.out.println(c.a);
		c.m1();
		c.m2();
		
		
	}
}

//Parent : super : Base 
class Parent
{
	int a=10;
	
	
	void m1()
	{
		System.out.println("Parent m1()");
	}
}

class Child extends Parent
{
		
	void m2()
	{
		System.out.println("Hello");
	}
}
*/
//when both classes will have same members
//there is no variable overriding 
//there is a method overriding 
//When already parent is having same function same structrture : defining again the same function in child with same signature

/*
class Bol
{
	public static void main(String[] args)
	{
		
		Non n=new Non();
		n.m5();
		
		Child c=new Child();
		System.out.println(c.a);
		c.m1();
		
	}
}

//Parent : super : Base 
class Parent
{
	public int a=9;
	void m1()
	{
		System.out.println("Parent m1()");
	}
}

class Child extends Parent
{
	
	
	
	void m1()
	{
		System.out.println("Child m1()");
	}
}

class Non

{
	void m5()
	{
		Child c=new Child();
		
		System.out.println("!!!!!!!!!"+c.a);
	}
}
//  Problem Not finding the symbol 'a'
*/
/*
//super
class Bol
{
	public static void main(String[] args)
	{
		Parent p=new Parent();
		System.out.println(p.a);
		
		
		Child c=new Child();
		c.m1();
		
	}
}

//Parent : super : Base 
class Parent
{
	int a=12;
}

class Child extends Parent
{
	int a=99;
	
	void m1()
	{
		System.out.println(a+" - "+super.a);
	}
}
// Here if we Write only variable name child class value is printed
///if we use super keyword parent class vslue is printed
*/
// Multilevel inheritence
/*
class Bol
{
	public static void main(String[] args)
	{
		Child c=new Child();
		System.out.println(c.a+" - "+c.b+" - "+c.c);
	}
}

//Multilevel
class Grandpa
{
	int a=10;
}

class Father extends Grandpa
{
	int b=100;
}

class Child extends Father
{
	int c=66;
}
*/
/*
class Bol
{
	public static void main(String[] args)
	{
		Parent p=new Parent();
		System.out.println(p.car);
		
		Son1 s1=new Son1();
		System.out.println(s1.car+" - "+s1.bike);
		
		Son2 s2=new Son2();
		System.out.println(s2.car+" - "+s2.house);
		
		p.car="Tata";
		
		System.out.println(s1.car+" - "+s1.bike);
		System.out.println(s2.car+" - "+s2.house);
	}
}

//Hierarchal
class Parent
{
	Static String car="ford";
}

class Son1 extends Parent
{
	String bike="pulzar";
}

class Son2 extends Parent
{
	String house="2bhk";
}
*/
/*
class Bol
{
	public static void main(String[] args)
	{
		
	}
}

//Multiple Inheritance : not supported in-terms of CLASSES
//Multiple Inheritance : supported in-terms of Interface
class Father
{
	void doDegree()
	{
		System.out.println("BBA");
	}
}

class Mother
{
	void doDegree()
	{
		System.out.println("BCA");
	}
}

class Child extends Father,Mother
{
	
}
*/

//In c++ : multiple inheirtance is partially supported
//In Python : multiple inheirtance is  supported
 
 
 /*
 // this keyword
class Bol
{
	static int a=10;
	
	void m1()
	{
		System.out.println(a);
		
		int a=99;
		System.out.println(a);
		System.out.println(this.a);
		
		
	}
	
	public static void main(String[] args)
	{
		Bol k=new Bol();
		k.m1();
		
	}
}
*/

/*
class Bol
{
	public static void main(String[] args)
	{
		Child c=new Child(99,78);
		System.out.println(c.a);
		System.out.println(c.b);
	}
}

//this()
//super()

class Parent
{   //instance varible
	  int a=12;
	Parent(int a)
	{
		this.a=a;
	}
}


class Child extends Parent
{
	 int b=13;
	Child(int a,int b)
	{
		super(a);
		this.b=b;
	}
}
// What is happening here is b is pointing the int b in the same child
//contructor using this keyword 
//Also we use super to call parent class constructor and also we can pass the arguments
//that we recieved
*/

/*
//this() really good concept
//this() calls own class constructor
class Bol
{
	public static void main(String[] args)
	{
		Stud s1=new Stud(101,"Arun",7.8);
		System.out.println(s1.rno+"-"+s1.name+"-"+s1.perc);
		
		Stud s2=new Stud(101,"Arun");
		System.out.println(s2.rno+" - "+s2.name+" - "+s2.perc);
	}
}


class Stud
{
	int rno;
	String name;
	double perc;
	
	Stud(int rno,String name, double perc)
	{
		super();
		this.rno=rno;
		this.perc=perc;
		this.name=name;
	}
	
	Stud(int rno,String name)
	{
		//super();
		this(rno,name,0.0);
	}
}
*/
/*
class Bol
{
	public static void main(String[] args)
	{
		Child c=new Child();
		c.m1();
	}
}

//Parent is giving m1(). 
//Child is accepting 
//No Overriding 

class Parent
{
	void m1()
	{
		System.out.println("Parent m1()");	
	}
}

class Child extends Parent
{
	
}
*/
/*
class Bol
{
	public static void main(String[] args)
	{
		Child c=new Child();
		c.m1();
		c.m2();
	}
}

//Parent is giving m1(). 
//Child is havinf m2() 
//child will have m1() +m2()
//No Overriding 

class Parent
{
	void m1()
	{
		System.out.println("Parent m1()");	
	}
}

class Child extends Parent
{
	void m2()
	{
		System.out.println("Child m2()");
	}
}

class Bol
{
	public static void main(String[] args)
	{
		Child c=new Child();
		c.m1();
		
	}
}
*/
/*
//Parent is giving m1() with some implementation
//Child doenst like 
//child is re-writting : Overriding
//Same function name with same signature : Parent and Child

class Parent
{
	//Overridden
	void m1()
	{
		System.out.println("Parent m1()");	
	}
}

class Child extends Parent
{
	//Overidding
	@Overri0de					//annotation
	void m1()
	{
		System.out.println("Child m2()");
	}
}
*/
/*
class Bol
{
	public static void main(String[] args)
	{
		Child c=new Child();
		c.m1();
		c.m1(10);
	}
}

//Inheritance with Overloading
//No Overriding

class Parent
{
	void m1()
	{
		System.out.println("Parent m1()");	
	}
}

class Child extends Parent
{
	void m1(int a)
	{//m1 in child and m1 in parent class is different because of the signature]
		System.out.println("Child m2()");
	}
}
*/


//Same function name with Same signature
//Function name must be same in both class
//Signature must be same 
//Number of argument + Arguments type exactly same 
//Retype must be same 
//From 1.7 	: Co-varient return type allowed


/*
class Bol
{
	public static void main(String[] args)
	{
		Child c=new Child();
	    c.m1(3);
		c.m1(2);
	}
}

class Parent
{
	void m1(int a)
	{
		System.out.println("Parent m1()");	
	}
}

class Child extends Parent
{
	void m1(int a)
	{
		System.out.println("Child m2()");
	    System.out.println(a);
	}
	
}
*/
 //Same function name with Same signature
//Function name must be in both class
//Signature must be same 
	//Number of argument + Arguments type exactly same 
//Retype must be same 
//From 1.7 	: Co-varient return type allowed (Non-Primitive: String,Object)
//Access specifier : must be same or broader in child class 


/*
class Bol
{
	public static void main(String[] args)
	{
		Child c=new Child();
		String x=c.m1(7);
		System.out.println(x);
	}
}

class Parent
{
	Object m1(int a)
	{
		System.out.println("Parent m1()");	
		return new Object();
	}
}

class Child extends Parent
{
	String m1(int a)
	{
		System.out.println("Child m2()"+a);
		return "ggg";
	}
}
*/
//Same function name with Same signature
//Function name must be in both class
//Signature must be same 
	//Number of argument + Arguments type exactly same 
//Retype must be same 
//From 1.7 	: Co-varient return type allowed (Non-Primitive)
//Access specifier : must be same or broader in child class 
	//public 	: public 
	//default 	: default public 
	//protected : protected default public 
	//private 	: not allowed
//Private methods will not inherit : So No Overriding

/*	
class Bol
{
	public static void main(String[] args)
	{
		Child c=new Child();
		c.m1();
	}
}

class Parent
{
	public void m1()
	{
		System.out.println("Parent m1()");	
	}
}
//cant override because of access specifier 
class Child extends Parent
{
	void m1()
	{
		System.out.println("Child m2()");
	}
}
*/
/*
//Same function name with Same signature where signature is argumen type and number
//Function name must be in both class
//Signature must be same 
	//Number of argument + Arguments type exactly same 
//Return type must be same 
//From 1.7 	: Co-varient return type allowed (Non-Primitive)
//Access specifier : must be same or broader in child class 
	//public 	: public 
	//default 	: default public 
	//protected : protected default public 
	//private 	: not allowed
//Private methods will not inherit : So No Overriding
//Final Methods cannot 
//Static method cannot override (Method Hiding)
	
class Bol
{
	public static void main(String[] args)
	{
		Child c=new Child();
		c.m1();
		
	}
}

class Parent
{
	final void m1()
	{
		System.out.println("Parent m1()");	
	}
}

class Child extends Parent
{
	void m1()
	{
		System.out.println("Child m2()");
	}
}


//variable final : Constant 
//method final : Cannot override
//class final : no inheritance 

//final, finally, finalize 
*/

/*
//Same function name with Same signature
//Function name must be in both class
//Signature must be same 
	//Number of argument + Arguments type exactly same 
//Retype must be same 
//From 1.7 	: Co-varient return type allowed (Non-Primitive)
//Access specifier : must be same or broader in child class 
	//public 	: public 
	//default 	: default public 
	//protected : protected default public 
	//private 	: not allowed
//Private methods will not inherit : So No Overriding
//Final Methods cannot 
//Static method cannot override (Method Hiding)
//Abstract Method must & Should override
	
class Bol
{
	public static void main(String[] args)
	{
		Child c=new Child();
		c.m1();
	}
}

class Parent
{
	static void m1()
	{
		System.out.println("Parent m1()");	
	}
}

class Child extends Parent
{
	void m1()
	{
		System.out.println("Child m2()");
	}
}
*/


/*
//Same function name with Same signature
//Function name must be in both class
//Signature must be same 
	//Number of argument + Arguments type exactly same 
//Retype must be same 
//From 1.7 	: Co-varient return type allowed (Non-Primitive)
//Access specifier : must be same or broader in child class 
	//public 	: public 
	//default 	: default public 
	//protected : protected default public 
	//private 	: not allowed
//Private methods will not i
//Static method cannotnherit : So No Overriding
//Final Methods cannot  override (Method Hiding)
//Abstract Method must & Should override
//No Variable overriding concept in Java 
//Exception Handling
	
class Bol
{
	public static void main(String[] args)
	{
		Child c=new Child();
		c.m1();
	}
}

abstract class Parent
{
	abstract void m1();
}

class Child extends Parent
{
	void m1()
	{
		System.out.println("Child m2()");
		System.out.println("Hi there wassup");
	}
}
*/

/*
class Bol
{
	public static void main(String[] args)
	{
		//Parent p=new Parent();
		//p.m1();
		
		
		//Child c=new Child();
		//c.m1();
		//c.m2();
		
		
		//Child object referred by Parent reference
		//Child object :  parent reference
		//Using child : Access Only Parent specific methods
		Parent p=new Child();
		p.m1();
		//Parent t=new Parent();
		//t.m1();
		
		
		//Use?
		//In Java there are some classes(Abstract Class) we cannot create object
		//Those classes are designed to sub classed 
		//With inheritance 
		
		
		
		//System.out.println(p instanceof Parent);
		//System.out.println(p instanceof Child);
		
		//Child c=(Child)new Parent();		//Error
		//Employee e=new Manager();
		//Animal a=new Dog();
		
	}
}

abstract class Parent
{
	void m1()
	{
		System.out.println("Parent m1()");
	}
}

class Child extends Parent
{
	void m2()
	{
		System.out.println("Child m2()");
	}
}
*/
/*
class Bol
{
	public static void main(String[] args)
	{
		// Child object with parent referece
		//if parent css is abstract we can access the methods in that class 
		//using this type of object creation
		Parent p=new Child();
		p.m1();
		
	}
}

class Parent
{
	void m1()
	{
		System.out.println("Parent m1()");
	}
}

class Child extends Parent
{
	void m1()
	{
		System.out.println("Child m2()");
	}
}
// Child only will come because when same method name is there 
//Child will override in this type of program is well
*/
/*
class Bol
{
	public static void main(String[] args)
	{
		
	}
}

final class FTest
{
	
}

class Child extends FTest
{
	
}
//inheritence itself not possible for final access Modifier
*/
/*
//Abstraction is Started


class Bol
{
	public static void main(String[] args)
	{
		//Car c=new Car();
		
		Tata t=new Tata();
		t.engine();
	}
}


abstract class Car
{
	abstract void engine();
}

class Tata extends Car
{
	void engine()
	{
		System.out.println("100kmph");
	}
}
//Child is overriding the parent's abstact method
*/
/*
class Bol
{
	public static void main(String[] args)
	{
		Dog d=new Dog();
		d.speed();
		d.eat();
		d.legs();
		d.lifetime();
	}
}


abstract class Animal
{
	abstract void speed();
	abstract void eat();
	void legs()
	{
		System.out.println("4 legs");
	}
	abstract void lifetime();
}

class Dog extends Animal
{
	void speed(){System.out.println("10kmph");}
	void eat(){System.out.println("Milk & biscuit");}
	void lifetime(){System.out.println("15years");}
}
//except legs method all the other methods should override
//legs method will be applied for all the child that is inherited
*/

/*
// abstract and extends
class Bol
{
	public static void main(String[] args)
	{
		Cow c=new Cow();
		c.eatPlant();
		c.givesMilk();
		c.walk();
	}
}

abstract class Herb
{
	abstract void eatPlant();
	
	void walk()
	{
		System.out.println("Avg 10kmph");
	}
}

abstract class DomAnimal extends Herb
{
	abstract void givesMilk();
}

class Cow extends DomAnimal
{
	void eatPlant()
	{
		System.out.println("Grass");
	
	}
	
	void givesMilk()
	{
		System.out.println("Vitamin A");
	}
}
*/

/*
abstract class Aqa
{
	abstract swim()
}

abstract coldBlooded extends Aqa
{
	void LiveinLand();
}

class Fish extends Aqa {}
class Frog extends coldBlooded{}




abstract class Person
{
	void age();
	void name();
}

abstract class Staff extends Person
{
	int sid;
	String semail;
}

abstract class NonTeach extends Person
{
	String dresscode;
}
*/

/*
//Interface is started
//Interface is pure abstraction
//100% Abstraction
//Herw we directly write interface instead of using the word class
//Interface and implements
class Bol
{
	public static void main(String[] args)
	{
		//Animal a=new Animal();
		Dog d=new Dog();
		d.speed();
		
		
	}
}

interface Animal
{
	int age=15;
	void speed();
}

class Dog implements Animal
{
	public void speed()
	{
		System.out.println("10kmph");
		System.out.println(age);
	}
}
*/
/*
class Bol
{
	public static void main(String[] args)
	{
		System.out.println(
		"**********car ************");
		Car c=new Car();
		c.speed();		
		c.color();
		c.seats();
		
		System.out.println("********Bike********** ");
		
		Bike b=new Bike();
		b.speed();
		b.seats();
		b.color();
		
	}
}

//Program head will give Interface or abstract

interface Vehicle
{
	void speed();
	void seats();
	void color();
}
//Where employs will implement the method using implements
class Car implements Vehicle
{
	public void speed(){System.out.println("100kmph");}
	public void seats(){System.out.println("5 seater");}
	public void color(){System.out.println("White");}
}


class Bike implements Vehicle
{
	public void speed(){System.out.println("70kmph");}
	public void seats(){System.out.println("2 seater");}
	public void color(){System.out.println("Black");}
}
*/
/*

class Bol
{
	public static void main(String[] args)
	{
		System.out.println("Car Properties");
		Car c=new Car();
		c.speed();
		c.seats();
		c.color();
		System.out.println("***********************************************");
		System.out.println("Bike properties");
		Bike b=new Bike();
		b.speed();
		b.seats();
		b.color();
		
	}
}


interface Vehicle
{
	void speed();
	void seats();
	void color();
}

class Car implements Vehicle
{
	public void speed(){System.out.println("100kmph");}
	public void seats(){System.out.println("5 seater");}
	public void color(){System.out.println("White");}
}


class Bike implements Vehicle
{
	public void speed(){System.out.println("70kmph");}
	public void seats(){System.out.println("2 seater");}
	public void color(){System.out.println("Black");}
}
*/
/*
class Bol
{
	public static void main(String[] args)
	{
		Bike n=new Bike(77);
		n.engine();
		n.seats();
		n.color();
		
		System.out.println("Object passed number is "+n.u);
		
	}
}


interface Vehicle
{
	void seats();
	void color();
}

interface MotorVehicle extends Vehicle

{
	void engine();
}

class Bike implements MotorVehicle
{
	int u;
	Bike(int z)
{
	super();
    this.u=z;
	
	
}
	public void engine(){System.out.println("70kmph");}
	public void seats(){System.out.println("2 seater");}
	public void color(){System.out.println("Black");}
	
	
}
*/

/*
	class Bol
{
	public static void main(String[] args)
	{
		Child c=new Child();
		c.buyCar();
		c.buyHouse();
	}
}

interface Grandpa
{
	void buyHouse();
}

interface Father extends Grandpa
{
	void buyCar();
}

class Child implements Father
{
	public void buyCar()
	{
		System.out.println("Ford");
	}
	
	public void buyHouse()
	{
		System.out.println("2BHK");
	}
}
*/
/*
class Bol
{
	public static void main(String[] args)
	{
		Child c=new Child();
		c.buyCar();
		c.buyHouse();
	}
}

interface Father
{
	void buyHouse();
}

interface Mother
{
	void buyCar();
}

class Child implements Father,Mother
{
	public void buyCar()
	{
		System.out.println("Ford");
	}
	
	public void buyHouse()
	{
		System.out.println("2BHK");
	}
}
*/
/*

class Bol
{
	public static void main(String[] args)
	{
		Child c=new Child();
		c.doDegree();
	}
}

//Multiple inheritance with Interface

interface Father
{
	void doDegree();
}

interface Mother
{
	void doDegree();
}

class Child implements Father,Mother
{
	public void doDegree()
	{
		System.out.println("BBA");
	}
}
*/

/*
class Bol
{
	public static void main(String[] args)
	{
		
		Child c=new Child();
		c.buyHouse();
		c.buyCar();
		c.money();
		
	}
}

interface Father
{
	void buyCar();
}

interface Mother
{
	void buyHouse();
}

class Brother
{
	void money()
	{
		System.out.println("50Lakhs");
	}
}

class Child extends Brother implements Father, Mother
{
	public void buyCar()
	{
		System.out.println("Ford");
	}
	
	public void buyHouse()
	{
		System.out.println("2BHK");
	}
}
*/
/*
//Exception started
class Bol
{
	public static void main(String[] args)
	{
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		//System.out.print("Enter number 1 : ");
		//int a=sc.nextInt();
		
		//System.out.print("Enter number 2 : ");
		//int b=sc.nextInt();
		
		//int c=a/b;
		
		int c=10/0;
		
		
		System.out.println("Result is "+c);
		
		System.out.println("Thank you!!!!!");
		
		
	}
}
*/
/*
class Bol
{
	public static void main(String[] args)
	{
		
		System.out.println("Starts");
		new Bol().m1();
		
		System.out.println("End");
	}
	
	void m1()
	{
		m2();
		System.out.println("am m1()");
	}
	
	void m2()
	{
		m3();
		System.out.println("am m2()");
	}
	
	void m3()
	{
		//Exception object : name + description + line 
		System.out.println(10/1);
	}
}
*/

/*
class Bol
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		
		int a,b,c=0;
		
		a=10;
		b=0;
		
		try
		{
			c=a/b;	
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Bye");
			
		
		System.out.println("Thank you!");
		}
		
		
		System.out.println("Result is "+c);
		
	}
}

*/

/*
//Nested Classes
class Bol
{
	public static void main(String[] args)
	{
		//this type of object is for inner class
		Outer.Inner obj=new Outer.Inner();
		obj.m2();
		//Object creation for outer function
	Outer op=new Outer();
	op.m1();
		
	}
}


//Logical group classes 
//Increase useage of Encapsulation : Nested Class 

class Outer
{
	static int a=10;
	int b=20;
	static private int c=66;
	
	void m1()
	{System.out.println(b);
		System.out.println(a);
		
	}
	
	static class Inner
	{
		int x=99;
		
		void m2()
		{
			System.out.println("inner Method()");
			System.out.println(a);
			System.out.println(new Outer().b);
			System.out.println(c);
		}
	}
}
*/
/*
class Bol
{
	public static void main(String[] args)
	{
		
		//Outer.Inner obj=new Outer.Inner();
		//obj.m2();
		
		Outer obj1=new Outer();
		obj1.m1();
		
		//Another way of creating inner object
		Outer.Inner obj2=obj1.new Inner();
		obj2.m2();
		
	}
}


//Logical group classes 
//Increase useage of Encapsulation : Nested Class 

class Outer
{
	static int a=10;
	int b=20;
	static private int c=66;
	
	void m1()
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	class Inner
	{
		int x=99;
		
		void m2()
		{
			System.out.println("inner Method()");
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
	}
}
*/
/*
import java.io.*;
class Bol
{
	public static void main(String[] args)throws FileNotFoundException
	{
		m1();
	}
	
	public static void m1()throws FileNotFoundException
	{
		m2();
	}
	
	public static void m2()throws FileNotFoundException
	{
		FileReader fr=new FileReader("new.txt");
	}
}
 */
 
 /*
//Unchecked exception : throws

class Bol
{
	public static void main(String[] args)
	{
		m1();
		
		System.out.println("thank you");
	}
	
	public static void m1()
	{
		try
		{
			m2();
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}
	
	public static void m2()
	{
		
		System.out.println(10/0);
		
	}
}
*/
/*
class Bol
{
	public static void main(String[] args)
	{
		Stud s=new Stud(101,"Arun");
		
		System.out.println(s.hashCode());//we get hashcodefor this.
		System.out.println(s.getClass());//Shows from which class the object is created
		System.out.println(s.toString());//showing stud@6D0 something
		
	}
}

class Stud
{
	int rno;
	String name;
	
	Stud(int rno,String name)
	{
		super();
		this.rno=rno;
		this.name=name;
	}
}
*/
/*
class Bol
{
	public static void main(String[] args)
	{
		
		Stud s=new Stud(101,"Arun");
		System.out.println(s);
		System.out.println(s.toString());
		
		byte a[]={10,20,30};
		System.out.println(a);
		
		Thread t=new Thread();
		System.out.println(t);
		
		
		String st=new String("Hai");
		System.out.println(st);
		
		
		java.util.ArrayList al=new java.util.ArrayList();
		al.add(10);
		al.add("Hello");
		al.add(true);
		al.add(6.7);
		System.out.println(al);
		
		
		
	}
}

//className@e232e23
//get the String represntation of Object

class Stud
{
	int rno;
	String name;
	
	Stud()
	{
		super();
	}
	
	Stud(int rno,String name)
	{
		super();
		this.rno=rno;
		this.name=name;
	}
	
	public String toString() 
	{
        return rno+" @ "+name;
    }
}
*/
/*
class Bol     
{
	public static void main(String[] args)
	{
		
		Stud s1=new Stud(101,"Arun");
		System.out.println(s1.hashCode());
		
		Stud s2=new Stud(102,"John");
		System.out.println(s2.hashCode());
		
		Stud s3=new Stud(101,"Arun");
		System.out.println(s3.hashCode());
		
		Stud s4=s2;
		System.out.println(s4.hashCode());       
		
		
	}
}

//every Object in Java unique hashcode will be created JVM 
//Object Memory : NO
//Identification purpose 
//time to time : Machine to Machine varies

//Hashcode generating formula : We dnt knw except String class 

class Stud
{
	int rno;
	String name;
}
*/









