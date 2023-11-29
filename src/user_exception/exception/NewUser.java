package user_exception.exception;

public class NewUser {
    private String userName;
    private String userPass;
    public NewUser(String userName, String userPass, String userPassCopy) throws ShortException, LongException, PasswordMismatchException {
        setUserName(userName);
        setUserPass(userPass, userPassCopy);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) throws ShortException, LongException{
        if (userName.length()<4){
            throw new ShortException("Your user name is too short");
        }
        if (userName.length()>15){
            throw new LongException("Your user name is too long");
        }
        this.userName = userName;
    }

    public void setUserPass(String userPass, String userPassCopy) throws ShortException, PasswordMismatchException {
        if (userPass.length()<4){
            throw new ShortException("Your password is too short");
        }
        if (!userPass.equals(userPassCopy)){
            throw new PasswordMismatchException();
        }
        this.userPass = userPass;
    }


}
