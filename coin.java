import java.util.*;
class coin
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 int amnt=sc.nextInt();
 int c=0;
 int n=sc.nextInt();
 int n1[]=new int[n];
 for(int i=0;i<n;i++)
  n1[i]=sc.nextInt();
 Arrays.sort(n1);
 for(int i=n1.length-1;i>=0;i--)
 {
  c=c+amnt/n1[i];
  amnt=amnt%n1[i];
 }
 System.out.println(c);
 }
 }
