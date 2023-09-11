package beans;

import java.util.ArrayList;

import skills.Cooking;
import skills.Programming;
import skills.Writting;

public class SkillsWant {
    private ArrayList<String> skills = new ArrayList<String>();

    public SkillsWant() {
    	UserSkill userSkill = new Client();
    	UserSkill programmerUser = new Programming(userSkill);
    	UserSkill cookingUser = new Cooking(programmerUser);
    	UserSkill writtingUser = new Writting(cookingUser);

		System.out.println(writtingUser.getDescription());
    	
    }
    
    public void setSkillWant(String skill) {
        skills.add(skill);
    }

    public ArrayList<String> getSkillWant() {
        return skills;
    }
}