
class Employee{int id;String n;Employee(int i,String n){id=i;this.n=n;}}
public class Main{
public static void main(String[]a){
Employee[] e=new Employee[3];
e[0]=new Employee(1,"A");e[1]=new Employee(2,"B");
for(Employee x:e)if(x!=null)System.out.println(x.n);
}}
