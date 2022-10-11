package za.ac.cput.donation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.donation.domain.ParcelRequest;

import java.util.List;

public interface ParcelRequestRepository extends JpaRepository<ParcelRequest, Long> {
    List<ParcelRequest> findAllByIsReceivedFalse();
    List<ParcelRequest> findAllByStudentId(long id);
}
