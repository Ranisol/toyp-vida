package source.spring.graphqltest.repository

import source.spring.graphqltest.entity.Team
import source.spring.graphqltest.entity.TeamManager
import source.spring.graphqltest.entity.TeamMember
import org.springframework.data.jpa.repository.JpaRepository

interface TeamRepository: JpaRepository<Team, Long> {
}

interface TeamMemberRepository: JpaRepository<TeamMember, Long> {
}

interface TeamManagerRepository: JpaRepository<TeamManager, Long> {
}