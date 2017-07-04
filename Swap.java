# Swap
import java.io.*;
import java.util.*;
public class Swap
{
public static void main(String args[])
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a string");
String a=" ";
StringBuilder c=new StringBuilder();
char [] ch=a.toCharArray();
for(int i=0;i<ch.length;i++)
{
if(i%2==0)
{
if((i+1)<ch.length)
{
c.Append(ch[i+1]);
}
c.Append(ch[i]);
}
}
}
}
