import java.util.List;

class User {
    String username;
    String password;
    String email;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}

public class SILab2 {

    public boolean function (User user, List<String> allUsers) { //1
        String specialCharacters="!#$%&'()*+,-./:;<=>?@[]^_`{|}"; //2
        if (user!=null) { //3
            if (user.getUsername()!=null && user.getPassword()!=null) { //4
                String password = user.getPassword(); //5
                String passwordLower = password.toLowerCase(); //6
                if (!passwordLower.contains(user.getUsername().toLowerCase()) && password.length()>=8) { //7
                    boolean digit = false, upper = false, special = false; //8
                    for (int i=0;i<password.length();i++) { //9
                        if (Character.isDigit(password.charAt(i))) //10
                            digit = true; //11
                        if (Character.isUpperCase(password.charAt(i))) //12
                            upper = true; //13
                        if (specialCharacters.contains(String.valueOf(password.charAt(i)))) //14
                            special = true; //15
                    }
                    if (digit && upper && special) //17
                        return true; //18
                }
            }
        }
        return false; //22
    } //23
}