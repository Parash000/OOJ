class Quadratic{
public static void main(String args[])
{
     Scanner scanner = new Scanner(System.in);
     double a,b,c;
     System.out.println("ENTER THE a , b , c  : ");
     a = scanner.nextDouble();
     b = scanner.nextDouble();
     c = scanner.nextDouble();
     double d = (b*b)-(4*a*c);
     if(d>0){
          double root1 = (-b + Math.sqrt(d))/(2*a);
          double root2 = (-b - Math.sqrt(d))/(2*a);
          System.out.println("the roots are " + " " + root1 + " " + root2);
     }
     else if(d==0){
          double d1 = 2*a;
          double root1 = (-b)/d1;
          System.out.println("the roots is " + " " + root1);
     }
     else{
          double root1 = -b/(2*a);
          double root2 = Math.sqrt(-d)/(2*a);
          System.out.println("The roots are: " + root1 + " + i" + root2);
          System.out.println("The roots are: " + root1 + " - i" + root2);
     }


         
     
}
}