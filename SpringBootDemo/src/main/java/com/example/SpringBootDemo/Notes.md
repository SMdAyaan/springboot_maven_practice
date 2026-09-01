@SpringBootApplication comprises of three different Annotations and performs all their functions
(@SpringBootConfiguration, @EnableAutoConfiguration, @ComponentScan)

@AutoConfiguration - It is written on such classes, where spring boot initializes Beans Automatically
@EnableAutoConfiguration - enables Spring Boot to automatically configure your application based on the dependencies
present in the classpath and existing user-defined beans.

application.properties file: A central configuration file used to define application settings, environment-specific 
properties, and externalized configurations without modifying the source code.

@Value - used to inject values from properties files, system properties, environment variables, or SpEL expressions
into Spring-managed beans.
If a value is not defined in the properties files, we can mention a default value while writing @Value 