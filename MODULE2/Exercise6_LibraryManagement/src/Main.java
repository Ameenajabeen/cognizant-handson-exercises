
class Book{String t;Book(String t){this.t=t;}}
public class Main{
public static void main(String[]a){
Book[] b={new Book("C"),new Book("Java"),new Book("Python")};
for(Book x:b)if(x.t.equals("Java"))System.out.println("Found");
}}
