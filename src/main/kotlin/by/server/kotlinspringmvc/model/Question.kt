package by.server.kotlinspringmvc.model

import java.util.*
import javax.persistence.*

@Entity
@Table(name = "question")
data class Question (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    val id: UUID? = null,
    @Column(name = "text")
    val text: String? = null,
    @OneToOne
    @JoinColumn(name = "answer_id", referencedColumnName = "id")
    val answer: Answer? = null
)