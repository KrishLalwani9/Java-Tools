package com.krish.lalwani.util;
import java.io.*;
public class Keyboard
{
BufferedReader bufferedReader;
public Keyboard()
{
bufferedReader=new BufferedReader(new InputStreamReader(System.in));
}
//this is String    method
public String getString()
{
String str;
try
{
str=bufferedReader.readLine();
}catch(IOException io)
{
str="";
}
return str;
}

public String getString(String message)
{
System.out.print(message);
return getString();
}

//This is char     method
public char getCharacter()
{
return getString().charAt(0);
}
public char getCharacter(String message)
{
System.out.print(message);
return getCharacter();
}
//This is float method
public float getFloat()
{
float f;
try
{
f=Float.parseFloat(getString());
}catch(NumberFormatException nfe)
{
f=0;
}
return f;
}

public float getFloat(String message)
{
float f;
System.out.print(message);
return getFloat();
}
//This is long method
public long getLong()
{
long x;
try
{
x=Long.parseLong(getString());
}catch(NumberFormatException nfe)
{
x=0;
}
return x;
}

public long getLong(String message)
{
System.out.print(message);
return getLong();
}
//This is short method

public short getShort()
{
short x;
try
{
x=Short.parseShort(getString());
}catch(NumberFormatException nfe)
{
x=0;
}
return x;
}
public short getShort(String message)
{
System.out.print(message);
return getShort();
}
//This is byte method
public byte getByte()
{
byte x;
try
{
x=Byte.parseByte(getString());
}catch(NumberFormatException nfe)
{
x=0;
}
return x;
}

public byte getByte(String message)
{
System.out.print(message);
return getByte();
}
//This is double    method
public double getDouble()
{
double d;
try
{
d=Double.parseDouble(getString());
}catch(NumberFormatException nfe)
{
d=0;
}
return d;
}

public double getDouble(String g)
{
System.out.print(g);
return getDouble();
}



//This is int    method
public int getInt()
{
int x=0;
try
{
x=Integer.parseInt(getString());
}catch(NumberFormatException nfe)
{
x=0;
}
return x;
}
public int getInt(String message)
{
System.out.print(message);
return getInt();
}

public boolean getBoolean()
{
boolean x;
try
{
x=Boolean.parseBoolean(getString());
}catch(NumberFormatException nfe)
{
x=false;
}
return x;
}
public boolean getBoolean(String message)
{
System.out.print(message);
return getBoolean();
}

}