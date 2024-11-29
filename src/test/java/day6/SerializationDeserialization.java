package day6;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SerializationDeserialization {

	
	//@Test
	void convertPOJO2Json() throws JsonProcessingException {
		
		
		//Created java obkect using pojo class 
		POJOPostRequest data = new POJOPostRequest();
		data.setName("Scott");
		data.setLocation("Mumbai");
		data.setPhone("12345");
		String coursesarr[]= {"C","C++"};
		
		data.setCourses(coursesarr);
		
		
		//Convert java object to json object ----------Serialization 
		ObjectMapper objmapper = new ObjectMapper();
		
		String jsondata= objmapper.writerWithDefaultPrettyPrinter().writeValueAsString(data);
		
		System.out.println(jsondata);

		
	}
	
	
	//json ---------Pojo 
	@Test
	void convertJson2Pojo() throws JsonMappingException, JsonProcessingException {
		
		String jsondata= "{\r\n"
				+ "				\"name\":\"Scoot\",\r\n"
				+ "				\"location\":\"Mumbai\",\r\n"
				+ "				\"phone\":\"12345\",\r\n"
				+ "				\"courses\":[\"C\",\"C++\"]\r\n"
				+ "		}";
		
		//Convert json object to POJO  object 
		
		ObjectMapper studobj = new ObjectMapper();
		POJOPostRequest stu=	studobj.readValue(jsondata,POJOPostRequest.class );
		
		
	System.out.println(stu.getName());
		stu.getLocation();
		//stu.getCourses();
		stu.getPhone();
		
		
		
	}
	
	
}
