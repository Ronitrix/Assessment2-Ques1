package com.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
/*@ComponentScan(basePackages="com.javaconfig")

*Since We are using @Bean annotation so we don't require any component scan or component
*/

public class VehicleConfig {
	
	
	
	  @Bean public Vehicle vehicle() { //@Bean annotation is meant to provide a spring bean. 
		                              //The type of the bean to provide will be the same type of the class/interface We define in the return method.
	  
	  return new Vehicle(); }
	 
	  
	  @Bean public Ferrari ferrari() { //@Bean annotation is meant to provide a spring bean. 
          //The type of the bean to provide will be the same type of the class/interface We define in the return method.

return new Ferrari(); 
}

}
