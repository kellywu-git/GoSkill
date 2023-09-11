package beans;

import java.util.ArrayList;

public class ViewRecommendations implements Observer {
        private String[] list;
        private MakeRecommendations makeRecommendations;
        
        public ViewRecommendations(MakeRecommendations makeRecommendations) {
            this.makeRecommendations = makeRecommendations;
            makeRecommendations.attach(this);
        }
        
        public void update(ArrayList<String> recommendations) {
            // update the view with new recommendations
            this.list = recommendations.toArray(new String[0]);
        }
        
        public String[] makeList() {
            // logic for creating list of recommendations
            return list;
        }
    }
