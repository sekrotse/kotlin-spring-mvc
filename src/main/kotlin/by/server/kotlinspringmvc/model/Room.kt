package by.server.kotlinspringmvc.model

import java.util.*
import javax.persistence.*

@Entity
@Table(name = "room")
data class Room (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    val id: UUID? = null,
    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    val status: RoomStatus,
    @Column(name = "user_id")
    @ManyToMany(mappedBy = "rooms")
    val users: List<User>? = mutableListOf()
) {
    enum class RoomStatus {
        NEW,
        IN_WAIT,
        IN_PLAY,
        FINISH
    }
}