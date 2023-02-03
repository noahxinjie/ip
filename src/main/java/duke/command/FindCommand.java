package duke.command;

import duke.Storage;
import duke.TaskList;
import duke.Ui;
import duke.task.Task;

/**
 * Represents the command to find tasks based on a keyword.
 */
public class FindCommand extends Command {
    private final String keyword;

    public FindCommand(String keyword) {
        this.keyword = keyword;
    }

    /**
     * Searches through tasks to find tasks that contain given keyword.
     * Outputs matching tasks to user via the ui.
     * @param tasks TaskList that contains all the current tasks.
     * @param ui Ui that communicates with the user.
     * @param storage Storage that backups the saving of tasks.
     */
    @Override
    public String execute(TaskList tasks, Ui ui, Storage storage) {
        TaskList matchingTasks = new TaskList();
        for (int i = 0; i < tasks.size(); i++) {
            Task t = tasks.get(i);
            boolean hasKeyword = t.toString().contains(this.keyword);
            if (hasKeyword) {
                matchingTasks.add(t);
            }
        }

        if (matchingTasks.size() > 0) {
            String msg = "I've found the following matching task(s) in your list! \n";
            msg += matchingTasks.print();
            msg += "\n";
            return msg;
        } else {
            return "Oh no, I couldn't find any matching tasks! :( \n";
        }
    }
}