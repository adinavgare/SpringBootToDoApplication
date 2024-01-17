package com.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.model.Todo;

@Service
public class TodoService 
{
	private List<Todo> list = new ArrayList<>();
	
	public Todo create(Todo todo)
	{
		list.add(todo);
		return todo;
				
	}
	
	public List<Todo> getList()
	{
		return list;
	}
	

}
