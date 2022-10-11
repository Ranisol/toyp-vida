package learn.spring.graphqltest.repository
import learn.spring.graphqltest.entity.*

import org.springframework.data.jpa.repository.JpaRepository

interface DashBoardRepository: JpaRepository<DashBoard, Long> {
}

interface DashBoardItemRepository: JpaRepository<DashBoardItem, Long> {
}

interface TaskRepository: JpaRepository<Task, Long> {
}

interface TaskImageRepository: JpaRepository<TaskImage, Long> {
}