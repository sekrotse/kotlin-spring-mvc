package by.server.kotlinspringmvc.repository;

import by.server.kotlinspringmvc.model.Room
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface RoomRepository : JpaRepository<Room, UUID> {
}