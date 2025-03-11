package javaFile;

import java.util.Scanner;
class demo{
    int rno;
    String name,address;

    //pairamiterize coustractore
    demo(int rno, String name,String address){
        this.rno = rno;
        this.name = name;
        this.address = address;
    }
    //copy coustructore
    demo(demo object){
        this.rno =object.rno;
        this.name = object.name;
        this.address = object.address;
    }
    
   void display(){
    System.out.println("RollNumber is:"+rno);
    System.out.println("Name is:"+name);
    System.out.println("Your address is:"+address);
    }
}
class coustructore{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter name");
        String name = sc.nextLine();
        System.out.println("Enter rollNumber");
        int rno = sc.nextInt();
        sc.nextLine(); 
        System.out.println("Enter Address");
        String address = sc.nextLine();

        demo obj = new demo(rno, name, address);
        obj.display();
        demo obj1 = new demo(obj);
        System.out.println("After Copying:");
        obj1.display();
    }
}