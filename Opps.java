/*class Opps
{
	public static void main(String[] args)
	{
		Stud s1=new Stud(100,"Rajesh",9.0);
		System.out.println(s1.rno+" - "+s1.name+" - "+s1.perc);
		
		Stud s2=new Stud(102,"Arun",7.4);
		System.out.println(s2.rno+" - "+s2.name+" - "+s2.perc);
		
		Stud s3=new Stud(103,"Bala",6.4);
		System.out.println(s3.rno+" - "+s3.name+" - "+s3.perc);
		
		Stud s4=new Stud(104,"Raja",5.4);
		System.out.println(s4.rno+" - "+s4.name+" - "+s4.perc);
	}
}

class Stud
{
	int rno;
	String name;
	double perc;
	Stud(int rno,String name,double perc)
	{
	
		this.rno=rno;
		this.name=name;
		this.perc=perc;
	}
}
*/
/*class Opps
{
	public static void main(String[] args)
	{
		Stud s1=new Stud();
		System.out.println(s1.rno+" - "+s1.name+" - "+s1.perc);
		
		Stud s2=new Stud();
		System.out.println(s2.rno+" - "+s2.name+" - "+s2.perc);
	}
}

class Stud
{
	int rno;
	String name;
	double perc;
}
*/
/*
class Opps
{
	public static void main(String[] args)
	{
		Stud s1=new Stud();
		System.out.println(s1.rno+" - "+s1.name+" - "+s1.perc);
		
		Stud s2=new Stud();
		System.out.println(s2.rno+" - "+s2.name+" - "+s2.perc);
	}
}

class Stud
{
	int rno=101;
	String name="John";
	double perc=8.8;
	
}
*/
/*class Opps
{
	public static void main(String[] args)
	{
		Stud s1=new Stud();
		s1.rno=101;
		s1.name="John";
		s1.perc=8.8;
		System.out.println(s1.rno+" - "+s1.name+" - "+s1.perc);
		
		Stud s2=new Stud();
		s2.rno=102;
		s2.name="Arun";
		s2.perc=6.9;
		System.out.println(s2.rno+" - "+s2.name+" - "+s2.perc);
	}
}

class Stud
{
	int rno;
	String name;
	double perc;
}
*/


class Opps
{
	public static void main(String[] args)
	{
		Stud s1=new Stud();
		s1.setDetails(101,"John",8.8);
		
		
		System.out.println(s1.rno+" - "+s1.name+" - "+s1.perc);
		
		Stud s2=new Stud();
		s2.setDetails(102,"Arun",7.4);
		
		System.out.println(s2.rno+" - "+s2.name+" - "+s2.perc);
	}
}

class Stud
{
	int rno;
	String name;
	double perc;
	
	void setDetails(int rno,String name,double perc)
	{
		this.rno=rno;
		this.name=name;
		this.perc=perc;
	}
}

/*class Opps
{
	public static void main(String[] args)
	{
		Stud s1=new Stud(101,"John",8.8);
		System.out.println(s1.rno+" - "+s1.name+" - "+s1.perc);
		
		Stud s2=new Stud(102,"Arun",7.4);
		System.out.println(s2.rno+" - "+s2.name+" - "+s2.perc);
		
		Stud s3=new Stud(103,"Bala",6.4);
		System.out.println(s3.rno+" - "+s3.name+" - "+s3.perc);
		
		Stud s4=new Stud(104,"Raja",5.4);
		System.out.println(s4.rno+" - "+s4.name+" - "+s4.perc);
	}
}

class Stud
{
	int rno;
	String name;
	double perc;
	
	Stud(int rno,String name,double perc)
	{
		this.rno=rno;
		this.name=name;
		this.perc=perc;
	}
}
*/
//con demo.6//

/*
class Opps
{
	public static void main(String[] args)
	{
		Stud s1=new Stud(101,"John",8.8);
		System.out.println(s1.rno+" - "+s1.name+" - "+s1.perc);
		
		Stud s2=new Stud(101,"John",8.8);
		System.out.println(s2.rno+" - "+s2.name+" - "+s2.perc);
		
		Stud s3=new Stud(101,"John",8.8);
		System.out.println(s3.rno+" - "+s3.name+" - "+s3.perc);
		
		Stud s4=new Stud(101,"John",8.8);
		System.out.println(s4.rno+" - "+s4.name+" - "+s4.perc);
	}
}

//compiler writing constructor

class Stud
{
	int rno;
	String name;
	double perc;
	
	Stud(int rno,String name,double perc)
	{
		super();
		this.rno=rno;
		this.name=name;
		this.perc=perc;
	}
}*/
/*
class Opps
{
	public static void main(String[] args)
	{
		Stud s1=new Stud();
		System.out.println(s1.rno+" - "+s1.name+" - "+s1.perc);
		
		Stud s2=new Stud();
		System.out.println(s2.rno+" - "+s2.name+" - "+s2.perc);
		
		Stud s3=new Stud();
		System.out.println(s3.rno+" - "+s3.name+" - "+s3.perc);
		
		Stud s4=new Stud();
		System.out.println(s4.rno+" - "+s4.name+" - "+s4.perc);
	}
}
*/
//compiler writing constructor

/*
class Stud
{
	int rno;
	String name;
	double perc;
	
	Stud()
	{
		super();
		rno=0;
		name=null;
		perc=0.0;
	}
}



class Staff
{
	int sid;
	String name;
	
	Staff()
	{
		super();
	}
}

class Father
{
	int a;
	
	void m1()
	{
		
	}
	
	Father(int a)
	{
		super();
		this.a=a;
	}
}

class Child extends Father
{
	int b;
	
	Child(int b)
	{
		super();
		this.b=b;
	}
}


Child c=new Child(100);
*/














