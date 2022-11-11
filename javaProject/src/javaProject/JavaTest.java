package javaProject;
public class JavaTest{
public int add(int a, int b){
int c= a+b;
return c;
}
public int substract(int a, int b){
int c= a-b;
return c;
}
public int multiply(int a, int b){
int c= a*b;
return c;
}
public int divide(int a, int b){
int c= a/b;
return c;
}
public static void main(String[] args) throws Exception {
// Declare variables
int a= 10;
int b= 5;
//create instance of JavaDemo class
JavaTest jdemo= new JavaTest ();
int addresult=jdemo.add(a,b);   // invoke add method of JavaDemo
int substractresult=jdemo. substract (a,b);   // invoke substract method of JavaDemo
int multiplyresult=jdemo.multiply(a,b);   // invoke multiply method of JavaDemo
int divideresult=jdemo.divide(a,b);   // invoke divide method of JavaDemo
System.out.println("Addition of 10 and 5 is " + addresult );
System.out.println("Subtraction of 10 and 5 is " + substractresult );
System.out.println("Multiplication of 10 and 5 is " + multiplyresult );
System.out.println("Division of 10 and 5 is "+ divideresult );
}
}

