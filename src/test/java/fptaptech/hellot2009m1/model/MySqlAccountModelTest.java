package fptaptech.hellot2009m1.model;

import fptaptech.hellot2009m1.entity.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MySqlAccountModelTest {

    @Test
    void save(Account model) {
        Account account = new Account("Tien", "tien@gmail.com", "123", "Dang Van Tien", "0123456789", "07/05/1997");
        assertEquals(true, model.save(account));
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }

    @Test
    void findAll() {
    }

    @Test
    void findById() {
    }
}