package by.server.kotlinspringmvc.model

import java.util.*
import javax.persistence.*

@Entity
@Table(name = "users")
data class User (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    val id: UUID? = null,
    @Column(name = "first_name", nullable = false)
    val firstName: String? = null,
    @Column(name = "last_name", nullable = false)
    val lastName: String? = null,
    @Column(name = "login", nullable = false)
    val login: String? = null,
    @Column(name = "age", nullable = false)
    val age: Int? = null,
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_room",
        joinColumns = [JoinColumn(name = "user_id")],
        inverseJoinColumns = [JoinColumn(name = "room_id")])
    val rooms: List<Room> = mutableListOf()
)