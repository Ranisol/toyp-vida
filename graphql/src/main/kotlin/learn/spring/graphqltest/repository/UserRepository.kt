package learn.spring.graphqltest.repository
import learn.spring.graphqltest.entity.*
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<User, Long> {
}

interface MarkPostRepository: JpaRepository<MarkPost, Long> {
}

interface MarkPostReplyRepository: JpaRepository<MarkPostReply, Long> {
}

interface MarkMessageRepository: JpaRepository<MarkMessage, Long> {
}
