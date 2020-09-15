 class DuplicateVotesException extends Exception {

    private String candidate;

    protected DuplicateVotesException(String candidate){
        this.candidate = candidate;
    }

     /**
      * getter method for the DuplicateVotesException, which gets the duplicate candidate
      * @return the name of the candidate
      */

    public String getCandidate(String candidate){
        return candidate;
    }


}
