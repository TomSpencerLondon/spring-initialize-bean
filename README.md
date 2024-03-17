# Question

Spring allows specific operator to be performed after the bean is initialized and before the
bean destroyed.  Review the following sample Bean that implements init methods and override afterPropertiesSet.

```java


public class AdafaceBean implements InitiaingBean {

    public AdafaceBean() {
        System.out.println("A");
    }

    public void initialize() {
        System.out.println("B");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("C");
    }
}

```
Here's the bean definition added to the configuration file:
<bean class="AdafaceBean" init-method="initialize"></bean>
What does the code print when the Spring Container is started ?

### Notes
- I used @Bean to create the Bean
This is the output:
```bash
2024-03-17T13:55:09.012Z  INFO 10547 --- [demo] [           main] DemoApplication         : Starting DemoApplication using Java 21.0.2 with PID 10547 (/Users/tspencer/Desktop/demo/target/classes started by tspencer in /Users/tspencer/Desktop/demo)
2024-03-17T13:55:09.015Z  INFO 10547 --- [demo] [           main] DemoApplication         : No active profile set, falling back to 1 default profile: "default"
A
C
2024-03-17T13:55:09.651Z  INFO 10547 --- [demo] [           main] DemoApplication         : Started DemoApplication in 1.025 seconds (process running for 6.81)
```