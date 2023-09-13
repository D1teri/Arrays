
/**
 Author: D1teri or Dima K.
 Version: 1.0.0
 */
public class Arrays
{
    String[] strArray = {"Alpha", "Bravo", "Charlie", "Delta", "Echo"};
    
    public void run(){
        for(int i = 0; i < strArray.length; i++){
            System.out.println(strArray[i]);
        }
        for(String value : strArray){
            System.out.print(value + " ");
        }
        System.out.println(" ");
        for(int i = 0; i < strArray.length; i++){
            System.out.print(strArray[i]);
            if(i < (strArray.length - 1)){
                System.out.print("-");
            }
        }
    }
    public static void main (String[] args){
        Arrays sp = new Arrays();
        sp.run();
    }
}
