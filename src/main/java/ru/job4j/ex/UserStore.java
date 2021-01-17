package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User newbye = new User("noname", false);
        for (int index = 0; index < users.length; index++) {
            if (users[index].equals(login)) {
                newbye = users[index];
                break;
            }
            if (newbye.getUsername().equals("noname")) {
                throw new UserNotFoundException("User not found");
            }
        }
            return newbye;

    }

        public static boolean validate (User user) throws UserInvalidException {
            if (!user.isValid() || user.getUsername().length() < 3) {
                throw new UserInvalidException ("User not valid");
            }
            return false;
        }

        public static void main (String[]args) {
        try {
            User[] users = {
                    new User("Petr Arsentev", true)
            };
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException ea) {
            ea.printStackTrace();
        }  catch (UserNotFoundException e) {
            e.printStackTrace();
        }
    }
}
