import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in=new Scanner (System.in);
      int n=in.nextInt();
      int num=n;
      for(int i=1;i<=n;i++){
        for(int j=num;j>=1;j--){
          System.out.print(j);
        }
        num--;
        System.out.println();
      }// Type your code here
	}
}