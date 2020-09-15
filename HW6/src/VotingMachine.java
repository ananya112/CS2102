import java.util.Scanner;

class VotingMachine {

    private ElectionData e;
    Scanner keyboard = new Scanner(System.in);
    protected VotingMachine(){
        this.e = new ElectionData();
    }

    /**
     * Checks to see if you voted twice for the same candidate or if you entered a
     * candidate that doesn't exist and throws an exception in these cases, prompting the user to vote again
     * @throws UnknownCandidateException if there is an unknown candidate
     * @throws DuplicateVotesException if there is a duplicate candidate
     **/

    private void promptScreen() {
        try{
            e.screen();
        } catch (DuplicateVotesException e) {
            System.out.println("You've already voted for this candidate. Vote again");
            this.promptScreen();
        } catch (UnknownCandidateException e) {
            System.out.println("The candidate you entered does not exist.Press y or Y if you want to add them to the ballot.");
            if(keyboard.next() == "y" || keyboard.next() == "Y"){
                this.addWriteIn();
            }
        }
    }

    /**
     * asks user to enter their vote of candidate and adds it to election data
     * @throws DuplicateVotesException if there is a duplicate candidate
     **/

    private void addWriteIn(){
        String candidate = keyboard.next();
        System.out.println("what is the new candidate name?");
        try{
            e.addCandidate(candidate);
        }
        catch(CandidateExistsException e){
            System.out.println("This candidate already exists");
        }

    }

}


