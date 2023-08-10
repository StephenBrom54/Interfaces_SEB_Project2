public class Application {
    public static void main(String[] args) {
        Task task1 = new Task("Do laundry", Task.Status.NOT_STARTED, Priority.MIN_PRIORITY);
        Task task2 = new Task("Finish homework", Task.Status.IN_PROGRESS, Priority.MAX_PRIORITY);

        System.out.println("task1: " + task1);
        System.out.println("task2: " + task2);
        System.out.println("task1.compareTo(task2): " + task1.compareTo(task2));

        Process process1 = new Process("chrome.exe", 10.5, 1024, Priority.MED_PRIORITY);
        Process process2 = new Process("explorer.exe", 5.0, 512, Priority.MIN_PRIORITY);

        System.out.println("process1: " + process1);
        System.out.println("process2: " + process2);
        System.out.println("process1.compareTo(process2): " + process1.compareTo(process2));
    }
}
