package learn.spring.graphqltest.service

import learn.spring.graphqltest.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class UserService(
    @Autowired private val userRepository: UserRepository
) {
    fun getUser(id: Long) = userRepository.findByIdOrNull(id)

}