package com.example.springcore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {
    @Test
    void testDatabase() {
        var database1 = Database.getInstance();
        var database2 = Database.getInstance();

        assertSame(database1, database2);
    }
}
