import java.util.Scanner;
class Main{
	public static void main (String[] args){
       Scanner in=new Scanner (System.in);
      int n=in.nextInt();
      int fact=1,i=1;
      while(i<=n)
      {
        fact=fact*i;
        i++;
      }
      System.out.println(fact);
	}
}