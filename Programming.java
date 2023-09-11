package skills;

import beans.UserSkill;

public class Programming extends SkillDecorator {

	public Programming(UserSkill userSkill) {
		this.userSkill = userSkill;
	}
	
	public String getDescription() {
		return userSkill.getDescription() + ", Programming";
	}
	
}