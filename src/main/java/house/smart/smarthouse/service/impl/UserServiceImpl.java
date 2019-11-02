package house.smart.smarthouse.service.impl;

import house.smart.smarthouse.domain.User;
import house.smart.smarthouse.repository.UserRepository;
import house.smart.smarthouse.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements CrudService<User> {

    @Autowired
    private UserRepository repository;

    @Override
    public List<User> getAll() {
        return repository.findAll();
    }

    @Override
    public void save(User user) {
        repository.save(user);
    }

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }

    @Override
    public User getById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public void update(User user) {
        repository.save(user);
    }
}
