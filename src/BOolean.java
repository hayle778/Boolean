public class BOolean {
public static void main(String[]args) {
   //int a = 0;
  // boolean b = (a!=0);  // same thing like write as a false
  // System.out.print(b);

  boolean passedDoor = true;
  boolean missedDoor = false;
int doorCount = 0;
   if(passedDoor){
   System.out.println(" : We are in the if statment!");
doorCount = doorCount + 1;
   }
   if(missedDoor){
   System.out.print( " : We passed the second door!" );
  doorCount = doorCount + 1;
   }
if(doorCount ==3){
   passedDoor=true;
}
if(passedDoor){
   System.out.print( "Congratulation you won the program!" );
}
 //  System.out.print(b);




}

}
