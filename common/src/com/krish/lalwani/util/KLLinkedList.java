package com.krish.lalwani.util;
public class KLLinkedList<T> implements KLList<T>
{
public class KLNode<T>
{
T data;
KLNode<T> next;
KLNode()
{
data=null;
next=null;
}
}
public KLNode<T> start,end;
public int size;
public KLLinkedList()
{
this.start=this.end=null;
this.size=0;
}
public void forEach(KLListItemAccepter<T> klia)
{
for(KLNode<T> n=this.start;n!=null;n=n.next)
{
klia.accept(n.data);
}
}
public class KLLinkedListIterator<T> implements KLIterator<T>
{
KLNode<T> ptr;
KLLinkedListIterator(KLNode<T> ptr)
{
this.ptr=ptr;
}
public boolean hasNext()
{
return this.ptr!=null;
}
public T next()
{
if(this.ptr==null) throw new InvalidIteratorException("Iterator has no more elements");
T data=this.ptr.data; //understand
this.ptr=this.ptr.next;
return data;
}
}
public KLIterator<T> iterator()
{
return new KLLinkedListIterator<T>(this.start);
}
public void add(T data)
{
KLNode<T> t=new KLNode<T>();
t.data=data;
if(this.start==null) this.start=this.end=t;
else 
{
this.end.next=t;
this.end=t;
}
this.size++;
}
public void add(int index,T data)
{
if(index<0 || index>this.size) throw new IndexOutOfBoundsException("Invalid index : "+index);
KLNode<T> j=new KLNode<T>();
j.data=data;
KLNode<T> t=this.start;
KLNode k=t;
if(t==null)
{
this.start=this.end=j;
this.size++;
return;
}
for(int e=0;e<index;e++) 
{
k=t;
t=t.next;
}
if(t==this.start)
{
j.next=this.start;
this.start=j;
}else
if(t==this.end)
{
this.end.next=j;
this.end=j;
}
else
{
k.next=j;
j.next=t;
}
this.size++;
}
public void insert(int index,T data)
{
if(index<0 || index>this.size) throw new IndexOutOfBoundsException("Invalid index : "+index);
KLNode<T> j=new KLNode<T>();
j.data=data;
KLNode<T> t=this.start;
KLNode<T> k=t;
if(t==null)
{
this.start=this.end=j;
this.size++;
return;
}
for(int e=0;e<index;e++) 
{
k=t;
t=t.next;
}
if(t==this.start)
{
j.next=this.start;
this.start=j;
}else
if(t==this.end)
{
this.end.next=j;
this.end=j;
}
else
{
k.next=j;
j.next=t;
}
this.size++;
}
public void removeAll()
{
this.clear();
}
public void clear()
{
this.start=this.end=null;
this.size=0;
}
public T removeAt(int index)
{
if(index<0 || index>=this.size) throw new IndexOutOfBoundsException("Invalid index : "+index);
KLNode<T> t,j;
j=null;
t=this.start;
for(int e=0;e<index;e++)
{
j=t;
t=t.next;
}
T d=t.data;
if(t==this.start && t==this.end) 
{
this.start=this.end=null;
}else
if(t==this.start)
{
this.start=this.start.next;
}else
if(t==this.end)
{
j.next=t.next;
this.end=j;
}
else
{
j.next=t.next;
}
this.size--;
return d; 
}
public T get(int index)
{
if(index<0 || index>=this.size) throw new IndexOutOfBoundsException("Invalid index : "+index);
KLNode<T> t=this.start;;
for(int e=0;e<index;e++) t=t.next;
return t.data;
}
public int size()
{
return this.size;
}
public void update(int index,T data)
{
if(index<0 || index>=this.size) throw new IndexOutOfBoundsException("Invalid index : "+index);
KLNode<T> t=this.start;
for(int e=0;e<index;e++)
{
t=t.next;
}
t.data=data;
}
public void copyTo(KLList<T> other)
{
other.clear();
for(int e=0;e<this.size;e++) other.add(this.get(e));
}
public void copyFrom(KLList<T> other)
{
this.clear();
for(int e=0;e<other.size();e++) this.add(other.get(e));
}
public void appendTo(KLList<T> other)
{
for(int e=0;e<this.size;e++) other.add(this.get(e));
}
public void appendFrom(KLList<T> other)
{
for(int e=0;e<other.size();e++) this.add(other.get(e));
}
}