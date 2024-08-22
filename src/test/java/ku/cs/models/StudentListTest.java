package ku.cs.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {

    @Test
    void testAddNewStudent() {
        StudentList room101 = new StudentList();
        room101.addNewStudent("6610450889","chanood");
        assertEquals("6610450889",room101.getStudents().get(0).getId());
    }

    @Test
    void findStudentById() {
        StudentList room101 = new StudentList();
        room101.addNewStudent("6610450889","chanood");
        assertEquals("chanood",room101.findStudentById("6610450889").getName());
    }

    @Test
    void giveScoreToId() {
        StudentList room101 = new StudentList();
        room101.addNewStudent("6610450889","chanood",10);
        room101.giveScoreToId("6610450889",10);
        assertEquals(20,room101.findStudentById("6610450889").getScore());
    }

    @Test
    void viewGradeOfId() {
        StudentList room101 = new StudentList();
        room101.addNewStudent("6610450889","chanood",85);
        assertEquals("A",room101.findStudentById("6610450889").grade());
    }

}