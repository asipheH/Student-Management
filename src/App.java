import java.util.ArrayList;
import java.util.Scanner;
 
public class App {
   
 
 
    public static void main(String[] args) {
       
        ArrayList<String> students = new ArrayList<String>();
       
        int option = 0;
       
        do {
           
            System.out.println("\n_________Welcome, Please choose an option below_____________\n");
            System.out.println("1. Register a student.");
            System.out.println("2. View all registered students.");
            System.out.println("3. Deregister a student.");
            System.out.println("4. Exit the program");
           
            Scanner scanner = new Scanner(System.in);
            Scanner scanner2 = new Scanner(System.in);
            //Scanner scanner3 = new Scanner(System.in);
           
            try {
                option =  scanner.nextInt();
               
                switch (option) {
                case 1: {
                   
                    System.out.println("\nPlease enter the name of the student you want to register\n");
                    String student = scanner2.nextLine();
                    students.add(student);
                    System.out.println("\nThe student was successfully registered!\n");
                   
                    break;
                }
               
                case 2: {
                   
                    if(students.isEmpty()) {
                        System.out.println("\nThere are currently no students enrolled, please register a student.\n");
                    }
                    else {
                        System.out.println("\n_____List of registered students______\n");
                        for(int i = 0; i < students.size(); i++) {
                            System.out.printf("%d. %s\n",i+1,students.get(i));
                        }
                    }
                   
                   
                    break;
                }
               
                /*case 3: {
                   
                    if(students.isEmpty()) {
                        System.out.println("\nThere are currently no students enrolled, please register a student.\n");
                    }
                   
                    else {
                        System.out.println("\n_____Choose the student that you want to deregister by index______\n");
                        for(int i = 0; i < students.size(); i++) {
                            System.out.printf("%d. %s\n",i+1,students.get(i));
                        }
 
                       
                       
                        int studentNum =  scanner3.nextInt();
                        if(studentNum-1 < students.size()){
 
                            students.remove(studentNum-1);
                        System.out.println("\nThe student was successfully deregistered!\n");
 
                        }else{
 
                            System.out.println("Please enter valid student");
                            option = 3;
                        }
 
 
                       
                    }
                   
                   
                    break;
                }
               
                case 4: {
                    option = 4;
                    scanner.close();
                    scanner2.close();
                    scanner3.close();
                    System.out.println("\nGoodbye......");
                    break;
                }*/
                default:
                    System.out.println("\nPlease choose a correct option.\n");
                }
            }
            catch(Exception e) {
                System.out.println("\nAn error occcurred, please try again: \n");
            }
           
           
           
        }
        while(option != 4);
   
       
    }
}
 
 
 
 