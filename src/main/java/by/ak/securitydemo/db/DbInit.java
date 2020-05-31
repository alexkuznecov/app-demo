package by.ak.securitydemo.db;

import by.ak.securitydemo.model.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class DbInit implements CommandLineRunner {

    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;

    public DbInit(UserRepository userRepository,PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(String... args) {
        this.userRepository.deleteAll();

        User admin = new User("admin", passwordEncoder.encode("admin1"), "ADMIN", "ACCESS_MOVIES,ACCESS_TITLES");
        User alex = new User("alex", passwordEncoder.encode("alex1"), "USER", "ACCESS_TITLES");
        User ccreat = new User("ccreat", passwordEncoder.encode("ccreat1"), "CONTENT", "ACCESS_MOVIES");

        List<User> users = Arrays.asList(admin, alex, ccreat);

        this.userRepository.saveAll(users);
    }
}
