/**
 * This Person class represents a person using their first and last name, birthday, ssn and number of siblings.
 * It allows users to access and modify the first and last name of a person, access their birthday and siblings, and add siblings as a person.
 * @author Lily You
 * @version 1
 */

import java.util.Arrays;
public class Person{
    //instance variables
    private String firstname;
    private String lastname;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private String ssn;
    private int numberOfSiblings;
    private Person[] siblings;

    /**
     * Constructs a new Person object with the variables firstname, lastname, birthDay, birthMonth, birthYear and ssn.
     * As well as initializes the variables numberOfSiblings as 0 and siblings as an empty array.
     */
    public Person(String firstname, String lastname, int birthDay, int birthMonth, int birthYear, String ssn){
        this.numberOfSiblings = 0;
        this.siblings = new Person[0];
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.ssn = ssn;
    }

    /**
     * Gets the first name of the person
     * @return the first name of the person as a String
     */
    public String getFirstname(){
        return this.firstname;
    }

    /**
     * Gets the last name of the person
     * @return the last name of the person as a String
     */
    public String getLastname(){
        return this.lastname;
    }

    /**
     * Sets the first name of the person
     * @param firstname String - the new first name of the person
     */
    public void setFirstname(String firstname){
        this.firstname = firstname;
    }

    /**
     * Sets the last name of the person
     * @param lastname String - the new last name of the person
     */
    public void setLastname(String lastname){
        this.lastname = lastname;
    }

    /**
     * Gets the birthday of the person
     * @return the birthday of the person as a String in the format "day/month/year"
     */
    public String getBirthday(){
        return this.birthDay + "/" + this.birthMonth + "/" + this.birthYear;
    }

    /**
     * Adds a sibling to this person. Organized by adding the most recent person to the end of the array.
     * Counts number of siblings by incrementing numberOfSiblings by one.
     * @param person Person object - the person being added as a sibling
     */
    public void addSibling(Person person){
        Person[] moreSiblings = Arrays.copyOf(this.siblings, this.siblings.length + 1);
        moreSiblings[moreSiblings.length -1] = person;
        this.siblings = moreSiblings;
        numberOfSiblings++;
    }

    /**
     * Gets the array of this person's siblings
     * @return an array of this person's siblings, each as a Person object
     */
    public Person[] getSiblings(){
        return this.siblings;
    }

}