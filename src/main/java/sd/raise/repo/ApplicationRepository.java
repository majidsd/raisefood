/**
 * 
 */
package sd.raise.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import sd.raise.model.Application;

/**
 * @author MaJiD
 *
 */
public interface ApplicationRepository extends JpaRepository<Application, Integer> {
	
	@Query("FROM Application where appId = ?1")
	public Application getApplicationByAppId(String appId);
}
