package com.lti.mypack.service;

import java.util.List;



import com.lti.mypack.model.Application;


public interface ApplicationService {
	
	public List<Application> getApplication();
	public Application addApplication(Application application);
	public boolean deleteApp(int applicationid);
	public boolean updateApplication(Application application);

}
