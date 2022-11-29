package com.spring.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.model.SecondarySkill;
import com.spring.repo.SecondarySkillRepository;
import com.spring.service.SecondarySkillService;
@Service
public class SecondarySkillServiceImpl implements SecondarySkillService {

	@Autowired
	private SecondarySkillRepository secondarySkillRepository;
	@Override
	public List<SecondarySkill> getSecondarySkillList() {

		return secondarySkillRepository.findAll();
		
	}
	@Override
	public void saveSecondarySkill(SecondarySkill secondarySkill) {

		secondarySkillRepository.save(secondarySkill);
	}
	@Override
	public void deleteSecondarySkillById(int skid) {

		secondarySkillRepository.deleteById(skid);
	}

}
