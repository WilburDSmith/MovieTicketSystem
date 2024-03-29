package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Register;


@Repository
public interface RegisterRepository extends JpaRepository<Register, String> {
    void deleteById(String id);
}

