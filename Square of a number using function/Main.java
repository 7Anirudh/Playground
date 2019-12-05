import java.util.Scanner;
class Main
{
  public static int area(int a)
  {
    int b=a*a;
    return b;
  }
	public static void main (String[] args)
    {
	Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int f=area(n);
      System.out.print(f);
	} 
}