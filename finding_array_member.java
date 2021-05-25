import java.util.Scanner ;
public class finding_array_member {
 public static void main(String[] args) throws Exception {

     Scanner input = new Scanner(System.in);
     System.out.println("how many members the array has ?");int n = input.nextInt();//getting the numbmer of array members
     int[] a = new int[n];//defining the array
     for(int i = 0 ; i<a.length ; i++){
         a[i]=input.nextInt();}
     System.out.println("what number wanna find ?");int m= input.nextInt();// defining the number we wanna find in the array
      array(a,m);// calling the method
     }
 static void array(int[] b , int j){
     int a = 0;
     for(int i=0 ; i<b.length;i++){
         if(b[i]==j){//if it finde the number(j) in any array's home it tell us
             System.out.println(j+" is on " +i+"th of array's home");
             a = 1;
            }
        else;
        }
        if(a!=1){
             System.out.print("nothing found");//if not ...
        }
   
    
    
    }
}
