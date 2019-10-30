package house.smart.smarthouse.service;

public interface CrudService<T> {
    void save(T entity);
    void deleteById(int id);
    T getById(int id);
}
