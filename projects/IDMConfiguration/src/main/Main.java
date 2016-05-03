package main;

import java.io.File;
import java.io.FileNotFoundException;
//import java.util.ArrayList;

import javax.xml.bind.JAXBException;

import com.evolveum.midpoint.model.client.ModelClientUtil;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		try {

			File file = new File("D:\\FIITBakalarka\\resources.xml");
			ModelClientUtil.instantiateJaxbContext();

			ModelClientUtil.unmarshallFile(file);
			//System.out.println(objects.size());

		  } catch (JAXBException e) {
			  e.printStackTrace();
		  }
		
	}

}
