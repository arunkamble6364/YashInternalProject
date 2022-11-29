package com.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.model.SecondarySkill;
@Repository
public interface SecondarySkillRepository extends JpaRepository<SecondarySkill, Integer> {

}
