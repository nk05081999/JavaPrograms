public class G13Inherit2 {
    public static void main(String[] args) {
        java12 j=new java12();
        j.speak();
        j.ask();
        j.sleep();
        j.run();
        j.speak();
        j.ask();
        j.sleep();
        j.run();
        j.speak();
        j.ask();
        j.sleep();
        j.run();
        
        
      
    }
    
}
class Java123{
    // sun.font"hi
    void run(){
        System.out.println("hi");
    }
    void sleep(){
        System.out.println("sleep");
    }
    void ask(){
        System.out.println("askinbg");
    }
}


class java12 extends Java123{
    void speak(){
        System.out.println("speaking");
    }

}