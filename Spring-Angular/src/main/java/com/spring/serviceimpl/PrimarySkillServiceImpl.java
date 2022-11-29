package com.spring.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.model.PrimarySkill;
import com.spring.repo.PrimarySkillRepository;
import com.spring.service.PrimarySkillService;
@Service
public class PrimarySkillServiceImpl implements PrimarySkillService{

	@Autowired
	private PrimarySkillRepository primarySkillRepository;
	@Override
	public void savePrimarySkill(PrimarySkill primarySkill) {
		primarySkillRepository.save(primarySkill);
	
	}
	@Override
	public List<PrimarySkill> getPrimarySkillList() {

		return primarySkillRepository.findAll();
	}
	@Override
	public void deletePrimarySkillById(int sid) {
		
		primarySkillRepository.deleteById(sid);
		
	}

}
