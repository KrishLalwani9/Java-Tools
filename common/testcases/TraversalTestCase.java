import com.krish.lalwani.util.*;
class TraversalTestCase
{
public static void main(String gg[])
{
KLList<Integer> list=new KLArrayList<>();
list.add(10);
list.add(20);
list.add(30);
list.add(40);
list.add(50);
//list.forEach((e)->{System.out.println(e);});
KLIterator<Integer> iterator=list.iterator();
while(iterator.hasNext())
{
int x=iterator.next();
System.out.println(x);
}
System.out.println("******************************************************************");
KLList<String> list1=new KLLinkedList<>();
list1.add("Goa");
list1.add("London");
list1.add("Kashmer");
list1.add("M.P");
list1.add("Bombay");
list1.forEach((e)->{System.out.println(e);});
}
}
