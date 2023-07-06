package dpdncyInv;

import java.util.Optional;

public class UserService implements UserRepository {

    UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    @Override
    public User search(Integer id) {
        return userRepository.search(id);
    }

}
