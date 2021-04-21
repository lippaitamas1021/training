package exam03retake02;

import java.util.ArrayList;
import java.util.List;

public class TodoList {

    private List<Todo> todos = new ArrayList<>();

    public void addTodo(Todo todo) {
        todos.add(todo);
    }

    public List<Todo> getTodos() {
        return todos;
    }

    public int getNumberOfItemsLeft() {
        int counter = 0;
        for (Todo todo : todos) {
            if (todo.getState() == State.NON_COMPLETED) {
                counter++;
            }
        }
        return counter;
    }

    public List<String> getMostImportantTodosText() {
        List<String> result = new ArrayList<>();
        for (Todo todo : todos) {
            if (todo.getPriority() == 1) {
                result.add(todo.getText());
            }
        }
        if (result.isEmpty()) {
            for (Todo todo : todos) {
                if (todo.getPriority() == 2) {
                    result.add(todo.getText());
                }
            }
        }
        return result;
    }

    public void deleteCompleted() {
        todos.removeIf(todo -> todo.getState() == State.COMPLETED);
    }
}
