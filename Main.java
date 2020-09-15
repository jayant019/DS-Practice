import java.util.HashSet; // Import the HashSet class
class Main {
  public static void main(String[] args) {
    // System.out.println("Hello world!");
    int [] op = {90,1,3,7,6,8,9};
    // System.out.println(hasPairNormal(op ,11));
    System.out.println(hasPairBetter(op ,97));
  }
public static boolean hasPairNormal(int [] arr, int sum){
  boolean result = false;
 for(int i=0; i<arr.length-1; i++)
 {
    for(int j=i+1; j<arr.length; j++)
 {
   if((arr[i]+arr[j])==sum){
     System.out.println((arr[i]+arr[j]));
     result = true;
   }
 }
 }
 return result;
}

public static boolean hasPairBetter(int [] arr, int sum){
  HashSet <Integer> maps = new HashSet();
  boolean result = false;
 for(int i=0; i<arr.length-1; i++)
 {
   if(maps.contains(arr[i])){
     System.out.println("Present");
     result = true;
   }
   else{
     maps.add(sum-arr[i]);
   }
 }
 return result;
}

}