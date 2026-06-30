import java.util.Scanner;

public class scann {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter your name:");
    String name=sc.nextLine();
    System.out.println("your name is"+name);
    System.out.print("enter your age:");
    int age=sc.nextInt();
    System.out.println("your age is"+age);
    System.out.print("are u a hostel:");
    boolean hostel =sc.nextBoolean();
    if (hostel==true){
        System.out.println("s i stay in hotel");

    }
    else{
        System.out.println("i dont stay in hostel");
    }


   } 
}
