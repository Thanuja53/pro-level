import java.util.*; 
public class pro01
{
 public static void main(String args[])
 Scanner sc=new Scanner(System.in);
int v=sc.nextInt();
int j;
String s[]=new String[v];
for(j=0;j<v;j++)
 {
s[j]=sc.next();
}
String c=" ",ch;
 if(s.length>0) 
c=s[0];
 for(int i=1;i<s.length;i++)
 {
 ch=s[i];
 for(j=0;j<Math.min(c.length(),s[i].length());j++)
 {
 if(c.charAt(j)!=ch.charAt(j))
 break;
 }
 c=s[i].substring(0,j);
 } System.out.println("Longest prefix is:"+c);
}
}
