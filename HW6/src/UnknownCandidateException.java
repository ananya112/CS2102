class UnknownCandidateException extends Exception{

    private String candidate;

    protected UnknownCandidateException(String candidate){

        this.candidate = candidate;
    }

    /**
     * getter method for the UnknownCandidateException, which gets the unknown candidate
     * @return the name of the candidate
     */

    public String getCandidate(String candidate){
        return candidate;
    }
}
