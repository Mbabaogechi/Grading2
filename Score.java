import java.util.Scanner;

public class Score {

public static void main (String args[]) {

Scanner scan =new Scanner(System.in);
System.out.println ("Enter a score:");
int x =scan.nextInt();


Grading mygrading =new Grading();

if(x>=70 && x<=100) {mygrading .a (x);}
if(x>=65 && x<=69) {mygrading .b (x);}
if(x>=60 && x<=64) {mygrading .c (x);}
if(x>=55 && x<=59) {mygrading .d (x);}
if(x>=45 && x<=54) {mygrading .e (x);}
if(x>=0 && x<=44) {mygrading .f (x);}
if(x>100 || x<0) {mygrading .invalid (x);}

}



}
