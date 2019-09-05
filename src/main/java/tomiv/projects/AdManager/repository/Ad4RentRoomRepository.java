package tomiv.projects.AdManager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tomiv.projects.AdManager.model.Ad4RentRoom;

@Repository
public interface Ad4RentRoomRepository extends JpaRepository<Ad4RentRoom, Long> {

}
