/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CATPayrollSystem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eddychou
 */
public class Agreement {
    private List<PostingRule> postingRulesList;

    public Agreement() {
        postingRulesList=new ArrayList<PostingRule>();
    }
   
     /**
     * @return the postingRulesList
     */
    public List<PostingRule> getPostingRulesList() {
        return postingRulesList;
    }

    /**
     * @param postingRulesList the postingRulesList to set
     */
    public void setPostingRulesList(List<PostingRule> postingRulesList) {
        this.postingRulesList = postingRulesList;
    }
    public PostingRule getPostingRule(EventType eventType){
        for(int i=0;i<getPostingRulesList().size();i++){
            PostingRule currPostingRule=getPostingRulesList().get(i);
            if(currPostingRule.getEventType() == eventType){
                return currPostingRule;
            }
        }
        
        return null;
    }
}
