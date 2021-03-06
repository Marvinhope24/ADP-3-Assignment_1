/*
SupportStaffRepositoryTest.java
Testing for SupportStaffRepositoryTest
Author: Tiffany Kiwiets (219322732)
 */

package za.ac.cput.Repository;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.Domain.Entity.SupportStaff;
import org.junit.jupiter.api.MethodOrderer;
import za.ac.cput.Factory.SupportStaffFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)

class SupportStaffRepositoryTest {
    private static SupportStaffRepository repository = SupportStaffRepository.getRepository();
    private static SupportStaff supportStaff = SupportStaffFactory.createSupportStaff ( 653214965,
            "Jonah",
            "Adams",
            03265645453,
            "None",
            "Matric",
            "Classroom cleaner");

    @Test
    void a_create() {
        SupportStaff created = repository.create(supportStaff);
        assertEquals(supportStaff.getSuppStaffID(), created.getSuppStaffID());
        System.out.println("Created: " + created);
    }

    @Test
    void b_read() {
        SupportStaff read = repository.read(supportStaff.getSuppStaffID());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_update() {
        SupportStaff update = new SupportStaff.Builder().copy(supportStaff).setSuppStaffID("549632599")
                .setAdminID(125696)
                .setSuppStaffName("Clayton")
                .setSuppStaffSurname("Nelvin")
                .setCellNumber(0244650015)
                .setImportHealthInfo("Allegic to nuts")
                .setQualification("Degree in social worker")
                .setTypeOfWork("Student counselor")
                .build();
        assertNotNull(repository.update(update));
        System.out.println("Update: " + update);
    }

    @Test
    void e_delete() {
        boolean success = repository.delete(supportStaff.getSuppStaffID());
        assertTrue(success);
        System.out.println("Deleted: " + success);
    }

    @Test
    void d_getAll() {
        System.out.println("Show all: ");
        System.out.println(repository.getAll());
    }
}