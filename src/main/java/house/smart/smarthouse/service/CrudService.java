package house.smart.smarthouse.service;

import java.util.List;

public interface CrudService<T> {
    void save(T entity);
    void deleteById(int id);
    T getById(int id);
    void update(T entity);
    List<T> getAll();
}
