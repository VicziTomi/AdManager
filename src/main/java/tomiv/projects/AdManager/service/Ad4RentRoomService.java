package tomiv.projects.AdManager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tomiv.projects.AdManager.model.Ad4RentRoom;
import tomiv.projects.AdManager.repository.Ad4RentRoomRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class Ad4RentRoomService {

    @Autowired
    private Ad4RentRoomRepository ad4RentRoomRepository;

    public Ad4RentRoom save(Ad4RentRoom ad4RentRoom) {
        return ad4RentRoomRepository.save(ad4RentRoom);
    }

    public Optional<Ad4RentRoom> getOne(long id) {
        return Optional.of(ad4RentRoomRepository.getOne(id));
    }

    public List<Ad4RentRoom> getAll() {
        return ad4RentRoomRepository.findAll().stream().filter(ad4RentRoom -> !ad4RentRoom.isDeleted()).collect(Collectors.toList());
    }

    public void deleteOne(long id) {
        if (ad4RentRoomRepository.existsById(id)) {
            Ad4RentRoom ad4RentRoom = ad4RentRoomRepository.getOne(id);
            ad4RentRoom.setDeleted(true);
            ad4RentRoomRepository.save(ad4RentRoom);
        }
    }
}
