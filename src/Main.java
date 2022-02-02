import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int ageUser = askUserTheAge();
        String groupUser = insertUserInGroup(ageUser);
        answerWhichGroupGoesUser(ageUser,groupUser);
    }

    private static void answerWhichGroupGoesUser(int ageUser,String groupUser) {
        System.out.println("The user with age "+ageUser+" goes in the group: "+groupUser);
    }

    private static String insertUserInGroup(int ageUser) {
        return insertingUserInGroup(ageUser);
    }

    private static String insertingUserInGroup(int ageUser) {
        if(ageUser < 15){
            return "Group A";
        }
        return "Group B";
    }

    private static int askUserTheAge() {
        System.out.println("Write the user age");
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
}
