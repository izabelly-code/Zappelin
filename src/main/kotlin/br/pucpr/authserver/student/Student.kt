package br.pucpr.authserver.student

import br.pucpr.authserver.users.User
import jakarta.persistence.*

@Entity
@Table(name="tbStudent")
class Student (

    @Id @GeneratedValue
    var id: Long? = null,

    val plan: Plan,

    @OneToOne
    val user: User

)
