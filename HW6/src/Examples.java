import org.junit.Test;
import static org.junit.Assert.*;

public class Examples {
    // method to set up a ballot and cast votes

    ElectionData Setup1 () {

        ElectionData ED = new ElectionData();

        // put candidates on the ballot
        try {
            ED.addCandidate("gompei");
            ED.addCandidate("husky");
            ED.addCandidate("ziggy");

        } catch (CandidateExistsException e) {}

        // cast votes
        try {
            ED.processVote("gompei", "husky", "ziggy");
            ED.processVote("gompei", "ziggy", "husky");
            ED.processVote("husky", "gompei", "ziggy");

        } catch (UnknownCandidateException | DuplicateVotesException e) {}
        return(ED);
    }

    ElectionData Setup2 () {

        ElectionData ED = new ElectionData();

        // put candidates on the ballot
        try {

            ED.addCandidate("gompei");
            ED.addCandidate("husky");
            ED.addCandidate("ziggy");

        } catch (CandidateExistsException e) {}

        // cast votes

        try {

            ED.processVote("gompei", "husky", "ziggy");
            ED.processVote("gompei", "husky", "ziggy");
            ED.processVote("husky", "gompei", "ziggy");
            ED.processVote("husky", "gompei", "ziggy");

        } catch (UnknownCandidateException | DuplicateVotesException e) {}

        return(ED);

    }

    ElectionData Setup3 () {

        ElectionData ED = new ElectionData();

        // put candidates on the ballot
        try {

            ED.addCandidate("gompei");
            ED.addCandidate("husky");
            ED.addCandidate("ziggy");

        } catch (CandidateExistsException e) {}

        // cast votes

        try {

            ED.processVote("gompei", "husky", "ziggy");
            ED.processVote("husky", "gompei", "ziggy");
            ED.processVote("ziggy", "gompei", "husky");

        } catch (UnknownCandidateException | DuplicateVotesException e) {}

        return(ED);

    }


    @Test
    public void addCandidateTest() throws CandidateExistsException {
        Setup1().addCandidate("Liv Bell");
    }
    @Test
    public void candidateExistsTest() throws CandidateExistsException {
        try {
            Setup1().addCandidate("husky");
            fail();
        } catch (CandidateExistsException e) {}
    }
    @Test
    public void processVoteTest() throws DuplicateVotesException, UnknownCandidateException {
        Setup1().processVote("husky","ziggy","gompei");
    }
    @Test
    public void duplicateVoteTest() throws DuplicateVotesException, UnknownCandidateException {
        try {
            Setup1().processVote("husky", "husky", "gompei");
            fail();
        } catch (DuplicateVotesException e) {}
    }
    @Test
    public void unknownCandidateTest() throws DuplicateVotesException, UnknownCandidateException {
        try {
            Setup1().processVote("Husky", "Liv Bell", "gompei");
            fail();
        } catch (UnknownCandidateException e) {}
    }

    @Test
    public void findWinnerMostFirstVotesTest(){
        assertEquals("gompei",Setup1().findWinnerMostFirstVotes());
    }
    @Test
    public void findWinnerMostPointsTest(){
        Setup1().findWinnerMostPoints();
    }

    @Test
    public void RunoffRequired3Test(){
        assertEquals("ziggy",Setup3().findWinnerMostFirstVotes());
    }

    @Test
    public void WinnerMostPointsTest(){
        assertEquals("gompei",Setup1().findWinnerMostPoints());
    }

    @Test
    public void findTiedWinnerMostPoints2Test() throws DuplicateVotesException, UnknownCandidateException {
        assertEquals("ziggy",Setup2().findWinnerMostPoints());
    }




}






