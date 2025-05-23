import java.util.HashMap;

public class Nodefind {
    public static void main(String[] args) {
        int[]arr={1,2,2,3,3,3,4};
        Nodefind n=new Nodefind(arr);
        System.out.println(n.getMode());

        
    }
    private int[]arr;
        private int mode;
            public Nodefind(int[]arr){
                this.arr=arr;
                preprocess();
                
            }
            private void preprocess(){
                HashMap<Integer,Integer>fremap=new HashMap<>();
                int maxfreq=0;
                for(int num:arr){
                    fremap.put(num, fremap.getOrDefault(num, 0)+1);
                    if(fremap.get(num)>maxfreq){
                        maxfreq=fremap.get(num);
                        mode=num;
                    }
                }

            }
            public int getMode(){
                return mode;
            }
    
}
