package house.smart.smarthouse.service.impl;

import house.smart.smarthouse.domain.Home;
import house.smart.smarthouse.repository.HomeRepository;
import house.smart.smarthouse.service.CrudService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class HomeServiceImpl implements CrudService<Home> {

    private final HomeRepository repository;

    public HomeServiceImpl(HomeRepository repository) {
        this.repository = repository;
    }

    @Override
    public void save(Home entity) {
        repository.save(entity);
    }

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }

    @Override
    public Home getById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public void update(Home home) {
        repository.save(home);
    }

    @Override
    public List<Home> getAll() {
        return repository.findAll();
    }
}
