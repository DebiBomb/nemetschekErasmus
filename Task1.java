package nemetschekErasmus;
public class Task1 {
    public static void main(String[] args){

        System.out.println(Encoded1("AAAAAVVSSA"));
        System.out.println(Encoded2("AAAAAVVSSA"));
        System.out.println(Encoded3("AAAAAVVSSA"));
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

    static public String Encoded3(String toEncoded){

        String toDecoded = "";
        int counter = 1;
        char a = toEncoded.charAt(0);
        char currentLetter;

        for(int i=1; i<toEncoded.length(); i++){
            currentLetter = toEncoded.charAt(i);
            
         
           


            if(currentLetter == a)
                counter++;
            else{

                toDecoded += String.valueOf(counter) + a;
                counter =1 ;
                a = currentLetter;
            }

            System.out.println(currentLetter);
            System.out.println(counter);
            System.out.println(toEncoded.length());
            
               if(i == toEncoded.length()-1){
               System.out.println("sss");
               toDecoded += String.valueOf(counter) +currentLetter ;
          
           }
               
        }

        return toDecoded;
    }
  
}
