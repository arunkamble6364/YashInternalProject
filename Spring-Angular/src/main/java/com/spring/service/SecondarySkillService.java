package com.spring.service;

import java.util.List;

import com.spring.model.SecondarySkill;

public interface SecondarySkillService {

	List<SecondarySkill> getSecondarySkillList();

	void saveSecondarySkill(SecondarySkill secondarySkill);

	void deleteSecondarySkillById(int skid);

}
