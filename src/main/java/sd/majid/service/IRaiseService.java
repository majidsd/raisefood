/**
 * 
 */
package sd.majid.service;

import sd.majid.dto.RaiseDto;
import sd.majid.model.Organization;
import sd.majid.model.Raise;
import sd.majid.model.User;
import sd.majid.response.ListResponse;
import sd.majid.response.ObjectResponse;

/**
 * @author majid
 *
 */
public interface IRaiseService {
	
	public ObjectResponse<RaiseDto> addRaise(Raise raise);
	public ObjectResponse<RaiseDto> inProgressRaise(Raise raise);
	public ObjectResponse<RaiseDto> assignRaise(Raise raise);
	public ObjectResponse<RaiseDto> completeRaise(Raise raise);
	public ObjectResponse<RaiseDto> cancelRaise(Raise raise);
	
	public ObjectResponse<RaiseDto> getRaiseById(Long id);
	public ObjectResponse<Raise> getRaiseObjectById(Long id);
	
	public ListResponse<RaiseDto> getAssignedRaisesByPickUpUser(User pickUpUser);
	
	public ListResponse<RaiseDto> getOrganizationInProgressRaises(Organization organization);
	public ListResponse<RaiseDto> getOrganizationDoneRaises(Organization organization);
	public ListResponse<RaiseDto> getOrganizationCanceledRaises(Organization organization);
	public ListResponse<RaiseDto> getOrganizationNotDoneRaises(Organization organization);
	public ListResponse<RaiseDto> getOrganizationAllRaises(Organization organization);
	
	public ListResponse<RaiseDto> getUserNewRaises(User user);
	public ListResponse<RaiseDto> getUserInProgressRaises(User user);
	public ListResponse<RaiseDto> getUserDoneRaises(User user);
	public ListResponse<RaiseDto> getUserCanceledRaises(User user);
	public ListResponse<RaiseDto> getUserNotDoneRaises(User user);
	public ListResponse<RaiseDto> getUserAllRaises(User user);
	
	public ListResponse<RaiseDto> getAllNewRaises();
	public ListResponse<RaiseDto> getAllInProgressRaises();
	public ListResponse<RaiseDto> getAllDoneRaises();
	public ListResponse<RaiseDto> getAllCanceledRaises();
	public ListResponse<RaiseDto> getAllNotDoneRaises();
	public ListResponse<RaiseDto> getAllRaises();
}
