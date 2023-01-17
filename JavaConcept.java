package javaproject;
// method overridding
class XIAddmission {
	 // overriden method
	 public int getFee() {
	   int baseFee = 10000;
	   return baseFee;
	 }
	}
	class Science extends XIAddmission {
	  // overriding method
	 public int getFee() {
	   int extraFee = 5000;
	   return super.getFee() + extraFee;
	 }
	}
	 
	class Commerce extends XIAddmission {
	  // overriding method
	 public int getFee() {
	   int extraFee = 2500;
	   return super.getFee() + extraFee;
	 }
	}
	 
	class Humanities extends XIAddmission {
	  // overriding method
	 public int getFee() {
	   int extraFee = 2000;
	   return super.getFee() + extraFee;
	 }
	}

//method overloading
class DisplayOverloading
{
  //adding two integer numbers
  int add(int a, int b)
  {
    int sum = a+b;
    return sum;
  }
  //adding three integer numbers
  int add(int a, int b, int c)
  {
    int sum = a+b+c;
    return sum;
  }
}

//polymorphism
class StaticPoly 
{ 
void sum(int x, int y) 
{ 
  int s = x + y; 
  System.out.println("Sum of two numbers: " +s); 
} 
void sum(int x, int y, int z) 
{ 
 int s = x + y + z; 
 System.out.println("Sum of three numbers: " +s); 
} 

public class JavaConcept  {
	
	
	public static void main(String[] args) {
	
		int sum = 0;
	    int n = 1000;

	    // for loop
	    for (int i = 1; i <= n; ++i) {
	      // body inside for loop
	      sum += i;     // sum = sum + i
	    }
	    System.out.println("For loop"); 
	    System.out.println("sum of natural numbers from 1 to 1000 = " + sum);
	    
//	    nested for loop
	    System.out.println("Nested For Loop");
	    for(int i=1;i<=5;i++){  
	    	for(int j=1;j<=i;j++){  
	    	        System.out.print("* ");  
	    	}  
	    	System.out.println();

	}
	    
//	    While loop
	    System.out.println("while loop");
	    int i = 10;
		while(i>=1) {
			System.out.println(i);
			i--;
		}
		
//		do while loop
		
		System.out.println("Do while loop");
		int j = 2;
		
		do {
			System.out.println(j);
			j+=2;
		}
		while(j<=10);
		
//		if-else statement
		
		int checkingNumber=13;  
		System.out.println("If-Else condition");
	    //Check if the number is divisible by 2 or not  

	    if(checkingNumber%2==0){  

	        System.out.println(checkingNumber+" is even number");  

	    }else{  

	        System.out.println(checkingNumber+" is odd number");  

	    }  
	    
//	    if-else-if ladder statement
	    
	    System.out.println("If-Else-If Ladder condition");
	    
	    int internalMarks=65;  

	    if(internalMarks<50) 

	    { 
	    	System.out.println("fail");
	    }  

	    else if(internalMarks>=50 && internalMarks<60) 
	    {  
	        System.out.println("C grade");  
	    }  

	    else if(internalMarks>=60 && internalMarks<70)
	    {  
	        System.out.println("B grade");  
	    }  

	    else 
	    {
	    System.out.println("A grade"); 
	    }
	    
//	    switch statement
	    
	    System.out.println("Switch statement");
	    
	    int day=5;
		
		switch(day)
		{
		case 1: System.out.println("Sunday");
		break;
		
		case 2: System.out.println("Monday");
		break;
		
		case 3: System.out.println("Tuesday");
		break;
		
		case 4: System.out.println("Wednesday");
		break;
		
		case 5: System.out.println("Thrusday");
		break;
		
		case 6: System.out.println("Friday");
		break;
		
		case 7: System.out.println("Saturday");
		break;
		
		default: System.out.println("Invalid week number");
		
		}
	    
		 System.out.println("Java polymorphism");
	     StaticPoly obj = new StaticPoly(); 
	     obj.sum(20, 10); 
	     obj.sum(10, 20, 30);
	     
	     System.out.println("method overloading");
	     DisplayOverloading obj1 = new DisplayOverloading();
	     System.out.println(obj1.add(10, 20));
	     System.out.println(obj1.add(10, 20, 30));
	     
	     System.out.println("method overrriding");
	     
	    	 Science s1 = new Science();
	    	 Commerce s2 = new Commerce();
	    	 Humanities s3 = new Humanities();
	    	 System.out.println("Fee for Science stream: Rs."+ s1.getFee());
	    	 System.out.println("Fee for Commerce stream: Rs."+ s2.getFee());
	    	 System.out.println("Fee for Humanities stream: Rs."+ s3.getFee());

	     
	}
}
}
