package source.spring.graphqltest.repository

import learn.spring.graphqltest.entity.*
import org.springframework.data.jpa.repository.JpaRepository
import source.spring.graphqltest.entity.*

interface RoomRepository: JpaRepository<Room, Long> {
}

interface UserRoomRepository: JpaRepository<UserRoom, Long> {
}

interface RoomNoticeRepository: JpaRepository<RoomNotice, Long> {
}

interface MessageRepository: JpaRepository<Message, Long> {
}

interface MessageImageRepository: JpaRepository<MessageImage, Long> {
}

