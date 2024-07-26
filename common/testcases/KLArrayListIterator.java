import com.krish.lalwani.util.*;
class KLArrayListIteratorTestCase
{
public static void main(String gg[])
{
KLArrayList list1,list2;
list1=new KLArrayList();
list1.add(100);
list1.add(200);
list1.add(300);
list1.add(400);
list1.add(4,500);
System.out.println(list1.get(1));
System.out.println("Iterating from list1");
KLIterator iterator;
iterator=list1.iterator();
while(iterator.hasNext())
{
int data=iterator.next();
System.out.println(data);
}
}
}