import com.krish.lalwani.util.*;
class KeyboardTestCase
{
public static void main(String gg[])
{
Keyboard k=new Keyboard();
String a;
a=k.getString("Enter a string : ");
char b;
b=k.getCharacter("Enter a character : ");
long c;
c=k.getLong("Enter a long type character : ");
boolean d;
d=k.getBoolean("Enter a boolean type character : ");
int e;
e=k.getInt("Enter a int : ");
float f;
f=k.getFloat("Enter a float : ");
double g;
g=k.getDouble("Enter a double : ");
System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(d);
System.out.println(e);
System.out.println(f);
System.out.println(g);
}
}