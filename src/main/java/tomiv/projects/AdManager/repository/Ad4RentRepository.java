package tomiv.projects.AdManager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tomiv.projects.AdManager.model.Ad4Rent;

@Repository
public interface Ad4RentRepository extends JpaRepository<Ad4Rent, Long> {

}
