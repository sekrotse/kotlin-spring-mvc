package by.server.kotlinspringmvc.model

import java.util.*
import javax.persistence.*

@Entity
@Table(name = "rating")
data class Rating(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    val id: UUID? = null,
    @Column(name = "user_id")
    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    val user: User? = null,
    @Column(name = "score")
    var score: Long
)
