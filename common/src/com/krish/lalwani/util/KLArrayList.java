package com.krish.lalwani.util;
public class KLArrayList<T> implements KLList<T>
{
private Object []collection;
private int size;
public KLArrayList()
{
this.collection=new Object[10];
this.size=0;
}
public void forEach(KLListItemAccepter<T> klia)
{
for(int i=0;i<this.size;i++)
{
klia.accept((T)this.collection[i]); //derived class pointer cnnot access or assined pointer of base class
}
}
public class KLArrayListIterator<T> implements KLIterator<T>
{
private int index;
public KLArrayListIterator()
{
this.index=0;
}
public boolean hasNext()
{
return this.index!=KLArrayList.this.size;
}
public T next()  
{
if(this.index==KLArrayList.this.size) throw new InvalidIteratorException("Iterator has no more element");
T d=(T)KLArrayList.this.get(this.index); 
this.index++;
return d;
}
}
public KLIterator<T> iterator()
{
return new KLArrayListIterator<T>();
}
public void add(T data)
{
if(this.size==this.collection.length) 
{
Object tmp[]=new Object[this.size+10];
for(int e=0;e<this.collection.length;e++) tmp[e]=this.collection[e];
this.collection=tmp;
}
this.collection[this.size]=data;
this.size++;
}
public void add(int index,T data)
{
if(index<0 || index>this.size) throw new IndexOutOfBoundsException("Invalid index : "+index);
if(this.size==this.collection.length) 
{
Object tmp[]=new Object[this.size+10];
for(int e=0;e<this.collection.length;e++) tmp[e]=this.collection[e];
this.collection=tmp;
}
for(int e=this.size;e>index;e--) this.collection[e]=this.collection[e-1];
this.collection[index]=data;
this.size++;
}
public void insert(int index,T data)
{
if(index<0 || index>this.size) throw new IndexOutOfBoundsException("Invalid index : "+index);
if(this.size==this.collection.length) 
{
Object tmp[]=new Object[this.size+10];
for(int e=0;e<this.collection.length;e++) tmp[e]=this.collection[e];
this.collection=tmp;
}
for(int e=this.size;e>index;e--) this.collection[e]=this.collection[e-1];
this.collection[index]=data;
this.size++;
}
public void removeAll()
{
this.clear();
}
public void clear()
{
this.size=0;
}
public T removeAt(int index)
{
if(index<0 || index>=this.size) throw new IndexOutOfBoundsException("Invalid index : "+index);
T d=(T)this.collection[index];
for(int e=index;e<=this.size-2;e++) this.collection[e]=this.collection[e+1];
this.size--;
return d;
}
public T get(int index)
{
if(index<0 || index>=this.size) throw new IndexOutOfBoundsException("Invalid index : "+index);
return (T)this.collection[index];
}
public int size()
{
return this.size;
}
public void update(int index,T data)
{
if(index<0 || index>=this.size) throw new IndexOutOfBoundsException("Invalid index : "+index);
this.collection[index]=data;
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