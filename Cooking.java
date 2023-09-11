package skills;

import beans.UserSkill;

public class Cooking extends SkillDecorator {

	public Cooking(UserSkill userSkill) {
		this.userSkill = userSkill;
	}
	
	public String getDescription() {
		return userSkill.getDescription() + ", Cooking";
	}
	
}