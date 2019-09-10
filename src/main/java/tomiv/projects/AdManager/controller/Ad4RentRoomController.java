package tomiv.projects.AdManager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tomiv.projects.AdManager.model.Ad4RentRoom;
import tomiv.projects.AdManager.service.Ad4RentRoomService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "room")
public class Ad4RentRoomController {

    @Autowired
    private Ad4RentRoomService ad4RentRoomService;

    @PostMapping
    public ResponseEntity<Ad4RentRoom> create(@RequestBody Ad4RentRoom ad4RentRoom) {
        return ResponseEntity.ok(ad4RentRoomService.save(ad4RentRoom));
    }

    @GetMapping(path = "{id}")
    public ResponseEntity<Optional<Ad4RentRoom>> getOne(@PathVariable(name = "id") long id) {
        return ResponseEntity.ok(ad4RentRoomService.getOne(id));
    }

    @GetMapping
    public List<Ad4RentRoom> getAll() {
        return ad4RentRoomService.getAll();
    }

    @DeleteMapping(path = "{id}")
    public ResponseEntity<Void> deleteOne(@PathVariable(name = "id") long id) {
        ad4RentRoomService.deleteOne(id);
        return ResponseEntity.noContent().build();
    }
}
