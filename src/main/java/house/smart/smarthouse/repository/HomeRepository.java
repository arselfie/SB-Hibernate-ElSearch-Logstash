package house.smart.smarthouse.repository;

import house.smart.smarthouse.domain.Home;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface HomeRepository extends JpaRepository<Home, Integer> {
}
