package com.example.demo.service;


import com.example.demo.api.model.User;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private List<User> userList;

    public UserService(){
        userList = new ArrayList<>();

        User user1 = new User(1,"Ida",32,"ida@email.com");
        User user2 = new User(2,"Mikael",22,"mikael@email.com");
        User user3 = new User(3,"Torsten",82,"Torsten@email.com");
        User user4 = new User(4,"Thomas",45,"Thomas@email.com");
        User user5 = new User(5,"Larsine",30,"Larsine@email.com");

        userList.addAll(Arrays.asList(user1,user2,user3,user4,user5));
    }

    public Optional<User> getUser(Integer id) {
        Optional optional = Optional.empty();
        for (User user: userList){
            if(id == user.getId()){
                optional = Optional.of(user);
                return optional;
            }
        }
        return optional;
    }
}
