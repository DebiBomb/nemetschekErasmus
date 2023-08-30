package nemetschekErasmus;
public class Task1 {
    public static void main(String[] args){

        System.out.println(Encoded1("VVRBRB"));
        System.out.println(Encoded2("VVRBRB"));
    }

    static public String Encoded1(String toEncoded){
        
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

    static public String Encoded2(String toEncoded){
        
        String toDecoded = "";
        int n=1;

        for(int i=0; i<toEncoded.length()-1; i++){
            if(toEncoded.charAt(i) == toEncoded.charAt(i+1)){
                n++;
            }else{
                toDecoded += String.valueOf(n) + toEncoded.charAt(i);
                n=1;
            }
        }
        return toDecoded;
    }
  
}
