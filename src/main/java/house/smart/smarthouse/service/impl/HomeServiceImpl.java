package house.smart.smarthouse.service.impl;

import house.smart.smarthouse.domain.Home;
import house.smart.smarthouse.repository.HomeRepository;
import house.smart.smarthouse.service.CrudService;
import org.springframework.stereotype.Service;


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
        return repository.getOne(id);
    }
}
