package singleresp;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(MockitoJUnitRunner.class)
class StudentCrudTest {
    StudentCrud studentCrud = new StudentCrud();
    @Test
    void registerStudent() {
        //Given

        Student alp = new Student("alp alp",12412512);
        //When
       String expected=studentCrud.registerStudent(alp);
        //Then
       assertEquals(expected,"success");
    }

    @Test
    void deleteStudentBestCase() {
        //Given
        Student alp = new Student("alp alp",12412512);
        //When
       String deneme =studentCrud.registerStudent(alp);
        String expected=studentCrud.deleteStudent(alp.getStudentNumber());
        //Then
        assertEquals(expected,"success");
    }
    @Test
    void deleteStudentWhenHasNoRegistry() {
        String expected=studentCrud.deleteStudent(1231241);
        //Then
        assertEquals(expected,"failed");
    }

    @Test
    void showStudent() {
        //Given
        Student alp = new Student("alp alp",12412512);
        //When
        studentCrud.registerStudent(alp);
        String expected=studentCrud.showStudent();
        //Then
        assertEquals(expected,"success");
    }
    @Test
    void showStudentWhenhasNoRegistry() {
        String expected=studentCrud.showStudent();
        //Then
        assertEquals(expected,"Empty");
    }
}