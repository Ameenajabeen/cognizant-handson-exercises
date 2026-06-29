
class Node{int id;Node next;Node(int i){id=i;}}
public class Main{
public static void main(String[]a){
Node h=new Node(1);h.next=new Node(2);for(Node c=h;c!=null;c=c.next)System.out.println(c.id);
}}
