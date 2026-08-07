import java.io.*;
class File1
{
	public static void main(String [] args) throws Exception
	{
		BufferedReader br=new BufferedReader(new FileReader("list1.txt"));
		String line;
		while((line=br.readLine())!=null)
		{
			System.out.println(line);
		}
		
		FileWriter
	}
}


import java.io.*;
import java.util.*;

class Task {
    String name;
    String status;
    int priority;

    Task(String name, String status, int priority) {
        this.name = name;
        this.status = status;
        this.priority = priority;
    }

    public String toString() {
        return name + " | " + status + " | " + priority;
    }
}

public class Main {

    // Validate format
    public static boolean isValid(String line) {
        String parts[] = line.split("\\|");

        if (parts.length != 3)
            return false;

        String name = parts[0].trim();
        String status = parts[1].trim();
        String priority = parts[2].trim();

        if (name.isEmpty())
            return false;

        if (!(status.equals("PENDING") || status.equals("DONE")))
            return false;

        try {
            Integer.parseInt(priority);
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("todo.txt"));
        List<Task> list = new ArrayList<>();

        String line;

        // Read file
        while ((line = br.readLine()) != null) {

            // Validate
            if (!isValid(line)) {
                System.out.println("Invalid format: " + line);
                continue;
            }

            String parts[] = line.split("\\|");

            String name = parts[0].trim();
            String status = parts[1].trim();
            int priority = Integer.parseInt(parts[2].trim());

            // Modify status (example: mark all PENDING as DONE)
            if (status.equals("PENDING")) {
                status = "DONE";
            }

            list.add(new Task(name, status, priority));
        }

        br.close();

        // Manual sorting (by priority)
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).priority > list.get(j).priority) {
                    Task temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }

        // Print sorted tasks
        System.out.println("\nSorted Tasks:");
        for (Task t : list) {
            System.out.println(t);
        }

        // Write back to file (optional)
        BufferedWriter bw = new BufferedWriter(new FileWriter("updated_todo.txt"));
        for (Task t : list) {
            bw.write(t.toString());
            bw.newLine();
        }
        bw.close();

        System.out.println("\nUpdated file written successfully!");
    }
}			