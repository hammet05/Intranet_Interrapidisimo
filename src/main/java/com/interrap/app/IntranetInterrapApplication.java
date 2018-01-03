package com.interrap.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.interrap.app.DAO.ICargoDAO;
import com.interrap.app.model.cargos;

@SpringBootApplication
public class IntranetInterrapApplication {

	public static void main(String[] args) {
		//SpringApplication.run(IntranetInterrapApplication.class, args);
		
		ApplicationContext context =new ClassPathXmlApplicationContext("Spring-Module.xml");
		ICargoDAO cargoDAO = (ICargoDAO) context.getBean("ICargoDAO");
		cargos objCargo=new cargos();
		objCargo.Cargo="nadaista";
		cargoDAO.insert(objCargo);
		
		
	}
}
