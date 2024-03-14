package docvel.homework2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StdController {

    private final StdRepo repository;

    @Autowired
    public StdController(StdRepo repository) {
        this.repository = repository;
    }

    @GetMapping("student/{id}")
    public Student getById(@PathVariable long id) {
        return repository.getById(id);
    }

    @GetMapping("student/search")
    public List<Student> getAllByName(@RequestParam String name) {
        return repository.getAllByName(name);
    }

    @GetMapping("student")
    public List<Student> getAll() {
        return repository.getAll();
    }

    @GetMapping("group/{group}/student")
    public List<Student> getByGroup(@PathVariable String group) {
        return repository.getByGroup(group);
    }
}

