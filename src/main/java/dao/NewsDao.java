package dao;

import models.Department;
import models.News;
import models.User;

import java.util.List;

public interface NewsDao {
    //create
    void add(News news);

    //read
    List<News> getAll();

    // find by ID
    News findById(int id);

    //update
    void update(int id, String title, String content, int departmentId);

    //delete
    void deleteById(int id);
    void clearAll();
}

