What is a package?
   A package in Java is used to group related classes and interfaces together, providing better modularity and organization.
___________________________________________________________________________________________________________________________________________
How to declare a package?
  package p1;
_____________________________________________________________________________________________________________________________________________

📂 Project Structure
├───bin
│   └───p1
│           App.class
│           student.class
│
└───src
    └───p1
            App.java
            student.java
__________________________________________________________________________________________________________________________________________

📝 Code Files

student.java 
:->
  package p1;
public class student{
	private int id;
	private String name;
	private int age;
	private double[] marks=new double[5];

public student(){

	}

public student(int id, String name , int age){
	this.id=id;
	this.name=name;
	this.age=age;


}

public student(int id, String name , int age,double[]marks){
	this.id=id;
	this.name=name;
	this.age=age;
	this.marks=marks;
	

}

public void setId(int id){
	this.id=id;
}
public void setNmae( String name){
	this.name=name;
}
public void setAge(int age){
	this.age=age;
}
public void setMarks(double marks[]){
	this.marks=marks;
}

public int getId(){ 
 	return id;
 }
public String getName(){ 
 	return name;
 }
 public int getAge(){ 
 	return age;
 }
 public double [] getMarks(){ 
 	return marks;
 }
 public void dispalyStudent(){
 	System.out.print("ID "+id);
 	System.out.print("NAME "+name);
 	System.out.print("AGE "+age);
 	System.out.print("MARKS  "+marks);
 	System.out.print("PHY  CHEM   MATH   BIO  ENG");

 	for(int i=0; i<marks.length;i++)
 		System.out.print(marks[i]+"  ");
 	System.out.println();


 }

}



App.java 
:->

  package p1;
public class App{
	public static void main (String [] args ){
		student stud1= new student(11,"AAA",23);
		double marks[]={55.55,66.66,77.77,88.88,99.99};
		student stud2=new student(12,"BBB",24,marks);
		stud1.dispalyStudent();
		stud2.dispalyStudent();

	}

}
_________________________________________________________________________________________________________________________________________
⚙️ Compilation & Execution

Step 1: Compile

javac -d bin src/p1/App.java src/p1/student.java
  
Step 2: Run

java -cp bin p1.App


  
