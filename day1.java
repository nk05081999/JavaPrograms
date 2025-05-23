import java.util.Scanner;

public class day1 {
    // What is Java ?
    // java is high level programming langauge.

    // High Level Programming Language:

    // is a programming language that is designed to be easy for humans to read write and
    // understand
    // It uses natural elements
    // enter first number
    // enter second number

    // History of java ?
    // 1991.......1995 jdk 1.0 james gosling and his team sun microsystems which was 
    // owened
    // by oracle

    // Features of java:
    // jdk,jvm,jre:



    // System.out.println("Hello world");
    public static int fHcf(int a,int b){
        while (b!=0) {
            int tem=b;
            b=a%b;
            a=tem;
            
        }
        return a;
    }
    public static void main(String[] args) {
        // int a=10;
        // int b=20;
        // int c=a+b;
        // System.out.println(c);
        int num1=24;
        int num2=36;
        int hcf=fHcf(num1, num2);
        System.out.println(hcf);


        System.out.println("------------------");
        Scanner sc =new Scanner(System.in);
        System.out.println("Hey buddy ..Enter your Age: ");
        int age=sc.nextInt();
        if(age>18){
            System.out.println("This Age Verification round is clear ..You have to Go for further Verifications");

        }else{
            System.out.println("You are not selected");
        }
    }
    
}
