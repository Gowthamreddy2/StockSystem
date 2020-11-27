import java.io.*;
import java.util.*;
public class menu
{
 BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
 void main(String a,int amt)throws IOException
 {
 System.out.println("\u000C");
 System.out.println("
Welcome "+a);
 System.out.println();
 System.out.println("------------------------------------------------------------------------
HOME PAGE-------------------------------------------------------------------------------------------
");
 System.out.println();
 int ch;
 System.out.println("1. Buy shares");
 System.out.println("2. Check Balance amount");
 System.out.println("3. Logout");
 System.out.println("4. Exit");
 ch=Integer.parseInt(in.readLine());
 switch(ch)
 {
 case 1:
 {
 try
 {
 buy(a,amt);
 }
 catch(IOException e)
 {
 }
 }
 break;
 case 2:
 {
 System.out.println("The balance amount is: "+amt);
 System.out.println();
 System.out.println("Back to home page? (click enter)");
 char c=(char)(in.read());
 try
 {
 main(a,amt);
 }
 catch(IOException e)
 {
 }

 break;
 }

 case 3:
 {
 System.out.println("Back to login page? (y/n)");
 char c=(char)(in.read());
 if(c=='y')
 {
 try
 {
 login obj=new login();
 System.out.println("\u000C");
 obj.main();
 }
 catch(IOException e)
 {
 }
 }
 else
 {
 try
 {
 main(a,amt);
 }
 catch(IOException e)
 {
 }
 }
 break;
 }
 default:
 System.out.println("Wrong choice! choose 1,2,3 or 4");
 case 4:
 {
 System.out.println("Are you sure you want to quit? (y/n)");
 char c=(char)(in.read());
 if(c=='y')
 {
 System.out.println("\u000C");
 System.exit(0);
 }
 else
 {
 try
 {
 main(a,amt);
 }
 catch(IOException e)
 {
 }
 }
 break;
 }
 
 }
 }
 void buy(String a,int amt)throws IOException
 {
 System.out.println("\u000C");
 System.out.println("------------------------------------------------------------------------
SHARES PAGE------------------------------------------------------------------------------------------
-");
 System.out.println();
 System.out.println();
 int z;
 System.out.println("1. Adidas share");
 System.out.println("2. Nike share");
 System.out.println("3. Back to home page");
 System.out.println("4. Logout");
 z=Integer.parseInt(in.readLine());
 switch(z)
 {
 case 1:
 {
 Random r1=new Random();
 int c1=r1.nextInt(2000)+1800;
 int q1=r1.nextInt(30)+60;
 System.out.println("\u000C");
 System.out.println("ADIDAS PAGE");
 System.out.println();
 System.out.println();
 System.out.println("Market value per share right now: Rs."+c1+" /-");
 System.out.println("No of shares available right now: "+q1);
 System.out.println();
 System.out.println();
 System.out.println("1. Buy shares");
 System.out.println("Other. Go back");
 int y=Integer.parseInt(in.readLine());
 if(y==1)
 {
 System.out.print("How many shares would you want to buy? ");
 for(;;)
 {
 int x= Integer.parseInt(in.readLine());
 int w;
 if(x>q1)
 {
 System.out.println("\u000C");
 System.out.print("Amount of stocks requested are not
availabe.Re-enter a lesser amount or quit:(1/0) ");
 w=Integer.parseInt(in.readLine());
 if(w==1)
 {
 continue;
 }
 else
 {
 try
 {
 buy(a,amt);
 }
 catch(IOException e)
 {
 }
 }

 }
 else if(x*c1>amt)
 {
 System.out.println("\u000C");
 System.out.print("Insufficient funds.Re-enter a lesser amount
or quit:(1/0) ");
 w=Integer.parseInt(in.readLine());
 if(w==1)
 {
 continue;
 }
 else
 {
 try
 {
 buy(a,amt);
 }
 catch(IOException e)
 {
 }
 }
 }
 else
 {
 System.out.println(x+" shares of adidas purchased!");
 amt-=x*c1;
 System.out.println();
 System.out.println("The new balance is "+amt);
 System.out.println();
 System.out.println("Press enter");
 char c=(char)(in.read());
 try
 {
 main(a,amt);
 }
 catch(IOException e)
 {
 }
 }
 }
 }
 else
 {
 try
 {
 main(a,amt);
 }
 catch(IOException e)
 {
 }
 }
 }
 break;
 case 2:
 {
 Random r2=new Random();
 int c2=r2.nextInt(3000)+2800;
 int q2=r2.nextInt(60)+60;
 System.out.println("\u000C");
 System.out.println("NIKE PAGE");
 System.out.println();
 System.out.println();
 System.out.println("Market value per share right now: Rs."+c2+" /-");
 System.out.println("No of shares available right now: "+q2);
 System.out.println();
 System.out.println();
 System.out.println("1. Buy shares");
 System.out.println("Other. Go back");
 int y=Integer.parseInt(in.readLine());
 if(y==1)
 {
 System.out.print("How many shares would you want to buy? ");
 for(;;)
 {
 int x= Integer.parseInt(in.readLine());
 int w;
 if(x>q2)
 {
 System.out.println("\u000C");
 System.out.print("Amount of stocks requested are not
availabe.Re-enter a lesser amount or quit:(1/0) ");
 w=Integer.parseInt(in.readLine());
 if(w==1)
 {
 continue;
 }
 else
 {
 try
 {
 buy(a,amt);
 }
 catch(IOException e)
 {
 }
 }

 }
 else if(x*c2>amt)
 {
 System.out.println("\u000C");
 System.out.print("Insufficient funds.Re-enter a lesser amount
or quit:(1/0) ");
 w=Integer.parseInt(in.readLine());
 if(w==1)
 {
 continue;
 }
 else
 {
 try
 {
 buy(a,amt);
 }
 catch(IOException e)
 {
 }
 }
 }
 else
 {
 System.out.println(x+" shares of nike purchased!");
 amt-=x*c2;
 System.out.println();
 System.out.println("The new balance is "+amt);
 System.out.println();
 System.out.println("Press enter");
 char c=(char)(in.read());
 try
 {
 main(a,amt);
 }
 catch(IOException e)
 {
 }
 }
 }
 }
 else
 {
 try
 {
 main(a,amt);
 }
 catch(IOException e)
 {
 }
 }
 }
 break;
 case 3:
 {
 System.out.println("Back to home page? (y/n)");
 char c=(char)(in.read());
 if(c=='y')
 {
 try
 {
 main(a,amt);
 }
 catch(IOException e)
 {
 }
 }
 else
 {
 try
 {
 buy(a,amt);
 }
 catch(IOException e)
 {
 }
 }
 }
 break;
 default:
 System.out.println("Wrong choice! choose 1,2,3 or 4!");
 case 4:
 {
 System.out.println("Back to login page? (y/n)");
 char c=(char)(in.read());
 if(c=='y')
 {
 try
 {
 login obj=new login();
 System.out.println("\u000C");
 obj.main();
 }
 catch(IOException e)
 {
 }
 }
 else
 {
 try
 {
 buy(a,amt);
 }
 catch(IOException e)
 {
 }
 }
 }
 break;
 }
 }
}
