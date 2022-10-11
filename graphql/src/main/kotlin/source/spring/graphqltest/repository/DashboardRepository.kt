package source.spring.graphqltest.repository
import learn.spring.graphqltest.entity.*

import org.springframework.data.jpa.repository.JpaRepository
import source.spring.graphqltest.entity.DashBoard
import source.spring.graphqltest.entity.DashBoardItem
import source.spring.graphqltest.entity.Task
import source.spring.graphqltest.entity.TaskImage

interface DashBoardRepository: JpaRepository<DashBoard, Long> {
}

interface DashBoardItemRepository: JpaRepository<DashBoardItem, Long> {
}

interface TaskRepository: JpaRepository<Task, Long> {
}

interface TaskImageRepository: JpaRepository<TaskImage, Long> {
}