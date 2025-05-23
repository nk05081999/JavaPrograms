public class AbstractIntro {
    // By using abstract class
    // By using interface
    public static void main(String[] args) {
        yuvraj y=new yuvraj();
        y.ask();
        y.sleep();
    }
    
}

abstract class Saransh{
    void sleep(){
        System.out.println("I am sleeping");
    }
    abstract void ask();
}
class yuvraj extends Saransh{
    void ask(){
        System.out.println("I am asking");
    }
}