package source.spring.graphqltest.entity

import javax.persistence.*

@Table
@Entity
class UserRoom(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,
    @ManyToOne
    var user: User = User(),
    @ManyToOne
    var room: Room = Room()
)

@Table
@Entity
class Room(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,
    var name: String = "",
    @OneToMany
    var users: List<User> = emptyList(),
    @ManyToOne
    var owner: User = User(),
    @ManyToOne
    var team: Team = Team(),
)

@Table
@Entity
class RoomNotice(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,
    var title: String = "",
    var content: String = "",
    @OneToOne
    var room: Room = Room()
)

@Table
@Entity
class Message(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,
    @ManyToOne
    var room: Room = Room(),
    @ManyToOne
    var user: User = User(),
    var content: String = ""
)

@Table
@Entity
class MessageImage(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,
    @ManyToOne
    var message: Message = Message(),
    var url: String = ""
)

@Table
@Entity
class MessageReply(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,
    @ManyToOne(fetch = FetchType.LAZY)
    var message: Message = Message(),
    var content: String = ""
)

@Table
@Entity
class MessageReplyImage(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,
    @ManyToOne
    var messageReply: MessageReply = MessageReply(),
    var url: String = ""
)