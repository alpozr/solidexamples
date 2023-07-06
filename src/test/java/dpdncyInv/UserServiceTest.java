package dpdncyInv;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {


    @Test
    void searchTest() {
        UserRepository ınMemoryRepository = new InMemoryRepository();
        UserService userService=new UserService(ınMemoryRepository);
        User expected = new User(123,"Alp","25");
        Assertions.assertEquals(userService.search(UserMother.ALP_ID).getId(),expected.getId());

    }
}