package tomiv.projects.AdManager.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import tomiv.projects.AdManager.model.Ad4Rent;
import tomiv.projects.AdManager.model.Ad4RentRoom;
import tomiv.projects.AdManager.model.Gender;
import tomiv.projects.AdManager.repository.Ad4RentRepository;
import tomiv.projects.AdManager.repository.Ad4RentRoomRepository;

import javax.transaction.Transactional;
import java.time.LocalDate;

@Component
@Transactional
public class InitDataLoader implements CommandLineRunner {

    @Autowired
    private Ad4RentRepository ad4RentRepository;

    @Autowired
    private Ad4RentRoomRepository ad4RentRoomRepository;

    @Override
    public void run(String... args) throws Exception {

        Ad4Rent ad4Rent1 = new Ad4Rent();
        ad4Rent1.setDescription("This is a description");
        ad4Rent1.setSettlement("Szeged");
        ad4Rent1.setMonthlyFee(58000);
        ad4Rent1.setMonthlyOverhead(7800);
        ad4Rent1.setSmoker(true);

        Ad4Rent ad4Rent2 = new Ad4Rent();
        ad4Rent2.setDescription("None available");
        ad4Rent2.setSettlement("Szeged");
        ad4Rent2.setMonthlyFee(67000);
        ad4Rent2.setMovable(LocalDate.of(2019, 9, 10));
        ad4Rent2.setSmoker(false);

        ad4RentRepository.save(ad4Rent1);
        ad4RentRepository.save(ad4Rent2);

        Ad4RentRoom ad4RentRoom1 = new Ad4RentRoom();
        ad4RentRoom1.setDescription("none");
        ad4RentRoom1.setSettlement("Szeged");
        ad4RentRoom1.setMovable(LocalDate.of(2019, 10, 1));
        ad4RentRoom1.setGenderSeek(Gender.FEMALE);
        ad4RentRoom1.setMonthlyFee(25000);
        ad4RentRoom1.setMonthlyOverhead(4500);
        ad4RentRoom1.setSmoker(false);

        ad4RentRoomRepository.save(ad4RentRoom1);


    }
}
