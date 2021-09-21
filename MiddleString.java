import java.util.Scanner;

public class MiddleString {
 public static void main(String [] args) {
  Scanner scnr = new Scanner(System.in);

  String firstString = "";
  String secondString = "";
  String lastString = "";

  System.out.println("Enter three strings:");
  String str1 = scnr.next();
  String str2 = scnr.next();
  String str3 = scnr.next();


  if(str1.compareTo(str2) > 0 && str1.compareTo(str3) > 0){
    firstString = str1;
  }
  else if (str1.compareTo(str2) < 0 && str2.compareTo(str3) > 0){
    secondString = str1;
  }
  else{
    lastString = str1;
  }

  if (str2.compareTo(str1) > 0 && str2.compareTo(str3) > 0){
    firstString = str2;
  }
  else if (str2.compareTo(str1) < 0 && str2.compareTo(str3) > 0){
    firstString = str3;
  }
  else{
    lastString = str2; 
  }
  if(str3.compareTo(str2) > 0 && str3.compareTo(str1) > 0){
    firstString = str3;
  }
  else if(str3.compareTo(str2) < 0 && str3.compareTo(str1) > 0){
    secondString = str3;
  }
  else {
    lastString = str3;
  }
  System.out.println("The second string in lexiographic order is: " + firstString);


 }
}