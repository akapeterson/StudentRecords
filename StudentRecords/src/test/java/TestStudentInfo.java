import org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestStudentInfo {

    StudentInformation studentInformation;

    @BeforeEach
    public void init() {
        studentInformation = new StudentInformation("Andrew", "Peterson", "Ennis", "Ghana", 7, 7, "G00", "Soft", "c++", 4, 0, 300);
    }
///////////////////////////////////////////////////////////////////////////////////////////
    @DisplayName("Test Year")
    @Test
    public void TestYear() {
        assertEquals(4, studentInformation.getYear());
    }
    @DisplayName("Test Wrong Year")
    @Test
    public void TestWYear() {
        Exception e = assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                StudentInformation studentInformation1 = new StudentInformation("Andrew", "Peterson", "Ennis", "Ghana", 7, 7, "G00", "Soft", "c++", 4, 0, 300);
                studentInformation1.setYear(0);
            }
        });
        assertEquals("Wrong Year", e.getMessage());
    }
///////////////////////////////////////////////////////////////////////////////////////////////////
    @DisplayName("Test First Name")
    @Test
    public void TestFirstName() {
        assertEquals("Andrew", studentInformation.getFirstName());
    }
    @DisplayName("Test Wrong First Name")
    @Test
    public void TestWFirstName() {
        Exception e = assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                StudentInformation studentInformation1 = new StudentInformation("Andrew", "Peterson", "Ennis", "Ghana", 7, 7, "G00", "Soft", "c++", 4, 0, 300);
                studentInformation1.setFirstName("Jo");
            }
        });
        assertEquals("Wrong First name! Too little characters", e.getMessage());
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////
    @DisplayName("Test Surname")
    @Test
    public void TestSurname() {
        assertEquals("Peterson", studentInformation.getSurName());
    }
    @DisplayName("Test Wrong Surname")
    @Test
    public void TestWSurname() {
        Exception e = assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                StudentInformation studentInformation1 = new StudentInformation("Andrew", "Peterson", "Ennis", "Ghana", 7, 7, "G00", "Soft", "c++", 4, 0, 300);
                studentInformation1.setSurName("PetersonAndrewPeterson");
            }
        });
        assertEquals("Wrong Surname too many characters", e.getMessage());
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////
    @DisplayName("Test Address")
    @Test
    public void TestAddress() {
        assertEquals("Ennis", studentInformation.getAddress());
    }
    @DisplayName("Test Wrong Address")
    @Test
    public void TestWAddress() {
        Exception e = assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                StudentInformation studentInformation1 = new StudentInformation("Andrew", "Peterson", "Ennis", "Ghana", 7, 7, "G00", "Soft", "c++", 4, 0, 300);
                studentInformation1.setAddress("Enni");
            }
        });
        assertEquals("Wrong Address too Little characters", e.getMessage());
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////
    @DisplayName("Test Nationality")
    @Test
    public void TestNation() {
        assertEquals("Ghana", studentInformation.getNation());
    }
    @DisplayName("Test Wrong Nationality")
    @Test
    public void TestWNation() {
        Exception e = assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                StudentInformation studentInformation1 = new StudentInformation("Andrew", "Peterson", "Ennis", "Ghana", 7, 7, "G00", "Soft", "c++", 4, 0, 300);
                studentInformation1.setNation("Gha");
            }
        });
        assertEquals("Wrong Nationality too Little characters", e.getMessage());
    }
    ///////////////////////////////////////////////////////////////////////////////////////////
    @DisplayName("Test Student Phone Number")
    @Test
    public void TestStudentPhone() {
        assertEquals(7, studentInformation.getStudentPhone());
    }
    @DisplayName("Test Wrong Student Phone")
    @Test
    public void TestWStudentPhone() {
        Exception e = assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                StudentInformation studentInformation1 = new StudentInformation("Andrew", "Peterson", "Ennis", "Ghana", 7, 7, "G00", "Soft", "c++", 4, 0, 300);
                studentInformation1.setStudentPhone(2);
            }
        });
        assertEquals("Wrong Number, phone number missing digits", e.getMessage());
    }
    ///////////////////////////////////////////////////////////////////////////////////////////
    @DisplayName("Test Emergency contact")
    @Test
    public void TestEmergency() {
        assertEquals(7, studentInformation.getStudentPhone());
    }
    @DisplayName("Test Wrong Emergency Contact")
    @Test
    public void TestWEmergency() {
        Exception e = assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                StudentInformation studentInformation1 = new StudentInformation("Andrew", "Peterson", "Ennis", "Ghana", 7, 0, "G00", "Soft", "c++", 4, 0, 300);
                studentInformation1.setEmergencyContact(2);
            }
        });
        assertEquals("Wrong Number, phone number missing digits", e.getMessage());
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////
    @DisplayName("Test Selected Course")
    @Test
    public void TestSelectedCourse() {
        assertEquals("Soft", studentInformation.getSelectedCourse());
    }
    @DisplayName("Test Wrong Selected Course")
    @Test
    public void TestWSelectedCourse() {
        Exception e = assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                StudentInformation studentInformation1 = new StudentInformation("Andrew", "Peterson", "Ennis", "Ghana", 7, 7, "G00", "Soft", "c++", 4, 0, 300);
                studentInformation1.setSelectedCourse("Sof");
            }
        });
        assertEquals("Wrong Selected Course too Little characters", e.getMessage());
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////
    @DisplayName("Test Subjects")
    @Test
    public void TestSubjects() {
        assertEquals("c++", studentInformation.getSubjects());
    }
    @DisplayName("Test Wrong Subjects")
    @Test
    public void TestWSubjects() {
        Exception e = assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                StudentInformation studentInformation1 = new StudentInformation("Andrew", "Peterson", "Ennis", "Ghana", 7, 7, "G00", "Soft", "c++", 4, 0, 300);
                studentInformation1.setSubjects("c+");
            }
        });
        assertEquals("Wrong Subject too Little characters", e.getMessage());
    }
}
