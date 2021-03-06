package miniTwitter.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import miniTwitter.demo.models.Role;
import miniTwitter.demo.models.User;
import miniTwitter.demo.repositories.RoleRepository;
import miniTwitter.demo.repositories.UserRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
    public Long countByEmail(String email) {
        return userRepository.countByEmail(email);
    }

    public void saveUser(User user) {
        user.setRoles(Arrays.asList(roleRepository.findByRole("USER")));
        user.setPassword(passwordEncoder.encode(user.getPassword()));
       // user.setEnabled(true);
        userRepository.save(user);
    }

    public void saveAdmin(User user) {
        user.setRoles(Arrays.asList(roleRepository.findByRole("ADMIN")));
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        //user.setEnabled(true);
        userRepository.save(user);
    }
}