package house.smart.smarthouse.controller;

import house.smart.smarthouse.domain.User;
import house.smart.smarthouse.service.CrudService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    private final CrudService<User> userService;

    public UserController(CrudService<User> userService) {
        this.userService = userService;
    }

    @PostMapping(value = "/save")
    public void save(@RequestBody User user) {
        userService.save(user);
    }


    @PutMapping(value = "/update")
    public void update(@RequestBody User user) {
        userService.update(user);
    }

    @GetMapping(value = "/get/{id}")
    public User getById(@PathVariable(value = "id") int id) {
        return userService.getById(id);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void deleteById(@PathVariable(value = "id") int id) {
        userService.deleteById(id);
    }

    @GetMapping(value = "/list")
    public List<User> getAll() {
        return userService.getAll();
    }
}
