
class Order{int id;double price;Order(int i,double p){id=i;price=p;}}
public class Main{
static void bubble(Order[]a){for(int i=0;i<a.length-1;i++)for(int j=0;j<a.length-i-1;j++)if(a[j].price>a[j+1].price){Order t=a[j];a[j]=a[j+1];a[j+1]=t;}}
static void quick(Order[]a,int l,int h){if(l<h){double p=a[h].price;int i=l-1;for(int j=l;j<h;j++)if(a[j].price<p){i++;Order t=a[i];a[i]=a[j];a[j]=t;}Order t=a[i+1];a[i+1]=a[h];a[h]=t;int pi=i+1;quick(a,l,pi-1);quick(a,pi+1,h);}}
public static void main(String[]x){Order[]o={new Order(1,300),new Order(2,100),new Order(3,200)};bubble(o);for(Order i:o)System.out.print(i.price+" ");}}
