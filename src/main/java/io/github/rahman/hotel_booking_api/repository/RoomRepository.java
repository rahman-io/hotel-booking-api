package io.github.rahman.hotel_booking_api.repository;

import io.github.rahman.hotel_booking_api.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {}
