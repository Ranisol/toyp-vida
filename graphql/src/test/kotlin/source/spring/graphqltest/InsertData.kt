package source.spring.graphqltest

import learn.spring.graphqltest.entity.*
import learn.spring.graphqltest.repository.*
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import source.spring.graphqltest.entity.*
import source.spring.graphqltest.repository.*
import javax.transaction.Transactional

@SpringBootTest
class InsertData (
    // user
    @Autowired val userRepository: UserRepository,
    @Autowired val markPostRepository: MarkPostRepository,
    @Autowired val markPostReplyRepository: MarkPostReplyRepository,
    @Autowired val markMessageRepository: MarkMessageRepository,
    // team
    @Autowired val teamRepository: TeamRepository,
    @Autowired val teamMemberRepository: TeamMemberRepository,
    @Autowired val teamManagerRepository: TeamManagerRepository,
    // post
    @Autowired val postRepository: PostRepository,
    @Autowired val postReplyRepository: PostReplyRepository,
    @Autowired val postImageRepository: PostImageRepository,
    // room
    @Autowired val roomRepository: RoomRepository,
    @Autowired val userRoomRepository: UserRoomRepository,
    @Autowired val roomNoticeRepository: RoomNoticeRepository,
    @Autowired val messageRepository: MessageRepository,
    // dashboard
    @Autowired val dashBoardRepository: DashBoardRepository,
    @Autowired val dashBoardItemRepository: DashBoardItemRepository,
    @Autowired val taskRepository: TaskRepository,
    @Autowired val taskImageRepository: TaskImageRepository
        ) {


    @Test
    @Transactional
    fun insertData() {

    }

    private fun User.createTeam(): Team {
        val team = Team(name = "team1")
        teamRepository.save(team)
        val teamMember = TeamMember(team = team, user = this)
        teamMemberRepository.save(teamMember)
        val teamManager = TeamManager(team = team, user = this)
        teamManagerRepository.save(teamManager)
        return team
    }

    private fun User.createPost(team: Team): Post {
        val post = Post(title = "post1", content = "content1", writer = this, team = team)
        postRepository.save(post)
        val postImage = PostImage(url = "url1", post = post)
        postImageRepository.save(postImage)
        post.images.add(postImage)
        return post
    }

    private fun User.replyPost(post: Post): PostReply {
        val postReply = PostReply(content = "reply1", writer = this, post = post)
        postReplyRepository.save(postReply)
        return postReply
    }

}