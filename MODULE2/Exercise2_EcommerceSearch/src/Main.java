
class Product{int id;String name;Product(int i,String n){id=i;name=n;}}
public class Main{
static int linear(Product[]p,String k){for(int i=0;i<p.length;i++)if(p[i].name.equals(k))return i;return -1;}
static int binary(Product[]p,String k){int l=0,r=p.length-1;while(l<=r){int m=(l+r)/2;int c=p[m].name.compareTo(k);if(c==0)return m; if(c<0)l=m+1;else r=m-1;}return -1;}
public static void main(String[]a){Product[] p={new Product(1,"Bag"),new Product(2,"Book"),new Product(3,"Pen")};System.out.println(linear(p,"Book"));System.out.println(binary(p,"Pen"));}}
