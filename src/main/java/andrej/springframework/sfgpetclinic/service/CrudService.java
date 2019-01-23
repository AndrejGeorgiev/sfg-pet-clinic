package andrej.springframework.sfgpetclinic.service;

import java.util.Set;

public interface CrudService<T,ID> {
    T findById(ID id);

    T save(T pet);

    Set<T> findAll();

    void delete(T object);

    void deleteById(ID id);
}
