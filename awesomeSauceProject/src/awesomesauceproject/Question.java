// Eric Donner
// 2024/05/14
// Question Class

package awesomesauceproject;

public class Question {
    
    // ATTRIBUTES
    protected String question; // the question
    protected String possibleAnswer1; // a possible answer that user can choose
    protected String possibleAnswer2; // a possible answer that user can choose
    protected String possibleAnswer3; // a possible answer that user can choose
    protected String possibleAnswer4; // a possible answer that user can choose
    protected int rightAnswer; // the number of the right answer
    
    // CONSTRUCTOR
    
    /**
     * a blank question constructor
     */
    public Question() {
        this.question = "";
        this.possibleAnswer1 = "";
        this.possibleAnswer2 = "";
        this.possibleAnswer3 = "";
        this.possibleAnswer4 = "";
        this.rightAnswer = 0;
    }
    
    /**
     * constructor to instantiate a question object
     * @param question - the question
     * @param possibleAnswer1 - a possible answer
     * @param possibleAnswer2 - a possible answer
     * @param possibleAnswer3 - a possible answer
     * @param possibleAnswer4 - a possible answer
     * @param rightAnswer - the int location of the right answer
     */
    public Question(String question, String possibleAnswer1, String possibleAnswer2, String possibleAnswer3, String possibleAnswer4, int rightAnswer) {
        this.question = question; // setting the question variable
        this.possibleAnswer1 = possibleAnswer1; // setting a choice
        this.possibleAnswer2 = possibleAnswer2; // setting a choice
        this.possibleAnswer3 = possibleAnswer3; // setting a choice
        this.possibleAnswer4 = possibleAnswer4; // setting a choice
        this.rightAnswer = rightAnswer; // setting the right answer
    }
    
    // BEHAVIOUR
    /**
     * @return - gets and returns the question
     */
    public String getQuestion() {
        return this.question; // return the question
    }
    
    /**
     * change the question to a new one
     * @param newQuestion - the new question
     */
    public void setQuestion(String newQuestion) {
        this.question = newQuestion; // setting the new question
    }
    
    /**
     * get a possible answer to the question
     * @param answerNum - answer number
     * @return - returns the possible answer
     */
    public String getAnswer(int answerNum) {
        if (answerNum == 1) { // if the entered number is 1
            return this.possibleAnswer1; // return the first possible answer
        } else if (answerNum == 2) { // if the entered number is 2
            return this.possibleAnswer2; // return the second possible answer
        } else if (answerNum == 3) { // if the entered number is 3
            return this.possibleAnswer3; // return the third possible answer
        } else if (answerNum == 4) { // if the entered number is 4
            return this.possibleAnswer4; // return the fourth possible answer
        } else { // if the number is not either 1, 2, 3 or 4
            return null; // return null
        }
    }
    
    /**
     * change a possible answer for a question object
     * @param answerNum - the number of the possible answer
     * @param newAnswer - the new answer
     * @return - returns whether the change was successful
     */
    public boolean setAnswer(int answerNum, String newAnswer) {
        if (answerNum > 4 || answerNum < 1) { // number must be 1, 2, 3 or 4
            return false; // if not, return false for failure
        } else if (answerNum == 1) { // if entered number is 1
            this.possibleAnswer1 = newAnswer; // change the possible answer
            return true; // return true for success
        } else if (answerNum == 2) { // if entered number is 2
            this.possibleAnswer2 = newAnswer; // change the possible answer
            return true; // return true for success
        } else if (answerNum == 3) { // if entered number is 3
            this.possibleAnswer3 = newAnswer; // change the possible answer
            return true; // return true for success
        } else if (answerNum == 4) { // if entered number is 4
            this.possibleAnswer4 = newAnswer; // change the possible answer
            return true; // return true for success
        }
        return false;
    }
    
    /**
     * @return - get and return the right answer
     */
    public int getRightAnswer() {
        return this.rightAnswer;
    }
    
    /**
     * change the right answer
     * @param num - the new right answer
     */
    public void setRightAnswer(int num) {
        this.rightAnswer = num;
    }
    
    /**
     * returns a question in a string format
     * @return - the returned question in string format
     */
    public String toString() {
        return "Question: " + this.question + "\n1. " + this.possibleAnswer1 + "\n2. " + this.possibleAnswer2 + "\n3. " + this.possibleAnswer3 + "\n4. " + this.possibleAnswer4 + "\nAnswer: " + this.rightAnswer;
    }
}