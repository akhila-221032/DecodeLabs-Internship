import java.util.Scanner;
public class DecodeLabs_java_p2{
    public static void main(String[] args){

        System.out.println("Welcome to  student grade system");
       
        double average;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no of students: ");
        int t=sc.nextInt();
        sc.nextLine();
        for(int j=1;j<=t;j++){
        int i=1;
        int total=0;
        System.out.println("Enter student name: ");
        String name=sc.nextLine();
        System.out.println("Hello " + name + ", check your marks and grade below");
        try{
        System.out.print("Enter no of subjects: ");
        int nsub=sc.nextInt();
        do{
            System.out.print("Enter sub " +i+ " marks(0 to 100): ");
            int smarks=sc.nextInt();
            sc.nextLine();

            if(smarks<0 || smarks>100){
                System.out.println("Invalid marks, please enter marks between 1 to 100");
                i--;

            }
            else{
            total+=smarks;
            }
            i++;

        }while(i<=nsub);

        average= (double)total/nsub;

        System.out.println("Student Marks Report");
        System.out.println("Total Marks:  " + total);
        System.out.printf("Average Marks:%.2f%%  " , average);

        if(average>=90){
            System.out.println(" Your Grade is: A");
        }
        else if(average>=80){
            System.out.println(" Your Grade is: B");
        }
        else if(average>=70){
            System.out.println(" Your Grade is: C");
        }
        else if(average>=60){
            System.out.println(" Your Grade is: D");
        }
        else if(average>=50){
            System.out.println(" Your Grade is: E");
        }
        else{
            System.out.println("  sorry,you are Fail-try next time");
        }
        }
        catch(Exception e){
            System.out.println("Invalid input! Please enter a valid number.");
        }
    }
    System.out.println("Thank you  for visit.");
        sc.close();

    }
}