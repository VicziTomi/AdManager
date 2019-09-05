package tomiv.projects.AdManager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tomiv.projects.AdManager.model.Ad4Rent;
import tomiv.projects.AdManager.service.Ad4RentService;

import java.util.List;

@RestController
@RequestMapping(path = "/rent")
public class Ad4RentController {

    @Autowired
    private Ad4RentService ad4RentService;

    @PostMapping
    public ResponseEntity<Ad4Rent> createAd(@RequestBody Ad4Rent ad4Rent) {
        return ResponseEntity.ok(ad4RentService.save(ad4Rent));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ad4Rent> getAd(@PathVariable Long id) {
        return ResponseEntity.ok(ad4RentService.getOne(id));
    }

    @GetMapping
    public List<Ad4Rent> getAllAds() {
        return ad4RentService.getAll();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAd(@PathVariable Long id) {
        ad4RentService.deleteOne(id);
        return ResponseEntity.noContent().build();
    }
}
