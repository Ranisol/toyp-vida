package learn.spring.graphqltest.repository

import learn.spring.graphqltest.entity.*
import org.springframework.data.jpa.repository.JpaRepository

interface PostRepository: JpaRepository<Post, Long> {
}

interface PostReplyRepository: JpaRepository<PostReply, Long> {
}

interface PostImageRepository: JpaRepository<PostImage, Long> {
}

interface PostReplyImageRepository: JpaRepository<PostReplyImage, Long> {
}

