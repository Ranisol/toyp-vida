package source.spring.graphqltest.repository
import learn.spring.graphqltest.entity.*
import org.springframework.data.jpa.repository.JpaRepository
import source.spring.graphqltest.entity.MarkMessage
import source.spring.graphqltest.entity.MarkPost
import source.spring.graphqltest.entity.MarkPostReply
import source.spring.graphqltest.entity.User

interface UserRepository: JpaRepository<User, Long> {
}

interface MarkPostRepository: JpaRepository<MarkPost, Long> {
}

interface MarkPostReplyRepository: JpaRepository<MarkPostReply, Long> {
}

interface MarkMessageRepository: JpaRepository<MarkMessage, Long> {
}
