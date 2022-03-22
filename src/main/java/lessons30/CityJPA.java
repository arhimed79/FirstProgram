package lessons30;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CityJPA extends JpaRepository<CityDTO, Integer> {
}
