package com.dao;

public interface UserDao<T> {
    public void addUser(T entity);
    public void editUser(T entity);
    public void dscontinue_use(Long id);

}
