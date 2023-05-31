package com.jsp.datastructure;


public class LinkedList {
	private Node first;
	private Node last;
	private Node curr;
	private int count=0;
	public void add(Object e)
	{
		if(first==null)
		{
			first = new Node(e,null);
			count++;
			return;
		}
		last=first;
//		last.next=new Node(e,last);
		while(last.next!=null)
		{
			last=last.next;
		}
		 	last.next=new Node(e,null);
		count++;
	}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
	public void add(int index,Object e)
	{
		if(index==0)
		{
			first=new Node(e,first);
			count++;
		}
		curr=first;
		for(int i=1;i<index;i++)
		{
			curr=curr.next;
		}
		curr.next=new Node(e,curr.next);
		count++;
	}
	public void remove(int index)
	{
		if(index==0)
		{
			first=first.next;
			count--;
		}
		curr=first;
		for(int i=1;i<index;i++)
		{
			curr=curr.next;
		}
		curr.next=curr.next.next;
		if(index==size()-1)
		{
			last=first;
		}
		count--;
	}
	
	
	public Object get(int index)
	{
		curr=first;
		
		for(int i=1;i<index;i++)
		{
			curr=curr.next;
		}
		return curr.ele;
	}
	public int size()
	{
		return count;
	}
	public void clear()
	{
		
		first=null;
		last=null;
		count=0;
		
	}
}
