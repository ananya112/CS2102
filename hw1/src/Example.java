import static org.junit.Assert.*;
import org.junit.Test;

    class Examples {

    // example objects
    //example robotics
    RoboticsTeam teamSDA = new RoboticsTeam("San Dieguito Academy", "lifting arms", 15);
    RoboticsTeam teamLCC = new RoboticsTeam("La Costa Canyon", "flamethrower", 10);
    RoboticsTeam teamTP = new RoboticsTeam ("Torrey Pines", "nothing", 0);
    RoboticsTeam teamCCA = new RoboticsTeam ("Canyon Crest Academy", "trebuchet", 13);
    RoboticsTeam teamCHS = new RoboticsTeam ("Chemsford High School", "maneuverable shield", 15);

    //example rugby
    RugbyTeam teamA = new RugbyTeam("USA", "red and blue", true, 6, 0);
    RugbyTeam teamB = new RugbyTeam("USA", "red and blue", true, 11, 5);
    RugbyTeam teamC = new RugbyTeam("USA", "red and blue", true, 4, 2);
    RugbyTeam teamD = new RugbyTeam("USA", "red and blue", false, 10, 3);
    RugbyTeam teamE = new RugbyTeam("USA", "red and blue", false, 10, 6);
    RugbyTeam teamF = new RugbyTeam("USA", "red and blue", false, 10, 3);

    //rugby results
    IResult resultA = new RugbyResult((IContestant) teamA, teamB, 150, 100);
    IResult resultB = new RugbyResult((IContestant) teamA, teamB, 100, 150);
    IResult resultC = new RugbyResult((IContestant) teamA, teamB, 160, 100);
    IResult resultD = new RugbyResult((IContestant) teamA, teamB, 100, 160);
    IResult resultE = new RugbyResult((IContestant) teamA, teamB, 140, 120);


    //Robotics team examples
    IResult result1 = new RoboticsResult((IContestant) teamSDA, teamLCC,
                                    17, 5, true,
                                    17, 5, false );

    IResult result2 = new RoboticsResult((IContestant) teamSDA, teamLCC,
                                    16, 7, false,
                                    16, 7, true );

    IResult result3 = new RoboticsResult((IContestant) teamSDA, teamLCC,
                                    8, 9, true,
                                    8, 9, true );
    IResult result4 = new RoboticsResult((IContestant) teamSDA, teamLCC,
                                    5, 5, false,
                                    5, 5, false );
    IResult result5 = new RoboticsResult((IContestant) teamSDA, teamLCC,
                                    1, 1, false,
                                    1, 1, false );


    Match match1 = new Match(result1);
    Match match2 = new Match(result2);
    Match match3 = new Match(result3);
    Match match4 = new Match(result4);
    Match match5 = new Match(result5);
    Match matchA = new Match(resultA);
    Match matchB = new Match(resultB);
    Match matchC = new Match(resultC);
    Match matchD = new Match(resultD);
    Match matchE = new Match(resultE);


    @Test
    public void MatchAWinner (){
        assertTrue(matchA.winner() == teamA);
    }

    @Test
    public void MatchBWinner (){
        assertTrue(matchB.winner() == teamB);
    }

    @Test
    public void MatchCWinner (){
        assertEquals(matchC.winner(), null);
    }

    @Test
    public void MatchDWinner (){
        assertEquals(matchD.winner(), null);
    }

    @Test
    public void MatchEWinner (){
        assertTrue(matchE.winner() == teamA);
    }


    @Test
    public void Match1Winner (){
        assertTrue(match1.winner() == teamSDA);
    }

    @Test
    public void Match2Winner (){
        assertTrue(match2.winner() == teamLCC);
    }

    @Test
    public void Match3Winner (){
        assertTrue(match3.winner() == teamTP);
    }

    @Test
    public void Match4Winner (){
        assertTrue(match4.winner() == teamCCA);
    }

    @Test
    public void Match5WinnerNull (){
        assertEquals(match5.winner(),null);
    }


    // tests for problems 1-3

    @Test
    public void testIsValidResult1() {assertFalse(result1.isValid());}

    @Test
    public void testIsValidResult2() {assertTrue(result2.isValid());}

    @Test
    public void testIsValidResult3() {assertFalse(result3.isValid());}

    @Test
    public void testIsValidResult4() {assertFalse(result4.isValid());}

    @Test
    public void testResultAWinner() {
        assertEquals(resultA.getWinner(),teamA);
    }

    @Test
    public void testResultBWinner() {
        assertEquals(resultB.getWinner(),teamB);
    }

    //robotics
    @Test
    public void testResult1Winner() {
        assertEquals(result1.getWinner(),teamLCC);
    }

    @Test
    public void testResult2Winner() {
        assertEquals(result2.getWinner(),teamSDA);
    }

    //robotics
    @Test
    public void teamSDAExpectToBeatTeamLCC() {
        assertTrue(teamSDA.expectToBeat(teamLCC));
    }

    @Test
    public void teamLCCExpectToBeatTeamSDA() {
        assertFalse(teamLCC.expectToBeat(teamSDA));
    }

    @Test
    public void teamSDAExpectToBeatTeamCHS() {
        assertFalse(teamSDA.expectToBeat(teamCHS));
    }

    //rugby

    @Test
    public void teamAExpectToBeatTeamB() {
        assertFalse(teamA.expectToBeat(teamB));
    }

    @Test
    public void teamAExpectToBeatTeamC() {
        assertTrue(teamA.expectToBeat(teamC));
    }

    @Test
    public void teamCExpectToBeatTeamA() {
        assertFalse(teamC.expectToBeat(teamA));
    }

    @Test
    public void teamAExpectToBeatTeamD() {
        assertTrue(teamA.expectToBeat(teamD));
    }

    @Test
    public void teamDExpectToBeatTeamA() {
        assertFalse(teamD.expectToBeat(teamA));
    }

    @Test
    public void teamDExpectToBeatTeamF() {
        assertFalse(teamD.expectToBeat(teamF));
    }

    @Test
    public void teamDExpectToBeatTeamE() {
        assertTrue(teamD.expectToBeat(teamE));
    }

    @Test
    public void teamEExpectToBeatTeamD() {
        assertFalse(teamE.expectToBeat(teamD));
    }

}

