package source.spring.graphqltest.repository

import learn.spring.graphqltest.entity.*
import org.springframework.data.jpa.repository.JpaRepository
import source.spring.graphqltest.entity.Post
import source.spring.graphqltest.entity.PostImage
import source.spring.graphqltest.entity.PostReply
import source.spring.graphqltest.entity.PostReplyImage

interface PostRepository: JpaRepository<Post, Long> {
}

interface PostReplyRepository: JpaRepository<PostReply, Long> {
}

interface PostImageRepository: JpaRepository<PostImage, Long> {
}

interface PostReplyImageRepository: JpaRepository<PostReplyImage, Long> {
}

