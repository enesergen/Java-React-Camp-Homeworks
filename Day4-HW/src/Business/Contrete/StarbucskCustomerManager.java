package Business.Contrete;

import Business.Abstract.BaseCustomerManager;
import Business.Abstract.PersonCheckService;
import Entity.Customer;


public class StarbucskCustomerManager extends BaseCustomerManager  {
	PersonCheckService personCheckService;
	
	public StarbucskCustomerManager(PersonCheckService personCheckService) {
		this.personCheckService=personCheckService;
		 
	}
	
	public void save(Customer customer) {
		if(personCheckService.checkperson(customer)) {
			super.save(customer);
		}
	}

	

}
