package javaproject;

// Inheritance
class MusicalInstrument {
	   int weight;
	   String tradeMark;

	   public MusicalInstrument(int weight, String tradeMark) {
	       this.weight = weight;
	       this.tradeMark = tradeMark;
	   }

	   public void work() {
	       System.out.println("the instrument is playing...");
	   }
	}

 class Violin extends MusicalInstrument {
	   String master;
	   String owner;
	   int age;
	   boolean isTuned;

	   public Violin(int weight, String tradeMark, String master, String owner, int age, boolean isTuned) {
	       super(weight, tradeMark);
	       this.master = master;
	       this.owner = owner;
	       this.age = age;
	       this.isTuned = isTuned;
	   }

	   @Override
	   public void work() {
	       System.out.println("THe violin's playing");

	   }

	   public void violinTuning () {
	     System.out.println("I'm tuning 1st string...");
	     System.out.println("I'm tuning 2nd string...");
	     System.out.println("I'm tuning 3rd string...");
	     System.out.println("I'm tuning 4th string...");
	   }


	   }


//Encapsulation 
class student{
	private int Student_Id;
    private String name;
    public int getId() {
        return Student_Id;
    }
    public void setId(int s_id) {
        this.Student_Id = s_id;
    }
    public String getname() {
        return name;
    }
    public void setname(String s_name) {
        this.name = s_name;
    }
}
// Abstraction
interface DrawShapes {
    //abstract method    
    void draw();
}

 abstract class oops implements DrawShapes {
//	 implementing the abstract method    
	    public void draw() {
	        System.out.println("Rectangle will be drawn");

	    }
	}
 class Circle implements DrawShapes {
     //implementing the abstract method   
    public void draw() {
        System.out.println("Circle will be drawn");

    }
 
 public static void main(String[] args) {
	 
	 DrawShapes shape = new Circle();
	 System.out.println("Java abstraction");
	 shape.draw();
	 
	//create an object of Student class
     student s=new student();
     //set fields values using setter methods
     System.out.println("Java Encapsulation");
     s.setId (27);
     s.setname("Priyanka Salvi");
     //print values using getter methods        
     System.out.println("Student Data:" + "\nStudent ID:" + s.getId()
                         + " Student Name:" + s.getname());

	 System.out.println("Java Inheritance");
     Violin violin = new Violin(1, null, "Amati", "Kremer", 285, false);
     violin.violinTuning();
     violin.work();
     
    
 
 
 }

 }
 



