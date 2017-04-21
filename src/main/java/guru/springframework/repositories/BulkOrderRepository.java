package guru.springframework.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//import org.springframework.data.jpa.repository.JpaRepository;

import guru.springframework.domain.BulkOrder;
import guru.springframework.domain.Customer;
import guru.springframework.domain.User;

//import com.example.model.User;
@Repository("BulkOrderRepository")
public interface BulkOrderRepository extends JpaRepository<BulkOrder, Long> {

}
