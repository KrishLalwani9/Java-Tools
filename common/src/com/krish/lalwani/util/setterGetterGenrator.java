package com.krish.lalwani.util;
import java.io.*;
import java.lang.reflect.*;
import java.util.*;
public class setterGetterGenrator
{
public static void main(String gg[])
{
if(gg.length!=1 && gg.length!=2)
{
System.out.println("usage : java classpath path_to_jar_file;. com.krish.lalwani.util.setterGetterGenrator class_name constructor=true/false");
return;
}
if(gg.length==2 && gg[1].equalsIgnoreCase("constructor=true")==false && gg[1].equalsIgnoreCase("constructor=false")==false)
{
System.out.println("usage : java classpath path_to_jar_file;. com.krish.lalwani.util.setterGetterGenrator class_name constructor=true/false");
return;
}
String class_name=gg[0];
try
{
Class c=Class.forName(class_name);
Field fields[]=c.getDeclaredFields();
Field field;
String line;
String setterName;
String getterName;
String fieldName;
Class fieldType;
String tmp;
KLList<String> list=new KLArrayList<String>();
if(gg.length==1 || (gg.length==2 && gg[1].equalsIgnoreCase("constructor=true")))
{
line="public "+c.getSimpleName()+"()";
list.add(line);
list.add("{");
for(int e=0;e<fields.length;e++)
{
field=fields[e];
fieldName=field.getName();
line="this."+fieldName+"="+getDefaultValue(fields[e].getType())+";";
list.add(line);
}
list.add("}");
}
for(int e=0;e<fields.length;e++)
{
field=fields[e];
fieldName=field.getName();
fieldType=field.getType();
if(fieldName.charAt(0)>=97 && fieldName.charAt(0)<=122)
{
tmp=fieldName.substring(0,1).toUpperCase()+fieldName.substring(1);
}
else
{
tmp=fieldName;
}
setterName="set"+tmp;
getterName="get"+tmp;
line="public void "+setterName+"("+fieldType.getName()+" "+fieldName+")";
list.add(line);
list.add("{");
line="this."+fieldName+"="+fieldName+";";
list.add(line);
list.add("}");
line="public "+fieldType.getName()+" "+getterName+"()";
list.add(line);
list.add("{");
line="return this."+fieldName+";";
list.add(line);
list.add("}");
}
File file=new File("tmp.tmp");
if(file.exists()) file.delete();
RandomAccessFile randomAccessFile=new RandomAccessFile(file,"rw");
list.forEach((k)->{
try
{
randomAccessFile.writeBytes(k+"\r\n");
}catch(IOException ioException)
{
System.out.println(ioException.getMessage());
}
});
randomAccessFile.close();
System.out.println("setters/getters for : "+c.getName()+" is genrated in file tmp.tmp");
}catch(IOException ioException)
{
System.out.println(ioException.getMessage());
}
catch(ClassNotFoundException cnfe)
{
System.out.println("Class : "+cnfe.getMessage()+" not exist");
}
}
public final static String getDefaultValue(Class c)
{
String fieldName=c.getName();
if(fieldName.equals("java.lang.Long") || fieldName.equals("long")) return "0";
if(fieldName.equals("java.lang.Integer") || fieldName.equals("int")) return "0";
if(fieldName.equals("java.lang.Short") || fieldName.equals("short")) return "0";
if(fieldName.equals("java.lang.Byte") || fieldName.equals("byte")) return "0";
if(fieldName.equals("java.lang.Double") || fieldName.equals("double")) return "0.0";
if(fieldName.equals("java.lang.Float") || fieldName.equals("float")) return "0.0f";
if(fieldName.equals("java.lang.Character") || fieldName.equals("char")) return "' '";
if(fieldName.equals("java.lang.Boolean") || fieldName.equals("boolean")) return "false";
if(fieldName.equals("java.lang.String") || fieldName.equals("String")) return "\"\""; //Seperatness khatam krne ke liye
return "null";
}
}