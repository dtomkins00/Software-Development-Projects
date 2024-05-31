package lab4;

public class Person {
	
	/**
	 * @author Drew Tomkins
	 * @date 1st November 2018
	 */
	
	//Declare fields
	private String name;
    private int age;
    
    //Constructor is below for the name and age fields
    public Person(String myName, int myAge)
    {
    	name = myName;
    	age = myAge;
    }
    
    //Methods are below
    public int getAge()
    {
    return age;
    }
    
    public String getName()
    {
    return name;
    }
    
    public void setAge(int newAge)
    {
     age = newAge;
    }
    
    public void printNameDetails()
    {
     System.out.println("The name of this person is " + getName());
    }
    
    public void printAgeDetails()
    {
     System.out.println("The age of this person is " + getAge());
    }
    
    //Prints out details for the class.
    public static void main( String[] args ){ 
    	Person p=new Person("Eliza", 66); 
    	p.printNameDetails();
    	p.printAgeDetails();
    	}
    
}

