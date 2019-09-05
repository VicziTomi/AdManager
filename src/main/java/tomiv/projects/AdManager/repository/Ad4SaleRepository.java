package tomiv.projects.AdManager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tomiv.projects.AdManager.model.Ad4Sale;

@Repository
public interface Ad4SaleRepository extends JpaRepository<Ad4Sale, Long> {
    
}
