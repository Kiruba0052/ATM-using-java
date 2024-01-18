import java.util.*;
class atm
{
static int a;
public atm(){
System.out.println("Welcome"); 
}
public atm(int a){
this.a=a;
}
public atm(int amt,char b){
if(b=='d'){
this.a=this.a+amt;
System.out.println("you have deposited:"+amt);
}
else if(b=='w'){
this.a=this.a-amt;
System.out.println("you have withdrawn:"+amt);
}
}
public atm(char s){
System.out.println("balance is:"+this.a); 
}
}
public class pro_atm{
static int n,p=0;
static atm d;
static void op(){
System.out.println("1.Check Balance\n2.Deposit\n3.Withdraw\n4.Exit");
Scanner in=new Scanner(System.in);
n=in.nextInt();
if(n==1){
d=new atm('h');
op();
}
else if(n==2){
System.out.println("Enter the amount to deposit:");
p=in.nextInt();
d=new atm(p,'d');
op();
}
else if(n==3){
System.out.println("Enter the amount to withdraw:");
p=in.nextInt();
d=new atm(p,'w');
op();
}
else{
System.exit(0);
}
}
public static void main(String args[])
{
atm d;
Scanner in=new Scanner(System.in);
System.out.print("\nEnter Principle Amount  : ");
p=in.nextInt();
System.out.print("Your Principle Amount is : "+p);
d=new atm(p);
op();
}
}