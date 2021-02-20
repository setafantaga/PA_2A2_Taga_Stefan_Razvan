import java.util.*;
import java.io.*;
public class Hello_world {

	public static void main(String[] args) throws IOException{
        System.out.println("Hello world\n");
        
        String[] language= {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};
        
        int n = (int) (Math.random() * 1_000_000);
        int a= n*3;
        int b=a+10101;
        int c=b*6;
        
        System.out.println(n);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

}
