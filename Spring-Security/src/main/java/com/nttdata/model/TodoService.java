package com.nttdata.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class TodoService {
	private static List<Emp_todo> todos = new ArrayList<Emp_todo>();
	private static int todoCount = 3;

	static {
		todos.add(new Emp_todo(1, "vrinda", "machine learning", new Date(),
				false));
		todos.add(new Emp_todo(2, "vrinda", "java", new Date(), false));
		todos.add(new Emp_todo(3, "vrinda", " Hibernate", new Date(),
				false));
		todos.add(new Emp_todo(4, "vrinda", " big data", new Date(),
				false));
		todos.add(new Emp_todo(5, "vrinda", " SQL", new Date(),
				false));
		todos.add(new Emp_todo(6, "vrinda", " Hadoop", new Date(),
				false));
	}

	public List<Emp_todo> retrieveTodos(String user) {
		List<Emp_todo> filteredTodos = new ArrayList<Emp_todo>();
		for (Emp_todo todo : todos) {
			if (todo.getUser().equals(user))
				filteredTodos.add(todo);
		}
		return filteredTodos;
	}

	public Emp_todo retrieveTodo(int id) {
		for (Emp_todo todo : todos) {
			if (todo.getId() == id)
				return todo;
		}
		return null;
	}

	public void updateTodo(Emp_todo todo) {
		todos.remove(todo);
		todos.add(todo);
	}

	public void addTodo(String name, String desc, Date targetDate,
			boolean isDone) {
		todos.add(new Emp_todo(++todoCount, name, desc, targetDate, isDone));
	}

	public void deleteTodo(int id) {
		Iterator<Emp_todo> iterator = todos.iterator();
		while (iterator.hasNext()) {
			Emp_todo todo = iterator.next();
			if (todo.getId() == id) {
				iterator.remove();
			}
		}

	}
}
