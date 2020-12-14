package com.aliraza.obligatoriskjpa.service;

import java.util.Optional;
import java.util.Set;

public interface CrudService<T, ID> {


    Set<T> findAll();

    T save(T object);

    void delete(T obj);

    void deleteById(ID id);

    Optional<T> findById(ID id);


}
