import java.io.*;
import java.util.*;
public class login
{
 void check(String a,String b)
 {
 String[] user={"GOWTHAM"};
 String[] password={"donald"};
 int flag=0;
 for(int i=0;i<7;i++)
 {
 if(user[i].equals(a))
 {
 flag=1;
 if(password[i].equals(b))
 {
 menu obj=new menu();
 try
 {
 Random r=new Random();
 int amt=r.nextInt(6000000)+10000000;
 obj.main(user[i],amt);
 }
 catch(IOException e)
 {
 }
 }
 else
 {
 System.out.println("\u000C");
 System.out.println("Wrong combination!");
 System.out.println();
 try
 {
 main();
 }
 catch(IOException e)
 {
 }
 }
 }

 }
 if(flag==0)
 {
 System.out.println("\u000C");
 System.out.println("Username does not exist!");
 System.out.println();
 try
 {
 main();
 }
 catch(IOException e)
 {
 }
 }
 }
 void main()throws IOException
 {
 BufferedReader in=new BufferedReader(new
InputStreamReader(System.in));
 String user,pass;
 System.out.println("------------------------------------------------------------------------
LOGIN PAGE-------------------------------------------------------------------------------------------
");
 System.out.println();
 System.out.println();
 System.out.println();
 System.out.print("Enter your username: ");
 user=in.readLine();
 System.out.print("Enter your password: ");
 pass=in.readLine();
 check(user,pass);
 }
}
