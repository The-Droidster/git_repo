/* Program to calculate the factorial of a user input number */

package javacourse;

import java.io.*; 

class Factorial{
  public static void main(String[] args) {
  try{
  BufferedReader object = new BufferedReader(
  new InputStreamReader(System.in));
  System.out.println("Enter the number:");
  int a= Integer.parseInt(object.readLine());
  double fact= 1;
  System.out.println("Factorial of " +a+ ":");
  for (int i= 1; i<=a; i++){  					//loop to calculate a!
  fact=fact*i;
  }
  System.out.println(fact);
  }
  catch (Exception e){
  System.out.println("Array out of bounds exaception");
  }
  }
}