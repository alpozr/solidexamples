package dpdncyInv;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository {
     User search(Integer Id);
}
