
public class User
{
    String email;
    String domainName;
    String userName;
    
    public void readEmail(String userEmail)
    {
         email = userEmail;
         int emailNo = email.indexOf("@");
         domainName = email.substring(emailNo + 1);
         userName = email.substring(0,emailNo);
    }
    
}
