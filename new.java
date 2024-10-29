import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {

    // List to store tasks
    private ArrayList<String> tasks;

    public ToDoList() {
        tasks = new ArrayList<>();
    }

    // Method to add a task
    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Task added: " + task);
    }

    // Method to remove a task
    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            System.out.println("Task removed: " + tasks.get(index));
            tasks.remove(index);
        } else {
            System.out.println("Invalid task number.");
        }
    }

    // Method to display tasks
    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Your to-do list is empty.");
        } else {
            System.out.println("Your to-do list:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.print
