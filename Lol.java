/*
import java.util.*;
class Lol
{
	public static void main(String args[])
	{
		//Simple array
		//homogeneous
		/*
		int a[]={12,32,45,67};
		for(int i=0;i<4;i++)
		{
		System.out.println(a[i]);
		}
		*/
		
	//Object get(int index);
	//Object set(int index,Object o);
	//int indexOf(Object o);
	//int lastIndexOf(Object o);
	//ListIterator listIterator();
	/*	
		ArrayList arr=new ArrayList();
	
		arr.add(4);
		arr.add(9);
		arr.add(89);
		arr.add(99);
		arr.add(90);
		
		System.out.println(arr);
        System.out.println(arr.get(2));
		
		
		int g=5;
		 while(g>1)
		 {
			 Scanner scanner=new Scanner(System.in);
			 System.out.print("Enter only integer value");
		 int x=scanner.nextInt();
		 arr.add(x);
		 g=g-1;
		 } 
		 System.out.print(arr);

*/
		 
		/*
		//linkedList
		
	//addFirst(Object o);Best for Inserting and deleting operation
	Not for retrieval/Searching
	//addLast(Object o);
	//getFirst();
	//getLast();
	//removeFirst();
	//removeLast();
	//removeFirstOccurrence();
	//removeLastOccurrence();
		
		
		LinkedList arr=new LinkedList();
		arr.addFirst(1);
		arr.addLast(9);
		System.out.println(arr);
		*/
		
		
		
		//Vector
		//Resizable array -  Growable array
	//Duplicates allowed
	//Insertion order is preserved
	//Heterogenous Data is allowed
	//Implemented RandomAccess, Serilaizable, Cloneable
	//null allowed
	//*****Thread safe(synchronized)************
		//ArrayList is not Thread Safe
	//Vector is Thread Safe
	/*addElement(Object o);					add(Object o)
		removeElement(Object o);				remove(Object o)
		removeElementAt(int index);				remove(3);
		removeAllElements()						clear();
		
		elementAt(6);							get(6);
		firstElement();							getFirst();
		lastElement();							getLast();
		
		System.out.print();;
		setElementAt("John",2);					set(3,"John");
		*/
		
	/*
		
		
		Vector vect=new Vector();
		vect.add(90);
		vect.add("hello");
		vect.add("vignesh");
		vect.add(6);
		System.out.println(vect.get(2));
		vect.setElementAt("Harish",3);//element starts from 0
		System.out.println(vect.firstElement());
		System.out.println(vect.lastElement());
        vect.setElementAt("John",2);//element starts from  0 only
		System.out.println(vect);
		
		Vector lhs=new Vector();
		
		lhs.add(900);
		System.out.println(lhs);
		lhs.removeElementAt(0);
		System.out.println(lhs);
				 
		
		
		
	  */
		// Stack
	//LIFO - Last In First Out
	//Child of Vector class
	//Underlying datastructure is stack.
	
	//Stack s=new Stack();

	//pop();
	//push(Object x);
	//empty()
	//search(Object c);
	//peek();
	/*
		Stack stn=new Stack();
		stn.add(45);
		stn.add(76);
		stn.add(99);
		System.out.println(stn);
		System.out.println(stn.pop());
		System.out.println(stn.indexOf(45));
		stn.push("unary");
		System.out.println(stn.search(45));
		System.out.println(stn.peek());
		stn.add(55);
		stn.push(88);
		System.out.println(stn);//peek just show but does not alter the stack
		System.out.println(stn.peek());
		*/
		//SET
	//SET(I):
 	//All Collection(I) methods are inherited
	//There is No extra methods in SET
	
	//where duplicates are not allowed - insertion order is not preserved
	//then u shuld go for SET
	
	/*
	
		HashSet s=new HashSet();
		s.add(0);
		s.add("ytt");
		s.add(87);
		s.add(00);
		s.add(55);
		s.add(55);//duplicates are not allowed and also insertion order is not preserved
		System.out.println(s);
		*/
     //LinkedHashSet
    //LinkedHashSet(C)(1.4v)
	//Child of HashSet
	//Duplicates are not allowed
	//Insertion order is preserved
	//Underlying datastructure is HashTable + LinkedList
	/*
		LinkedHashSet lhs=new LinkedHashSet();
		
		lhs.add(900);
		lhs.add(90);
		lhs.add(9);
		lhs.add(800);
		lhs.add(99);
		System.out.println(lhs);
		lhs.remove(800);
		System.out.println(lhs.size());
		System.out.println(lhs);
		*/
// Set
/*SortedSet(I):
	Child interface of SET
	we wanted to represent a group of inidv objects as single entity
		where duplicates not allowed
		insertion order is not preserved
		store in some sorting order(Default natural sorting order(ascending) or Our own sorting order)
		then we shuld go for SortedSet
		
		first()
		last()
		headSet(obj);
		tailSet(obj);
		subSet(obj1,obj2);
		Comparator comparator();
	
	Default - Natural sorting order - Ascending order
	We can write our own customizing sorting also

*/
      /* SortedSet(I):
	Child interface of SET
	we wanted to represent a group of inidv objects as single entity
		where duplicates not allowed
		insertion order is not preserved
		store in some sorting order(Default natural sorting order(ascending) or Our own sorting order)
		then we shuld go for SortedSet
		
		first()
		last()
		headSet(obj);
		tailSet(obj);
		subSet(obj1,obj2);
		Comparator comparator();
	
	Default - Natural sorting order - Ascending order
	We can write our own customizing sorting also
	
NavigableSet(I):
	Child of SortedSet
	provides few builin support for different travering methods
	
	lower();
	floor();
	ceiling();
	higher();
	pollFirst();
	pollLast();
	descendingSet();


TreeSet(C)
	Datastructure - Balanced Tree
	Duplicates not allowed
	Insertion order is not preserved (Asc/own-sorting)
	Heterogenous not allowed - RE:CCE
	Homogenous data only allowed
	Null (only once) - RE: NPE 1.7 (not allowing)
	implemnts Serialaizable and clonable
	Sorting order - Default Natural Order, Own customized order
	
		TreeSet t=new TreeSet();			//Asceding
		TreeSet t=new ThreeSet(Comparator c);	//Customized
		TreeSet t=new TreeSet(Collection c);
		TreeSet t=new TreeSet(SortedSet s);
		*/
		//
		/*
		//Anagrams
		import java.util.*;
		class Lol
		{
			public static void main(String [] args)
			{
				Scanner sn =new Scanner(System.in);
				
				while(true)
				{
				System.out.println("Enter the first String");
				String a=sn.nextLine();
				
				System.out.println("Enter the Second String");
				String b=sn.nextLine();
				
			    
			    String str1=a.toLowerCase();
				String str2=b.toLowerCase();
				
				char []arr1=str1.toCharArray();
				char []arr2=str2.toCharArray();
				
				//sorting will happen on unicode basis
				Arrays.sort(arr1);
				Arrays.sort(arr2);
				
				
				if(Arrays.equals(arr1,arr2))
				{
					System.out.println("The given String is a Anagram");
					
				}
			   else
			   {
				   System.out.println("The given String is not a Anagram");
				   
			   }
			   System.out.println("want to terminnate");
			   String o=sn.nextLine();
			   if(o.equals("yes"))
			   {
				   break;
			   }
			   
				}
			}	
			
		}
		*/
		public class Lol
		{
    public static int findMaximum(int[] array) {
       
        int max = array[0];

        
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 8, 6};
        int maxValue = findMaximum(numbers);
        System.out.println("The maximum value in the array is: " + maxValue);  
    }
}

	
