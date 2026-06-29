
public class Main{
static double future(double v,double r,int y){if(y==0)return v;return future(v*(1+r),r,y-1);}
public static void main(String[]a){System.out.println(future(1000,0.1,3));}
}
