public class G13MethodOver {
    public static void main(String[] args) {
        def d=new def();
        d.baatein();
        d.good();
        vinayak v=new vinayak();
        v.baatein();
        v.good();
    }

    
}

class vinayak{
    void baatein(){
        System.out.println("Mein class mein bhut baatein krta hu");
    }
    void good(){
        System.out.println("But I am good person");
    }
}
class def extends vinayak{
    @Override
    void baatein(){
        System.out.println("Mein kabi kabi battein krta hu");
    }
    @Override
    void good(){
        System.out.println("sadfghjk");
    }
}