package learn.spring.graphqltest.entity

import javax.persistence.*

// dashboard
@Table
@Entity
class DashBoard(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,
    var name: String = "",
    var priority: Int = 0,
    @ManyToOne
    var team: Team = Team(),
)

@Table
@Entity
class DashBoardItem(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,
    var name: String = "",
    var sequence: Int = 0,
    @ManyToOne
    var board: DashBoard = DashBoard()
)

@Table
@Entity
class Task(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,
    var title: String = "",
    @Column(columnDefinition = "text")
    var content: String = "",
    var status: String = "",
    var sequence: Int = 0,
    @ManyToOne
    var boardItem: DashBoardItem = DashBoardItem(),
    @OneToMany
    var images: List<TaskImage> = emptyList()
)

@Entity
@Table
class TaskImage(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,
    @ManyToOne
    var task: Task = Task(),
    var url: String = ""
)