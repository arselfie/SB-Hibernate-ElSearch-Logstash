package house.smart.smarthouse.service;

import house.smart.smarthouse.domain.User;

import java.util.List;

public interface UserService extends CrudService<User> {
    List<User> getAll();
}
