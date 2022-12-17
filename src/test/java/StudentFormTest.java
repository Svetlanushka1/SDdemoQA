
import models.Student;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.xml.sax.Locator;

public class StudentFormTest extends TestBase{

        @BeforeMethod
        public void preCondition(){
            app.studentForm().moveToFormsPage();
            app.studentForm().clickOnPracticeFormButton();
        }

        @Test
        public void studentFormTest(){


            Student student = Student.builder()
                    .firstName("John")
                    .lastName("Dow")
                    .email("john@mail.com")
                    .gender("Male")
                    .phone("12121234567")
                    .birthday("30 June 2000")
                    .subject("Math")
                    .hobbies("Sport")
                    .address("Tel Aviv")
                    .state("NCR")
                    .city("Gurgaon")
                        .build();


            app.studentForm().fillStudentForm(student);

        }
    }

