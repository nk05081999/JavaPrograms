public class Validdig {
    public static void main(String[] args) {
        String Cn="1234|5678|9101";
        int sum=0;
        for(char ch:Cn.toCharArray()){
            if(Character.isDigit(ch)){
                sum+=ch-'0';
            }
        }
        while (sum>=10) {
            int nsum=0;
            while (sum>0) {
                nsum+=sum%10;
                sum/=10;
                
            }
            // return nsum
            sum=nsum;
            
        }
        if(sum<=7){
            System.out.println("valid");
        }else{
            System.out.println("not valid");
        }
    }
    
}
