import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class vowel
{
    public static void main(String[] args) throws Exception 
    {
        char n;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the character you want to check:");
        n = (char) bf.read();
switch(n)
{
case 'a':
system.out.println("The given character"+n" is vowel");
break;
case 'e':
system.out.println("The given character"+n" is vowel");
break;
case 'i':
system.out.println("The given character"+n" is vowel");
break;
case 'o':
system.out.println("The given character"+n" is vowel");
break;
case 'u':
system.out.println("The given character"+n" is vowel");
break;
default:
break;
}
}
}


