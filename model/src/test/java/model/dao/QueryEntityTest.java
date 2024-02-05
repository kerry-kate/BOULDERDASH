package model.dao;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueryEntityTest {

    @Test
    void getQueryInsert() {
        String Query = "INSERT INTO \"map\" (\"width\", \"height\")VALUES (40,22);";

        assertEquals(Query, QueryEntity.getQueryInsert() ," la valeur expectee est egale a celle entree");
    }

    @Test
    void getQuerySelectAll() {
        String Query = "SELECT * FROM \"map\";";

        assertEquals(Query, QueryEntity.getQuerySelectAll(),"la valeur expectee est egale a celle entree ");
    }
}