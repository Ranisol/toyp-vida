package learn.spring.graphqltest.entity

import javax.persistence.*

@Entity
@Table
class User(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,
    var name: String = "",
    @Column(nullable = false)
    var email: String = ""
)

@Table
@Entity
class MarkPost(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,
    @ManyToOne
    var user: User = User(),
    @ManyToOne
    var post: Post = Post()
)

@Table
@Entity
class MarkPostReply(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,
    @ManyToOne(fetch = FetchType.LAZY)
    var user: User = User(),
    @ManyToOne(fetch = FetchType.LAZY)
    var postReply: PostReply = PostReply()
)

@Table
@Entity
class MarkMessage(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,
    @ManyToOne(fetch = FetchType.LAZY)
    var user: User = User(),
    @ManyToOne(fetch = FetchType.LAZY)
    var message: Message = Message()
)