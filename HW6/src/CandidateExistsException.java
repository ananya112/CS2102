class CandidateExistsException extends Exception{

    private String candidate;

    CandidateExistsException(String candidate){

        this.candidate = candidate;
    }


}
