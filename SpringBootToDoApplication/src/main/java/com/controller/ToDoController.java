package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Todo;
import com.services.TodoService;

@RestController
@RequestMapping("/todos")
public class ToDoController 
{
	@Autowired
	private TodoService todoService;

	// create todo
	@PostMapping
	public Todo createTodo(@RequestBody Todo todo) 
	{

		// create todo

		return todoService.create(todo);

	}

	// get all todo
	@GetMapping
	public List<Todo> getAll() 
	{
		return todoService.getList();

	}

}
