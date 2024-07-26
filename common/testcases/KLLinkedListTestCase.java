import com.krish.lalwani.util.*;
class KLLinkedListTestCase
{
public static void main(String gg[])
{
KLLinkedList list1=new KLLinkedList();
KLLinkedList list2=new KLLinkedList();
list1.add(1);
list1.add(2);
list1.add(3);
list1.add(4);
list1.add(5);
list1.add(6);
list1.add(7);
list1.add(8);
list1.add(9);
list1.add(10);
list1.add(11);
list1.add(12);
list1.add(13);
list1.add(14);
list1.add(15);
list1.add(16);
list1.add(17);
System.out.println("***********************"+list1.size());
for(int e=0;e<list1.size();e++) System.out.println(list1.get(e));
System.out.println("After inserting");
list1.insert(0,10);
list1.insert(1,11);
list1.add(2,12);
list1.insert(3,13);
list1.insert(6,14);
System.out.println("***********************"+list1.size());
for(int e=0;e<list1.size();e++) System.out.println(list1.get(e));
int x=list1.removeAt(6);
int y=list1.removeAt(0);
int a=list1.removeAt(1);
int b=list1.removeAt(2);
int c=list1.removeAt(3);
System.out.println("***********************"+list1.size());
for(int e=0;e<list1.size();e++) System.out.println(list1.get(e));
System.out.println("***********************"+x);
System.out.println("***********************"+y);
System.out.println("***********************"+a);
System.out.println("***********************"+b);
System.out.println("***********************"+c);
list1.update(0,1000);
list1.update(6,949494);
list2.copyFrom(list1);
System.out.println("***********************"+list2.size());
for(int e=0;e<list2.size();e++) System.out.println(list2.get(e));
}
}