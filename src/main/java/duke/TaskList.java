package duke;

import java.util.ArrayList;

import duke.task.Task;

/**
 * Encapsulates the list of tasks user has inputted.
 */
public class TaskList {
    private ArrayList<Task> tasks;

    public TaskList(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    public TaskList() {
        this.tasks = new ArrayList<>();
    }

    public void add(Task t) {
        this.tasks.add(t);
    }

    public void remove(int index) {
        this.tasks.remove(index);
    }

    public Task get(int index) {
        return this.tasks.get(index);
    }

    public int size() {
        return this.tasks.size();
    }

    public ArrayList<Task> getTasks() {
        return this.tasks;
    }

    /**
     * Prints out all the tasks in the list by numbering them in order.
     * @return printed tasks for the list command to show to user
     */
    public String print() {
        StringBuilder msg = new StringBuilder();
        for (int i = 0; i < tasks.size(); i++) {
            msg.append(String.format("%d. " + tasks.get(i) + "\n", i + 1));
        }
        return String.valueOf(msg);
    }
}
