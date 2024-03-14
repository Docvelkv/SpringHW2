package docvel.homework2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")
public class StdController {

    private final StdRepo repository;

    @Autowired
    public StdController(StdRepo repository) {
        this.repository = repository;
    }

    @GetMapping("{id}")
    public Student getById(@PathVariable long id) {
        return repository.getById(id);
    }

    @GetMapping("search")
    public List<Student> getAllByName(@RequestParam String name) {
        return repository.getAllByName(name);
    }

    @GetMapping()
    public List<Student> getAll() {
        return repository.getAll();
    }

    @GetMapping("group/{group}")
    public List<Student> getByGroup(@PathVariable String group) {
        return repository.getByGroup(group);
    }
}