package io.github.rahman.hotel_booking_api.controller;

import io.github.rahman.hotel_booking_api.entity.Room;
import io.github.rahman.hotel_booking_api.repository.RoomRepository;
import io.github.rahman.hotel_booking_api.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/api/rooms")
public class RoomController {
    @Autowired
    private RoomService roomService;

    @GetMapping
    public List<Room> getAllRooms(){
        return roomService.getAllRooms();
    }

    @PostMapping
    public Room addRoom(@RequestBody Room room){
        return roomService.addRoom(room);
    }

//    @Autowired
//    private RoomRepository roomRepository;
//
//    @GetMapping
//    public List<Room> getAllRooms(){
//        return roomRepository.findAll();
//    }
//
//    @PostMapping
//    public Room addRoom(@RequestBody Room room){
//        return roomRepository.save(room);
//    }

}
