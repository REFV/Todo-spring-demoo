package comm.example.service;

import comm.example.model.Todo;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface TodoService {

        public List<Todo> getTodos();

    public void updateTodo(Todo todo);

    public void addTodo(String name, String desc, Date targetDate, boolean isDone);

    publuc void deleteTodo(long id);

   public void saveTodo(Todo todo);


}

}
