package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.PrimarySkill;
import com.spring.model.SecondarySkill;
import com.spring.service.PrimarySkillService;
import com.spring.service.SecondarySkillService;


@RestController
@CrossOrigin(origins="http://localhost:4200")
public class SkillController {
	
	@Autowired
	private PrimarySkillService primarySkillService;
	@Autowired
	private SecondarySkillService secondarySkillService;
	
	@PostMapping("/savePrimarySkill")
	public void SavePrimarySkill(@RequestBody PrimarySkill primarySkill)
	{
		primarySkillService.savePrimarySkill(primarySkill);
	}
	
	@PostMapping("/saveSecondarySkill")
	public void saveSecondarySkill(@RequestBody SecondarySkill secondarySkill)
	{
		secondarySkillService.saveSecondarySkill(secondarySkill);
	}
	
	@GetMapping("/getPrimarySkill")
	public List<PrimarySkill> getPrimarySkillList(PrimarySkill primarySkill)
	{
		List<PrimarySkill> skill = primarySkillService.getPrimarySkillList();
		return skill;
		
	}
	
	@GetMapping("/getSecondarySkill")
	public List<SecondarySkill> getSecondarySkillList(SecondarySkill secondarySkill)
	{
		List<SecondarySkill> skill = secondarySkillService.getSecondarySkillList();
		return skill;
		
	}
	
	@DeleteMapping("/{sid}")
    public void deletePrimarySkillById(@PathVariable("sid") int sid) {
        this.primarySkillService.deletePrimarySkillById(sid);
    }
	
	@DeleteMapping("/{skid}")
    public void deleteSecondarySkillById(@PathVariable("skid") int skid) {
        this.secondarySkillService.deleteSecondarySkillById(skid);
    }

}
