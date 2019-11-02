package house.smart.smarthouse.controller;

import house.smart.smarthouse.domain.Home;
import house.smart.smarthouse.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "home")
public class HomeController {

    private final CrudService<Home> service;

    public HomeController(@Qualifier("homeServiceImpl") CrudService<Home> service) {
        this.service = service;
    }

    @PostMapping(value = "/save")
    public void save(@RequestBody Home home) {
        service.save(home);
    }

    @PutMapping(value = "/update")
    public void update(@RequestBody Home home) {
        service.update(home);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void deleteById(@PathVariable(value = "id") int id) {
        service.deleteById(id);
    }

    @GetMapping(value = "/get/{id}")
    public Home getById(@PathVariable(value = "id") int id) {
        return service.getById(id);
    }

    @GetMapping(value = "/list")
    public List<Home> homeList() {
        return service.getAll();
    }
}
