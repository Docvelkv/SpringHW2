package docvel.homework2;

import lombok.Data;

@Data
public class Student {

    private static long currentId = 0;
    private final long id;
    private final String name;
    private final String groupName;

    public Student(String name, String groupName) {
        this.id = currentId++;
        this.name = name;
        this.groupName = groupName;
    }
}