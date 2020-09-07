package be.jpaSchoolOut.Proj.services;

import be.jpaSchoolOut.Proj.data.UserRepository;
import be.jpaSchoolOut.Proj.model.User;

import java.util.List;

public class UserService {

    private UserRepository userRepository = new UserRepository();
    private User user = new User();

    public void createUser(User user)
    {
     userRepository.createUser(user);
    }

    public void updateUser(User user)
    {
        userRepository.updateUser(user);
    }

    /*public User getUserbyloginname(String logname)
    {
        return userRepository.getUserbyloginname(logname);
    }*/

    public void delUser(String logname) {
        userRepository.delUser(logname);
    }

    public List<User> getAllUsers()
    {
        return userRepository.getAllUsers();
    }
}