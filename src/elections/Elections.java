package elections;

import java.util.*;

public class Elections {
    public ArrayList<Envelope> votedIdArray = new ArrayList<>();
    public HashMap<String , Integer> candidateScore = new HashMap<>();
    HashMap <String, Vote> openedEnvelopes = new HashMap<>();

    public void makeVote(Envelope env){
        votedIdArray.add(env);
    }


    public void calculate() {
        for(Envelope envelope:votedIdArray) {

            String id = envelope.id;

            Vote vote = openedEnvelopes.get(id);
            if (vote != null) {
                vote.setDoubleVoted();
            } else {
                openedEnvelopes.put(id, vote);
            }
        }
        for (Vote votePoint : openedEnvelopes.values()){
            if(!votePoint.isDoubleVoted()){
                String voteName = votePoint.candiateName;
                Integer count = candidateScore.get(voteName);
                if(count == null) {
                    count = 0;
                }
                candidateScore.put(voteName, count + 1);
            }

        }
    }




}

