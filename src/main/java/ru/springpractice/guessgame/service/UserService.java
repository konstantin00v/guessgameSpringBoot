package ru.springpractice.guessgame.service;

import org.springframework.stereotype.Service;
import ru.springpractice.guessgame.annotation.LogMethod;
import ru.springpractice.guessgame.annotation.WorkTime;
import ru.springpractice.guessgame.dao.UserDao;
import ru.springpractice.guessgame.model.User;

@Service
public class UserService {

    private final UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }
    @LogMethod
    public User getUserById(long id) {
        return userDao.findById(id);
    }
    @WorkTime
    public User save(User user) {
        return userDao.save(user);
    }
}
