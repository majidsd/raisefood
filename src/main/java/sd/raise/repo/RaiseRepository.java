/**
 * 
 */
package sd.raise.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import sd.raise.model.Organization;
import sd.raise.model.Raise;
import sd.raise.model.User;
import sd.raise.util.RaiseStatus;

/**
 * @author MaJiD
 *
 */
public interface RaiseRepository extends JpaRepository<Raise, Long> {
	
	@Query("From Raise where createdBy = ?1 and status = ?2")
	public List<Raise> getUserRaisesByStatus(User createdBy, RaiseStatus status);
	
	@Query("From Raise where createdBy = ?1 and status != ?2")
	public List<Raise> getUserRaisesByNotStatus(User createdBy, RaiseStatus status);
	
	@Query("From Raise where createdBy = ?1")
	public List<Raise> getUserRaises(User createdBy);
	
	@Query("From Raise where organization =?1 and status = ?2")
	public List<Raise> getOrganizationRaiseByStatus(Organization organization, RaiseStatus status);
	
	@Query("From Raise where organization =?1 and status != ?2")
	public List<Raise> getOrganizationRaiseByNotStatus(Organization organization, RaiseStatus status);
	
	@Query("From Raise where organization =?1")
	public List<Raise> getOrganizationRaises(Organization organization);
	
	@Query("From Raise where status = ?1")
	public List<Raise> getRaiseByStatus(RaiseStatus status);
	
	@Query("From Raise where status != ?1")
	public List<Raise> getRaiseByNotStatus(RaiseStatus status);
	
	@Query("From Raise where pickUp = ?1")
	public List<Raise> getRaisesByPickUpUser(User pickUp);
	
}
