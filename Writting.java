package skills;

import beans.UserSkill;

public class Writting extends SkillDecorator {

	public Writting(UserSkill userSkill) {
		this.userSkill = userSkill;
	}
	
	public String getDescription() {
		return userSkill.getDescription() + ", Writting";
	}
	
}