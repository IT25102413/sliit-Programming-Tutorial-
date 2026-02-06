import java.util.Scanner;

public class Calculator {

 public static int add (int a,int b){
	int sum = a+b;
 return sum;
 }
 public static int multiply(int c,int d ){
	 int multi= c*d;
	 return multi;
 }
 public static int square(int e){
	 int sqr = e*e;
	 return sqr;
 }
 public static void main(String []args){
	 int Q1= square ( add ( multiply(3,4), multiply(5,7)));
	 int Q2 = add ( square ( add(4,7)), square ( add(8,3)));
	 System.out.println(" (3 ∗4+5∗7)^2 =" + Q1);
	 System.out.println("(4 +7)^2 +(8+3)^2 =" + Q2);
 }
}