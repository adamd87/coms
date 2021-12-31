package pl.adamd.coms.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.adamd.coms.account.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
