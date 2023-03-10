import javax.swing.*;

public class Footballer {
    private String name;
    private Integer role;
    private int goals;
    private Integer birthDay;
    private Integer shirt;
    public static final int GOALHEEPER = 1;
    public static final int DEFFNER = 2;
    public static final int MIDFIELDER = 3;
    public static final int STRIKER = 4;
    public static final int MIN_BIRTH_YEARS = 20;
    public static final int MAX_BIRTH_YEARS = 100;
    public static final int MIN_SHIRT_NUM = 100;
    public static final int  MAX_SHIRT_NUM= 100;


    public Footballer(String name, Integer role, Integer birthDay) {
        this.name = name;
        this.role = role;
        if (this.isValidRole(role)) {
            this.role = role;
        } else {
            this.role = UNKNOWN;

        }
        this.goals = 0;
        if (this.isValibBirthday(birthDay)){
            this.birthDay = birthDay;
        }
        i

        private boolean isValidRole (Integer role){
            boolean valid = false;
            if (role == GOALHEEPER || role == DEFFNER || role == MIDFIELDER || role == STRIKER) {
                valid = true;

            }
            return valid;

        }



    }
    private boolean isValibBirthday(Integer birthDay){
        boolean valid = false;
        if (birthDay)
    }
    {

    }
    public String toString(){
        String output = "";
        output +="Name" + this.name + "/n";
        output += "Scored"
    }
    {

    }

}
