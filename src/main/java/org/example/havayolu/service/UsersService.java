package org.example.havayolu.service;

import org.apache.catalina.User;
import org.example.havayolu.dto.user.CreateUserDto;
import org.example.havayolu.entity.Users;
import org.example.havayolu.exception.WrongPassword;
import org.example.havayolu.repository.UsersRepository;
import org.springframework.stereotype.Service;

@Service
public class UsersService {
    private final UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public Users createUser(CreateUserDto createUserDto){
        Users users = new Users(
                createUserDto.getName(),
                createUserDto.getLastname(),
                createUserDto.getTc(),
                createUserDto.getNumber(),
                createUserDto.getPassword()
        );
        return usersRepository.save(users);
    }

    public Users loginUser(String tc,String password){
        Users users = usersRepository.findByTc(tc).orElseThrow(()-> new RuntimeException("User not found"));
        if (users.getPassword().equals(password)){
            return users;
        }else
            throw new WrongPassword("wrong password");
    }
}
