package pl.coderslab.tdd.tdd;

public class UserRepository {

    public User createUser(User user) {
        if(user.getName() == null) {
            return null;
        }
        if(user.getSurname() == null) {
            return null;
        }
        // Save user to database
        user.setId(1);
        return user;
    }

    public User editUser(User user) {
        // Saved to the database
        return user;
    }

    public void deleteById(int id) {
        // search in baza dupa id
        User user = new User("Vilau", "Ciprian");
        // delete in baza

    }

    public User getUserById(int id) {

        // fiindca utilizatorul cu id a fost sters.
        return null;

    }

}
