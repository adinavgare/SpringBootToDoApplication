package com.model;

public class Todo 
{
	
	private int id;
	private String content;
	
	public Todo() 
	{
		super();
		
	}

	public Todo(int id, String content) 
	{
		super();
		this.id = id;
		this.content = content;
	}

	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public String getContent() 
	{
		return content;
	}

	public void setContent(String content) 
	{
		this.content = content;
	}

	@Override
	public String toString() 
	{
		return "Todo [id=" + id + ", content=" + content + "]";
	}
	

}//end class
