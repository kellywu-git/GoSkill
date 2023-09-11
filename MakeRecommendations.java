package beans;

import java.util.ArrayList;

public class MakeRecommendations {
    private ArrayList<String> skillsHave = new ArrayList<String>();
    private ArrayList<String> skillsWant = new ArrayList<String>();
    private ArrayList<String> recommendations = new ArrayList<String>();
    private ArrayList<Observer> observers = new ArrayList<Observer>();

    // Setters for skillsHave and skillsWant
    public void setSkillsHave(ArrayList<String> skillsHave) {
        this.skillsHave = skillsHave;
        updateRecommendations();
    }

    public void setSkillsWant(ArrayList<String> skillsWant) {
        this.skillsWant = skillsWant;
        updateRecommendations();
    }
    
    public void attach(Observer observer) {
        observers.add(observer);
    }
    
    public void detach(Observer observer) {
        observers.remove(observer);
    }
    
    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(recommendations);
        }
    }

    private void updateRecommendations() {
        recommendations.clear();
        // generate new recommendations based on skillsHave and skillsWant
        for (String skill : skillsHave) {
            if (skillsWant.contains(skill)) {
                recommendations.add(skill);
            }
        }
        notifyObservers();
    }
 // Method to generate recommendations
    public ArrayList<String> generateRecommendations(ArrayList<String> otherSkillsHave) {
        for (String skill : otherSkillsHave) {
            if (skillsWant.contains(skill)) {
                recommendations.add(skill);
            }
        }
        return recommendations;
    }
}
