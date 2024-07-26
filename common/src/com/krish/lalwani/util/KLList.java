package com.krish.lalwani.util;
public interface KLList<T> 
{
public void add(T data);
public void add(int index,T data);
public void insert(int index,T data);

public void removeAll();
public void clear();
public T removeAt(int index);

public T get(int index);
public int size();

public void update(int index,T data);

public void forEach(KLListItemAccepter<T> klia);

public KLIterator<T> iterator();

public void copyTo(KLList<T> other);
public void copyFrom(KLList<T> other);

public void appendTo(KLList<T> other);
public void appendFrom(KLList<T> other);
}