package docvel.homework2;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class StdRepo {

    private final List<Student> stds;

    public StdRepo() {
        this.stds = new ArrayList<>();
        stds.add(new Student("studentName Василий", "first"));
        stds.add(new Student("Константин", "first"));
        stds.add(new Student("studentName Николай", "second"));
        stds.add(new Student("Максим", "first"));
        stds.add(new Student("studentName Александр", "second"));
        stds.add(new Student("Геннадий", "second"));
    }

    public List<Student> getAll() {
        return List.copyOf(stds);
    }

    public List<Student> getAllByName(String name) {
        return stds.stream()
                .filter(std -> std.getName().contains(name))
                .collect(Collectors.toList());
    }

    public Student getByName(String name) {
        return stds.stream()
                .filter(std -> std.getName().equals(name))
                .findFirst()
                .orElse(null);
    }

    public Student getById(long id) {
        return stds.stream()
                .filter(std -> std.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public List<Student> getByGroup(String group) {
        return stds.stream()
                .filter(std -> std.getGroupName().equals(group))
                .collect(Collectors.toList());
    }
}
