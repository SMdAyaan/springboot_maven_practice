SPRING: 
BEANS LIFECYCLE:
1. IoC container starts
2. AppConfig brings the metadata of the @Component Class (Configuration)
3. Read Bean Definition
4. To Instantiate objects
5. Dependencies are injected(If we inject our dependencies through CONSTRUCTOR, 
then DI and Obj Creation will take place simultaneously)
6. Aware Interfaces are called(The Aware interface in Spring is a marker interface that allows beans to be notified 
of and interact with the Spring container through callback methods.)
7. Initialization callbacks. (There are 3 ways to receive said callbacks:InitializingBeans, init, 
Post Construct(Annotation-Based))
8. Bean is ready to use
Destruction phase starts:
9. Destruction Callbacks(There are 3 ways to receive said callbacks:DisposableBean, destroy method, 
PreDestroy (Annotation-Based))
10. Bean is destroyed

What if Initialization lazy???
The process happens till step 3. Step 4 will happen when Beans are used.

Prototype beans:
The beans are handed over to the client after step 7.(To avoid memory leak)

@PostConstruct is used to annotate a method that should be executed once immediately after a bean’s dependencies 
have been injected, allowing proper initialization before the bean is used.