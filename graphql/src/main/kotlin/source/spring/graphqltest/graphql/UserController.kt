package source.spring.graphqltest.graphql

import source.spring.graphqltest.entity.User
import source.spring.graphqltest.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.graphql.data.method.annotation.MutationMapping
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.graphql.data.method.annotation.SchemaMapping
import org.springframework.stereotype.Controller


// user graphql controller
@Controller
class UserController(
    @Autowired private val userRepository: UserRepository
) {
    @QueryMapping
    fun getUser(id: Long): User? {
        return userRepository.findById(id).orElse(null)
    }

    @QueryMapping
    fun getUsers(): List<User> {
        return userRepository.findAll()
    }

    @MutationMapping
    fun createUser(name: String): User {
        val user = User(name = name)
        return userRepository.save(user)
    }



}