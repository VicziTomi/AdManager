package tomiv.projects.AdManager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tomiv.projects.AdManager.model.Ad4Rent;
import tomiv.projects.AdManager.repository.Ad4RentRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class Ad4RentService {

    @Autowired
    private Ad4RentRepository ad4RentRepository;

    public Ad4Rent save(Ad4Rent ad4Rent) {
        return ad4RentRepository.save(ad4Rent);
    }

    public Ad4Rent getOne(Long id) {
        if (ad4RentRepository.existsById(id)) {
            return ad4RentRepository.getOne(id);
        } else {
            return null;
        }
    }

    public List<Ad4Rent> getAll() {
        List<Ad4Rent> ad4RentList = ad4RentRepository.findAll();
        return ad4RentList.stream().filter(x -> !x.isDeleted()).collect(Collectors.toList());
    }

    public void deleteOne(Long id) {
        if (ad4RentRepository.existsById(id)) {
            Ad4Rent ad4Rent = getOne(id);
            ad4Rent.setDeleted(true);
            ad4RentRepository.save(ad4Rent);
        }
    }
}
