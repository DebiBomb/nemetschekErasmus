package nemetschekErasmus;
public class Task1 {
    public static void main(String[] args){

        System.out.println(Encoded(""));
    }

    static public String Encoded(String toEncoded){
        
        String toDecoded = "";
        int n=1;

        for(int i=toEncoded.length()-1; i>0; i--){
            if(toEncoded.charAt(i) == toEncoded.charAt(i-1)){
                n++;
            }else{
                toDecoded += String.valueOf(n) + toEncoded.charAt(i);
                n=1;
            }
        }
        return toDecoded;
    }
  
}
