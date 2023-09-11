package beans;

import java.util.ArrayList;

import skills.Cooking;
import skills.Programming;
import skills.Writting;

public class SkillHave {
    private ArrayList<String> skills = new ArrayList<String>();

    public SkillHave() {
    	UserSkill userSkill = new Client();
    	UserSkill programmerUser = new Programming(userSkill);
    	UserSkill cookingUser = new Cooking(programmerUser);
    	UserSkill writtingUser = new Writting(cookingUser);

		System.out.println(writtingUser.getDescription());   	
    }
    
    public void setSkillHave(String skill) {
        skills.add(skill);
    }

    public ArrayList<String> getSkillHave() {
        return skills;
    }
}
