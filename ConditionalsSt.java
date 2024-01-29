import java.util.*;
public class ConditionalsSt {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
    // if-else

    int age = 22; 
    if(age >= 18){
        System.out.println("Adult");
    }
    if( age <= 18 && age >= 0 ){
        System.out.println(" Child");
    }
    if( age >= 13 && age <= 18){
        System.out.println("Teenager");
    }

    // LArgest number among 2 numbers

    System.out.println(" Enter the first number");
    int A= sc.nextInt();
    System.out.println(" Enter the second number");
    int B= sc.nextInt();
    if(A >= B){
        System.out.println("Largest num is " +A);
    }
    else{
        System.out.println("Largset num is" + B);
    }

    // Num is even or odd
    
    System.out.println("Enter the number");
    int num = sc.nextInt();
    if( num%2 == 0){

        System.out.println(" Number is Even " + num);
    }else{
        System.out.println(" Not even Number");
    }

    // else- if if once above condition comes true then it doesn't check next else-if condition takes less time to give output

    int Age = 12; 
    if(Age >= 18){
        System.out.println("Adult");
    }
    if( Age <= 18 && Age >= 0 ){
        System.out.println(" Child");
    }
    if( Age >= 13 && Age <= 18){
        System.out.println("Teenager");
    }

    // Income tax Calculator

    System.out.println(" Enter your income");
    int income = sc.nextInt();
    int tax = 0 ;

    if (income <= 500000 && income > 0){
        tax = 0;
    } else if (income >= 500000 && income <= 1000000){
         tax = (int) ((income) * 0.2);
    } else if (income >= 3000000 ){
          tax = (int) ((income)* 0.3);
    }else {
        System.out.println(" Wrong income entered ");
    }
    System.out.println(" Amount of tax needed to pay " + tax);

    // Greatest among three numbers

    System.out.println(" Enter first number");
    int a = sc.nextInt();
    System.out.println(" Enter second number");
    int b = sc.nextInt();
    System.out.println(" Enter third number");
    int c = sc.nextInt();

    if (a >= b && a>=c){
        System.out.println(a + " is greatest");
     }
    else if(b >= c ){
        System.out.println(b + " is greatest");
    }else {
        System.out.println(c + " is greatest");
    }

    // Ternary Operator 
    
    System.out.println(" Enter the number");
    int num1 = sc.nextInt();

    String type = (num1% 2== 0)? "Even" : "Odd";
    System.out.println(type);


    // Student Passes or Fails 

    System.out.println(" Enter the marks");
    int marks = sc.nextInt();
    String result = (marks >= 33 && marks <=100) ? "Pass" : "Fail";
    System.out.println(result);

    // Switch Statement 

    System.out.println(" Enter the number");
    int num2 = sc.nextInt();

    switch (num2){
        case 1 : System.out.println("Bangkok");
                  break;
        case 2 : System.out.println("Egypt");
                  break;   
        case 3 : System.out.println("Historical places of whole wrorld");
                  break;  
        default : System.out.println(" You are the only one who can make it possible");
    }

    // Calculator 

    System.out.println(" Enter the number ");
    int  p = sc.nextInt();
    System.out.println(" Enter the operator +, - , * , /, % ");
    char operator = sc.next().charAt(0);
    System.out.println(" Enter the second number");
    int q = sc.nextInt();

    switch (operator){
        case '+' : System.out.println(p+q);
                   break;
        case '-' : System.out.println(p-q);
                   break;
        case '*' : System.out.println(p*q);
                   break;
        case '/' : System.out.println(p/q);
                   break;
        case '%' : System.out.println(p%q);
                   break;
        default : System.out.println(" Invalid operator");
                   break;           

              
                   

    }









}



}