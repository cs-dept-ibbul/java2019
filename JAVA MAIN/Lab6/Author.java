
/**
 * Write a description of class Arthur here.
 *
 * @author ( Umar Jibrin Ndajiya)
 * @version (a version number or a date)
 */
public class Author
{
    // instance variables - replace the example below with your own
    private String name, email;
    private char gender;

    /**
     * Constructor for objects of class Arthur
     */
    public Author(String name, String email, char gender)
    {
        this.name=name;
        this.email=email;
        this.gender=gender;
    }
    public String getName()
    {
        return name;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email=email;
    }
    public char getGender()
    {
        return gender;
    }

    public String toString()
    {
        // put your code here
        return "\n"+getName()+" ("+getGender()+") at "+getEmail();
    }
}
