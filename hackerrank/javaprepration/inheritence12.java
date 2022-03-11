package javaprepration;

import java.util.Scanner;
/*
public class inheritence12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
    }
    
}
class Person {
    protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
    void printPerson(){
        System.out.println("Name: "+firstName+", "+lastName);
        System.out.println("ID: "+idNumber);
    }
}
class Student extends Person{
    super(firstName,lastName,id);
	private int[] testScores;
    private String firstName;
    private String lastName;
    private int id;
    Student(String firstNamee, String lastNamee, int id, int[] testScorees){
        this.firstName=firstNamee;
        this.lastName=lastNamee;
        this.id=id;
        this.testScores=testScorees;
    }
  
    /*	
    *   Class Constructor
    
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here

    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
//     char calculate(){
//         int sum=0;
        
//         for(int i=0; i<testScores.length; i++){
//             sum=sum+testScores[i];
//         }
//         double average=sum/testScores.length;
//         if(90<=average&&average<=100){
//             return 'O';
//         }
//         if(80<=average&&average<90){
//             return 'E';
//         }
        
//         if(70<=average&&average<80){
//             return 'A';
//         }
//         if(55<=average&&average<70){
//             return 'P';
//         }
//         if(40<=average&&average<55){
//             return 'D';
//         }
//         else{
//             return 'T';
//         }

//     }
//     // Write your method here
// }

