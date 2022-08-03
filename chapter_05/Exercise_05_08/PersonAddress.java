package chapter_05;

public class PersonAddress
{
    private String firstName, lastName, email, telephone;

    /**
     * Precondition: the firstName must be initialized
     * Postcondition: returns the firstName if it initialized
     * otherwise it will return null
     */
    public String getFirstName()
    {
        return firstName;
    }


    /**
     * Precondition: the passed value must be not null
     * Postcondition: set the passed value to the firstName variable
     */
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    /**
     * Precondition: the lastName must be initialized
     * Postcondition: returns the lastName if it initialized
     * otherwise it will return null
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * Precondition: the passed value must be not null
     * Postcondition: set the passed value to the lastName variable
     */
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }


    /**
     * Precondition: the email must be initialized
     * Postcondition: returns the email if it initialized
     * otherwise it will return null
     */
    public String getEmail()
    {
        return email;
    }

    /**
     * Precondition: the passed value must be not null
     * Postcondition: set the passed value to the email variable
     */
    public void setEmail(String email)
    {
        this.email = email;
    }

    /**
     * Precondition: the telephone must be initialized
     * Postcondition: returns the email if it initialized
     * otherwise it will return null
     */
    public String getTelephone()
    {
        return telephone;
    }

    /**
     * Precondition: the passed value must be not null
     * Postcondition: set the passed value to the telephone variable
     */
    public void setTelephone(String telephone)
    {
        this.telephone = telephone;
    }


    /**
     * Precondition: the passed value must be not null
     * Postcondition: returns a boolean value indicates whether the
     * passed object equals the current object based on the
     * first and last name
     */
    public boolean equals(PersonAddress otherAddress)
    {
        return firstName.equals(otherAddress.getFirstName())
                && lastName.equals(otherAddress.getLastName());
    }
}
