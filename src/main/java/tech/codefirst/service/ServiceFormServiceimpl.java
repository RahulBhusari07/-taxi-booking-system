package tech.codefirst.service;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import jakarta.transaction.Transactional;
import tech.codefirst.dao.ServiceFormCrud;
import tech.codefirst.model.ServiceForm;

@Service
public class ServiceFormServiceimpl implements ServiceFormService {
	
	@Autowired
	private ServiceFormCrud serviceFormCrud;
	

	public void setServiceFormCrud(ServiceFormCrud serviceFormCrud) {
		this.serviceFormCrud = serviceFormCrud;
	}


    @Transactional(rollbackOn = Exception.class)
	@Override
	public ServiceForm addService(ServiceForm serviceForm, MultipartFile multipartFile) throws Exception {
		
		ServiceForm  save=null;
		try {
			
             save = serviceFormCrud.save(serviceForm);
             if (save!=null) {
				 String path="D:\\MyProjects\\TaxiBooking\\src\\main\\resources\\static\\myserviceimg\\"+multipartFile.getOriginalFilename();
			   byte[] bytes = multipartFile.getBytes();
			   FileOutputStream fos = new FileOutputStream(path);
			   fos.write(bytes); 
			}
             
            
		} catch (Exception e) {
			save=null;
			throw e;
		}
		
	
		return  save;
	}


	@Override
	public List<ServiceForm> readAllServices() {
	
		return serviceFormCrud.findAll();
	}


	@Override
	public void deleteServiceFormService(int id) {
		serviceFormCrud.deleteById(id);
		
	}
	
	



}
