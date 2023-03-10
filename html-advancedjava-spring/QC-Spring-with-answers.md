 # QC Questions on Spring
 
 - Describe the purpose of the Spring framework.
   - Spring is a powerful framework that allows us to jump right in to enterprise level application programming. Spring inverts control, helps us achieve loose coupling, and offers robust abstractions/solutions for common needs such as persistence and servlets.

 - What version of Spring are you comfortable working with? Do you know the latest major version released?
   - The latest major version is version 5, we are currently using spring boot 2.5.6 which includes spring core 5.3.12.

 - What is dependency injection?
   - This is a technique where an object receives other objects it depends on, in the most basic form using constructors and setters. 

 - What is inversion of control?
   - This is a paradigm where program execution and control is handed off to some framework, and our code is invoked by that framework. This inverts the traditional idea of our program beginning with the main method, foolowing our execution, and invoking library methods.

 - How is dependency injection achieved within the Spring framework?
   - Spring offers DI by providing the dependencies on demand. The dependencies are beans described to a BeanFactory (an IoC Container) with either XML files, or programatically. Spring will autowire these dependencies in as needed.

 - What is the primary IOC container in Spring?
   - BeanFactory, which was supplanted by a class that extends it: ApplicationContext. ApplicationContext also has been extended for more specific use, like WebAwareApplicationContext. There are others as well like AnnotationConfigApplicationContext.

 - What are some differences between the ApplicationContext and the BeanFactory in Spring?
   - ApplicationContext extends BeanFactory and contains additional features like messaging and event publication. Also BeanFactory is lazy and ApplicationContext is eager by default.

 - Are beans loaded eagerly or lazily within the ApplicationContext? How can you change this?
   - By default they are loaded eagerly. This behavior can be changed with the @Lazy annotation.

 - What are some ways that a bean registry can be provided to Spring?
   - We can supply bean descriptions with XML files, or by scanning for properly annotated classes.

 - What is component-scanning in Spring?
   - A component is a bean, and component scanning is a method of describing beans where Spring scans through specified packages of classes looking for properly annotated classes that describe beans.

 - What are the Spring stereotype annotations?
   - @Component, @Controller, @Repository, @Service, and @RestController

 - What is the difference between manual bean wiring and autowiring?
   - The @Autowired annotation is used to have Spring grab necessary dependencies from the IoC container and inject them. Manual wiring is requesting a bean by type or name yourself and assigning it to a reference.

 - What is the standard lifecycle of a bean within the ApplicationContext?
   - Instantiation, awareness, initialization (including custom init methods), post-init-processing, in-use, destruction (including custom destory methods), garbage collection.

 - What are the scopes of a Spring bean? What is the default?
   - Singleton and Prototype are the basic ones. There are also other used for specific ApplicationContexts, like request, session, and global session scopes.

 - What are the autowiring modes Spring uses to resolve autowired dependencies?
   - ByType, ByName, no(as in no autowiring), constructor, and autodetect. 

 - What are forms of dependency injection supported by Spring?
   - Constructor, Setter, field (field autowiring is a big no-no, don't do it.

 - If using Java-class configuration, what is the default name given to a bean? How can you change this?
   - The default name of a bean is the name of the method which retruns it. We can change the name with the @Qualifier annotation: `@Qualifier("myBeanName")`

 - If using component-scanning, what is the default name given to a bean? How can you change this?
   - The default name given is the class name with the first letter lowercased. We can change the default name by giving a new name as a string to the @Bean or stereotype annotations. `@Component("myNamedComponent")`

 - How can you provide a scalar or literal value for injection into the property of a Spring bean?
   - In XML config use the <property> tag with name and value attributes. 
   - In component scanning we use the @Value annotation: `@Value("Default String Value Here")`
   - In Java-class config you can inject the value into the constructor.

 - What is Spring MVC? How is it enabled for use within a Spring application?
   - MVC stands for Model View Controller. In a spring boot application we just include the "spring-boot-starter-web" dependency. Outside of spring boot we must have the necessary dependencies and we use the annotation @EnableWebMvc.

 - Describe the data flow of a request/response operation within a Spring MVC application
   - Request comes in to front controller, is dispatched to an appropriate controller which fetches the model requested, this bounces back through the front controller to a view template where the model data is woven into the UI view, this view object is then returned to the front controller, and the response is returned to the client.

 - List some Spring MVC annotations
   - @RestController, @Controller, @ResponseBody, @RequestBody, @PathVariable, @RequestParam, @RequestHeader, @RequestMapping, @GetMapping, @PostMapping, @PutMapping, @DeleteMapping

 - What is the difference between @RestController and @Controller?
   - @RestController implies both @Controller and @ResponseBody. @Controller is a stereotype annotation that marks a class as a bean for component scanning.

 - What is the difference between @RequestBody and @ResponseBody?
   - @RequestBody applies to a parameter object and tells Spring to map the serialized payload data onto that object. @ResponseBody applies to the return type of the method and tells Spring to serialize that object into some test representation like JSON.

 - What is the difference between @RequestParam and @PathVariable?
   - @RequestParam gets a value associated with a key from the request body, @PathVariable gets a value associated with a key in the URI.

 - What is the DispatcherServlet and what is it used for?
   - DispatcherServlet delegates requests to other servlets. It acts as a front controller.

 - What is an exception handler? How would you declare one for use within a controller?
   - Describes how the program should handle exceptions. We declare it with the use of @ExceptionHandler and give a specific exception class as an attribute, if this exception is thrown in any of the methods of the class it will invoke the annotated method.

 - How would you configure contextual sessions between Spring and Hibernate?
   - Prior to Spring 3.0 we would have used Spring's HibernateTemplate to manage sessions. Starting with 3.0 we can make use of Hibernate contextual sessions directly via the Hibernate SessionFactory.

 - What information is provided to the configuration of the DataSource bean within Spring ORM?
   - Datasource properties needed to connect, such as: URL, username, password, driver, dialect

 - What information is provided to the configuration of the SessionFactory bean within Spring ORM?
   - Hibernate properties, such as: generate-ddl, ddl-auto, enable_lazy_load_no_trans

 - What is the purpose of @Transactional? Where should this annotation be placed? How is its use enabled?
   - @Transactional is used to describe transaction propigation strategies. This should be placed on a class or method. To enable transaction management in Spring we use the @EnableTransactionManagement annotation, or the XML element: <tx:annotation-driven/>

 - What are transaction propagation levels in Spring ORM?
   - MANDATORY, NESTED, NEVER, NOT_SUPPORTED, REQUIRED, REQUIRES_NEW, SUPPORTS

 - What are some examples of JSR-303 (Bean Validator) annotations?
   - @AssertFalse, @AssertTrue, @DecimalMax, @DecimalMin, @Digits, @Future, @Past, @Max, @Min, @NotNull, @Pattern

 - What is the purpose of the RestTemplate class within Spring?
   - RestTemplate allows us to create a client that consumes a remote API inside our Spring application. This feature is depricated as of Spring version 5.

 - What is Spring Boot?
   - Spring boot is a part of the Spring suite which allows us to rapidly begin an enterprise level spring application by eshewing boilerplate configuration in favor of highly opinionated ready-to-go project foundation.

 - Why is Spring Boot said to be "opinionated"?
   - This means that Spring Boot is designed to be used in a specific way, and adhering to those opinions will allow us to fully leverage the benefits of this solution. The more we deviate from these opinions the more difficult it is to utilize the benefits of this solution.

 - What is the Spring Boot starter POM? Why is it useful?
   - is a boilerplate POM.xml file which includes the neseccary dependencies for maven to acquire in order to start our project.

 - What are some notable features in Spring Boot?
   - Pre built and configured SpringBootApplication ready to be run.
   - Spring Initializr which generates the boilerplate opinionated foundation project for us.
   - starter dependencies which include other necessary dependencies, starter-web, starter-data-jpa for instance.
   - Spring Boot Actuator - lets us access API endpoints that can provide info about our program or even invoke behaviors like shutdown.
   - Spring Boot DevTools - change certain features to make development easier (disable caching, automatic restarts)

 - What annotation is used to denote an application as a Spring Boot application? Where should this be placed?
   - @EnableAutoConfiguration, or @SpringBootApplication. These are placed on the configuration class (either the class the main method appears in for component scanning, or the class that defines beans for java-class configuration).

 - What other annotations are implied by @SpringBootApplication?
   - The @SpringBootApplication annotation is equivalent to using @Configuration, @EnableAutoConfiguration, and @ComponentScan with their default attributes. -Spring docs

 - What file formats does Spring Boot support for configuration?
   - .xml, yaml, and .properties to name a few.

 - What is Spring Data JPA?
   - This is Spring's persistence API, running Hibernate as the default JPA provider. 

 - What is a repository interface?
   - An interface we implement in order to expose CRUD functionality.

 - How does Spring Data JPA figure out how to query our data source if it uses interfaces with no explicitly defined implementations?
   - The interfaces are instantiated as beans thanks to the @Repository annotation, and these beans contain concrete implementations built by reflection/annotations.

 - What is the purpose of @Query within Spring Data JPA?
   - To mark a method as a query method which returns data from a datasource. We can provide the @Query annotation with JPQL or Native (SQL) queries

 - What are common interfaces which our custom data repository interfaces should extend?
   - JpaRepository, CrudRepository, SimpleJpaRepository, PagingAndSortingRepository

 - How would you go about testing a Spring MVC controller?
   - We can hit our endpoints with a client like postman, which has the ability to create and run test suites checking different responses from the API.

 - What is AOP?
   - Aspect Oriented Programming, a different way of designing applications where we separate out aspects based on their functionality as they address cross-cutting concerns. This allows for even more loosely coupled code.

 - What are cross-cutting concerns? Provide examples
   - A problem that needs solving throughout our application, not tied to any specific layer, class, or functionality. Security, logging, error/exception handling, data access, etc.

 - What is an aspect?
   - An aspect encapsulates advice. It is a class that contains the advice needed to solve cross-cutting concerns.

 - What is the difference between a join point and a pointcut?
   - A join point is the point in program execution at which the advice is needed, it is targetted by a point cut which advises the program at the join point.

 - What are some different types of pointcut designators?
   - Within, execution, target, this, @args, @Within, @Annotation, @Target

 - What is the difference between the this and target pointcut designators?
   - `This` targets a bean of the given type, `target` targets a proxy object of a given type.

 - What is the difference between the \* and .. wildcards in pointcut expressions?
   - `\*` is a wildcard for the method signature parts like access modifiers, and return types. `..` is the wildcard for 0 or more parameters.

 - What is aspect weaving?
   - The process at compile time where aspects and advice are "woven" or inlined into our class files.

 - What are some different types of aspect weaving?
   - Compile-time, Post-compile-time (binary weaving), load-time.

 - What type of aspect weaving is supported by Spring AOP?
   - Load time weaving where the IoC container proxies beans, and these proxies are woven with advice.

 - What is advice? List the types of advice supported by Spring AOP
   - In Java advice is always a method. Advice is the code we want to execute at some joinpoint, targetted by a pointcut.
   - @Before, @After, @AfterThrowing, @AfterReturning, @Around

 - What is considered to be the most powerful type of advice? Why?
   - @Around, because we can choose to not even invoke the advised method, and instead return or throw a result ourselves.

 - Can you prevent the execution of a join point when using before advice?
   - No. Only around does this, which is why @Around is considered the most powerful advice.

 - What is AspectJ? How is it enabled for use within a Spring application?
   - AspectJ is an Aspect Oriented Programming extension to the Java language. It is enabled in Spring with the @EnableAspectJAutoProxy annotation.
   
 - What is the JoinPoint argument used for? What is a ProceedingJoinPoint? When is it used?
   - JoinPoint is an object that holds information about the program state surrounding a join point. It stores information that may be useful when executing advice. ProceedingJoinPoint is similar and also contains the proceed() method which can be used with @Around advice type to choose to or not to proceed to the advised method.
