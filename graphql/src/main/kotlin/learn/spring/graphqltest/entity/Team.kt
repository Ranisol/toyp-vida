package learn.spring.graphqltest.entity

import javax.persistence.*

@Entity
@Table
class Team(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,
    var name: String = "",
)

@Entity
@Table
class TeamMember(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,
    @ManyToOne
    var team: Team = Team(),
    @ManyToOne
    var user: User = User()
)

@Entity
@Table
class TeamManager(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,
    @ManyToOne
    var team: Team = Team(),
    @ManyToOne
    var user: User = User()
)