package in.atos.jersey.ecommerce.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.atos.jersey.ecommerce.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	    Optional<User> findByUsername(String username);
	    List<User> findByCity(String city);
}
