package learn.spring.graphqltest.entity

import javax.persistence.*

@Entity
@Table
class Post(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,
    var title: String = "",
    @Column(columnDefinition = "text")
    var content: String = "",
    @ManyToOne
    var writer: User = User(),
    @ManyToOne
    var team: Team = Team(),
    @OneToMany(mappedBy = "post")
    var images: MutableList<PostImage> = mutableListOf()
)

@Entity
@Table
class PostReply(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,
    var title: String = "",
    @Column(columnDefinition = "text")
    var content: String = "",
    @ManyToOne
    var writer: User = User(),
    @ManyToOne
    var post: Post = Post(),
    @OneToMany(mappedBy = "postReply")
    var images: List<PostReplyImage> = emptyList()
)

@Entity
@Table
class PostImage(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,
    @ManyToOne
    var post: Post = Post(),
    var url: String = ""
)

@Entity
@Table
class PostReplyImage(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,
    @ManyToOne
    var postReply: PostReply = PostReply(),
    var url: String = ""
)