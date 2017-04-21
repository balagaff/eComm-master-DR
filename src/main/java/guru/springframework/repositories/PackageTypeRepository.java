package guru.springframework.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import guru.springframework.domain.PackageType;


//import com.example.repository.Role;
@Repository("PackageTypeRepository")
public interface PackageTypeRepository extends JpaRepository<PackageType, Integer>{
	 //PackageType findByPackagetype(String packagetype);
	 
	 //PackageType findBypackageType(String packagetype);


}
