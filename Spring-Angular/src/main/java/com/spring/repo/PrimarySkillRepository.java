package com.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.PrimarySkill;
@Repository
public interface PrimarySkillRepository extends JpaRepository<PrimarySkill, Integer> {

}
