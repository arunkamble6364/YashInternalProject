package com.spring.service;

import java.util.List;

import com.spring.model.PrimarySkill;

public interface PrimarySkillService {

	void savePrimarySkill(PrimarySkill primarySkill);

	List<PrimarySkill> getPrimarySkillList();

	void deletePrimarySkillById(int sid);

}
