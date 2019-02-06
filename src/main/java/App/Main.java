package App;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        SpringApplication.run(Main.class);
    }

    /*@Bean
    public CommandLineRunner demo(BuddyInfoRepository repository) {
        return (args) -> {
            //save a couple of addresses
            repository.save(new BuddyInfo("Travis","123-456"));
            repository.save(new BuddyInfo("Iain","546-352"));
            repository.save(new BuddyInfo("Josh","636-841"));
            repository.save(new BuddyInfo("Travis","987-654"));

            // fetch all addresses
            log.info("Customers found with findAll():");
            log.info("-------------------------------");
            for (BuddyInfo buddyInfo : repository.findAll()) {
                log.info(buddyInfo.toString());
            }
            log.info("");

            // fetch an individual customer by ID
            repository.findById(1L)
                    .ifPresent(customer -> {
                        log.info("Customer found with findById(1L):");
                        log.info("--------------------------------");
                        log.info(customer.toString());
                        log.info("");
                    });

            // fetch customers by last name
            log.info("Customer found with findByName('Travis'):");
            log.info("--------------------------------------------");
            repository.findByName("Travis").forEach(travis -> {
                log.info(travis.toString());
            });
            log.info("");
        };
    }*/
}
