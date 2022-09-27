package by.server.kotlinspringmvc.model

import java.util.*
import javax.persistence.*

@Entity
@Table(name = "answer")
data class Answer(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    val id: UUID? = null,
    @Column(name = "text")
    val text: String? = null
)