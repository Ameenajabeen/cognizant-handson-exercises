
import java.util.*;
class Product{int id,qty;String name;double price;Product(int i,String n,int q,double p){id=i;name=n;qty=q;price=p;}}
public class Main{
public static void main(String[]a){
HashMap<Integer,Product> m=new HashMap<>();
m.put(1,new Product(1,"Pen",10,20));
m.put(2,new Product(2,"Book",5,50));
m.get(2).qty=8;
m.remove(1);
System.out.println("Products:"+m.size());
}}