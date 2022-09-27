package by.server.kotlinspringmvc.model

import java.util.*
import javax.persistence.*

@Entity
@Table(name = "board")
data class Board (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    val id: UUID? = null,
    @Column(name= "name")
    val name: String? = null,
    @Column(name = "rating_id")
    @OneToMany(mappedBy = "boards")
    val users:List<Rating>? = mutableListOf(),
    @Column(name = "status", nullable = false)
    @Enumerated(EnumType.STRING)
    val status: BoardStatus = BoardStatus.ONLINE
) {
    enum class BoardStatus {
        ONLINE,
        OFFLINE
    }
}