package pl.coderslab.tdd.tdd;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserRepositoryTest {

    UserRepository userRepository = new UserRepository();
    // RED GREEN REFACTOR
    @Test
    public void createUserTest() {
        User utilizator = userRepository.createUser(new User("Vilau", "Ciprian"));
        assertNotEquals(0, utilizator.getId());
    }

    @Test
    public void editUserTest() {
        // Utilizatorul cu id 1
        User utilizator = new User("Vilau", "Ciprian");
        utilizator.setId(1);

        User temp = new User("Vilau", "Ciprian");
        temp.setName("Edited");

        // Schimb numele
        User editedUtilizator = userRepository.editUser(temp);

        // Ma astept ca numele sa fi fost schimbat
        assertNotEquals(utilizator.getName(), editedUtilizator.getName());
    }

    @Test
    public void deleteUser() {
        int id = 1;
        userRepository.deleteById(id);

        // search by id
        User sters = userRepository.getUserById(id);
        assertNull(sters);

    }

}