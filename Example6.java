package javaFile;
//parameterized constructor in java 
import java.util.Scanner;
public class Example6 {
    Example6(){
        System.out.println("Default constructor called");
    }
    Example6(String name,int rno,float per){
        this(); // ye current class ke constructur ko call kar lega class ka object bnane ke jarurat nhe pade gi
       name=name;   //this represent current class data mumber
       rno = rno;
       per = per;
       System.out.println("name is :" +name);
       System.out.println("Roolnumber is:" +rno);
       System.out.println("percentage is :" +per);     
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Roolnumber:");
        int Roolnumber = sc.nextInt();
        sc.nextLine();    //rolnumber likhne ke bad nextline me chla gya or apne ap ko tarminate kar dega gisse age ki chege prient nhe hogi isko rokne ke leye sc.nextline()lekha
        System.out.println("Enter name :");
        String name = sc.nextLine();   //ager 1 world get karna hy to next lekhe ge  but agar fullName ya ek line get karna hy to nextLine lekhe ge
        
        System.out.println("Enter persentage");
        float persentage = sc.nextFloat();

   Example6 obj = new Example6(name,Roolnumber,persentage);
  // Example6 obj1 = new Example6();
    }
}
// second example
// import java.util.Scanner;
// public class Example6 {
//     String name ;
//     int rno ;
//     float per ;
//     Example6(String name,int rno,float per){
//        this.name=name;   //this represent current class data mumber
//        this.rno = rno;
//        this.per = per;
         
//     }
//     void display(){
//         System.out.println("name is :"+name);
//         System.out.println("Roolnumber is"+rno);
//         System.out.println("percentage is :" +per);
//     } 
//     public static void main(String args[]){
//         Scanner sc = new Scanner (System.in);
//         System.out.println("Enter name :");
//         String name = sc.nextLine();
//         System.out.println("Enter Roolnumber:");
//         int Roolnumber = sc.nextInt();
//         System.out.println("Enter persentage");
//         float persentage = sc.nextFloat();

//    Example6 obj = new Example6(name,Roolnumber,persentage);
//    obj.display();

//     }
// }
