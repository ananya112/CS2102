
    import java.util.LinkedList;
    import java.util.Scanner;
    import java.util.HashMap;

    class ElectionData {

        private HashMap<String, Integer> firstVote;
        private HashMap<String, Integer> secondVote;
        private HashMap<String, Integer> thirdVote;
        Scanner keyboard = new Scanner(System.in);
        private int totalVoters;

        private LinkedList<String> ballot;

        protected ElectionData() {
            this.ballot = new LinkedList<String>();
            this.firstVote = new HashMap<String, Integer>();
            this.secondVote = new HashMap<String, Integer>();
            this.thirdVote = new HashMap<String, Integer>();
            this.totalVoters = totalVoters;
        }

        /**
         * prints the candidates in the ballot
         **/

        private void printBallot() {

            System.out.println("The candidates are ");
            for (String s : ballot) {
                System.out.println(s);
            }
        }

        /**
         * prints the user's first, second, and third choice of candidates in the ballot
         * @throws UnknownCandidateException if there is an unknown candidate
         **/

        void screen() throws UnknownCandidateException, DuplicateVotesException{
            this.printBallot();
            System.out.println("Who do you want to vote for first?");
            String candidate1 = keyboard.next();

            System.out.println("Who do you want to vote second?");
            String candidate2 = keyboard.next();

            System.out.println("Who do you want to vote third?");
            String candidate3 = keyboard.next();

            processVote(candidate1, candidate2, candidate3);

            System.out.println("Your first choice vote was" + candidate1);
            System.out.println("Your second choice vote was" + candidate2);
            System.out.println("Your third choice vote was" + candidate3);
        }

        /**
         * Stores a single voter's first, second, and third candidate choices
         * checks to see if the voter's votes are valid
         * @throws UnknownCandidateException if there is an unknown candidate
         * @throws DuplicateVotesException if there is a duplicate candidate
         **/

        void processVote(String firstChoice, String secondChoice, String thirdChoice) throws UnknownCandidateException, DuplicateVotesException{

            if(!ballot.contains(firstChoice)){
                throw new UnknownCandidateException(firstChoice);

            }else if(!ballot.contains(secondChoice)){
                throw new UnknownCandidateException(secondChoice);
            }
            else if(!ballot.contains(thirdChoice)){
                throw new UnknownCandidateException(thirdChoice);
            }

            if (firstChoice.equals(secondChoice) || firstChoice.equals(thirdChoice)){
                throw new DuplicateVotesException(firstChoice);
            }
            else if(secondChoice.equals(thirdChoice)){
                throw new DuplicateVotesException(secondChoice);
            }

            this.firstVote.put(firstChoice, firstVote.get(firstChoice)+1);
            this.secondVote.put(secondChoice, secondVote.get(secondChoice)+1);
            this.firstVote.put(thirdChoice, firstVote.get(thirdChoice)+1);
            totalVoters++;
        }


        /**
         * Stores a single voter's first, second, and third candidate choices
         * @throws CandidateExistsException if there is already a candidate
         **/

        void addCandidate(String candidate) throws CandidateExistsException{

            if(ballot.contains(candidate)) {
                throw new CandidateExistsException(candidate);
            }
            ballot.add(candidate);
            firstVote.put(candidate, 0);
            secondVote.put(candidate, 0);
            thirdVote.put(candidate, 0);

        }

        /**
         * decides the winner of the election based on who got the most first place votes
         * @return the name of the election winner
         */

        String findWinnerMostFirstVotes() {
            // get sum of all first place votes in first vote hash map

            double total = 0;
            double highest= 0;
            String candidateName = "";

            for(String candidate : ballot){
                total += firstVote.get(candidate);
            }

            for (String candidate : ballot) {
                if (highest < firstVote.get(candidate)){
                    highest = firstVote.get(candidate);
                    candidateName = candidate;
                }
            }

            double half = highest/2;

            if(half<highest){
                return candidateName;
            }
            else return ("Runoff Required");
        }



           /* public String findWinnerMostFirstVotes() {
                double totalamtVotes = 0;
                totalamtVotes = totalamtVotes + firstVote.size();
                for (String candidate : ballot) {
                    if (firstVote.get(candidate) / totalamtVotes > .50) {
                        System.out.println("The Winner is: " + candidate);
                        return "The Winner is: " + candidate;
                    }
                }
                System.out.println("Runoff Required");
                return "Runoff Required";
            }

*/
        /**
         * decides the winner of the election based on who got the most votes overall
         * weighted by first second and third choice votes
         * @return the name of the election winner
         */
        String findWinnerMostPoints() {
            // add all candidates to linked list
            LinkedList<Integer> candidateVotes = new LinkedList<Integer>();
            for (String candidate : ballot) {
                int first = firstVote.get(candidate) * 3;
                int second =  secondVote.get(candidate)* 2;
                int third = thirdVote.get(candidate);

                candidateVotes.add(first + second + third);
            }
            String biggestCandidate = "";
            int biggestCandVotes = 0;
            for (int i=0; i<candidateVotes.size(); i++) {
                if (candidateVotes.get(i) > biggestCandVotes) {
                    biggestCandidate = ballot.get(i);
                    biggestCandVotes = candidateVotes.get(i);
                }
            }
            return biggestCandidate;

            // --> search first vote hashmap == +3 points to LL cand votes
            // --> search second vote hashmap == +2 points to LL cand votes
            // --> search third vote hashmap == +1 points to LL cand votes
            // compare all candidates votes in linked list
            //return the candidates name that has the most votes
            // if tie return first name
        }




    }







