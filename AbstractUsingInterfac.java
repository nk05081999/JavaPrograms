public class AbstractUsingInterfac {
    public static void main(String[] args) {
        RDF r=new RDF();
        r.sleep();
        r.ask();
    }
    
}
 interface  DEF {

public void sleep();
public abstract void ask();

    
}

class RDF implements DEF{
  public  void sleep(){
        System.out.println("Sleeoing");
    }
   public  void ask(){
        System.out.println("asking");
    }

}
