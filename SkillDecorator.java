package skills;

import beans.UserSkill;

public abstract class SkillDecorator extends UserSkill {
	
	UserSkill userSkill;
	public abstract String getDescription(); 

}
