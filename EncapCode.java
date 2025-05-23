public class EncapCode {
    public static void main(String[] args) {
        G13 g=new G13();
        // g.
        g.setId(1);
        g.setName("Java");
        g.setPhNumber(12345567l);
        System.out.println("My id is "+g.getId());
        System.out.println("My name is "+g.getName());
        System.out.println("My Phone Number is "+g.getPhNumber());
    }
    
}
class G13{
    private int id;
   private  String Name;
    public int getId() {
    return id;
}
public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        Name = name;
    }
    public void setPhNumber(Long phNumber) {
        PhNumber = phNumber;
    }
public String getName() {
    return Name;
}
public Long getPhNumber() {
    return PhNumber;
}
    private Long PhNumber;

}