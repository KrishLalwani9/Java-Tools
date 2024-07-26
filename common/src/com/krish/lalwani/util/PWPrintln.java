package com.krish.lalwani.util;
import java.io.*;
public class PWPrintln
{
public static void main(String gg[])
{
try
{
String fileName=gg[0];
File file=new File(fileName);
if(file.exists()==false)
{
System.out.println("File file name : "+fileName+" does not exists.");
return;
}
RandomAccessFile randomAccessFile=new RandomAccessFile(file,"rw");
File tmpFile=new File("tmp.tmp");
if(tmpFile.exists()) tmpFile.delete();
RandomAccessFile tmpRandomAccessFile=new RandomAccessFile(tmpFile,"rw");
String line;
while(randomAccessFile.getFilePointer()<randomAccessFile.length())
{
line=randomAccessFile.readLine();
line=line.replace("\"","\\\"");
tmpRandomAccessFile.writeBytes("pw.println(\""+line+"\");\r\n");
}
randomAccessFile.close();
tmpRandomAccessFile.close();
}catch(Exception exception)
{
System.out.println("Problem : "+exception.getMessage());
}
}
}