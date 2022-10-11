package learn.spring.graphqltest.repository

import learn.spring.graphqltest.entity.Team
import learn.spring.graphqltest.entity.TeamManager
import learn.spring.graphqltest.entity.TeamMember
import org.springframework.data.jpa.repository.JpaRepository

interface TeamRepository: JpaRepository<Team, Long> {
}

interface TeamMemberRepository: JpaRepository<TeamMember, Long> {
}

interface TeamManagerRepository: JpaRepository<TeamManager, Long> {
}