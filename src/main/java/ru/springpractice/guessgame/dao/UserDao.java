package ru.springpractice.guessgame.dao;
import org.springframework.stereotype.Repository;
import ru.springpractice.guessgame.model.User;

@Repository
public class UserDao {
    public User findById (long id) {
        //select from db
        return new User(1L, "Kostya", 555);
    }
    public User save(User user) {
        //save in db
        return user;
    }
}
