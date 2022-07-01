package com.revature.repository;

import java.util.List;

public interface DAO<T> {
    List<T> getAll();

    boolean create(T t);

}
