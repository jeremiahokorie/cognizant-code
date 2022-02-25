package com.jerryit.cognizantchallenge;

import com.jerryit.cognizantchallenge.model.response.ApiResponse;
import com.jerryit.cognizantchallenge.persistent.repository.PlayerRepository;
import com.jerryit.cognizantchallenge.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CognizantChallengeApplication implements CommandLineRunner {

    @Autowired
    private PlayerRepository playerRepository;
    @Autowired
    private ApiService apiService;

    public static void main(String[] args) {
        SpringApplication.run(CognizantChallengeApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//            Player player = new Player("Jerry","Coding","Java","System.out.print","System.out.print");
//            playerRepository.save(player);
//
//            Player player2 = new Player("John","Coding","C#","System.out.print","System.out.print");
//            playerRepository.save(player2);
//
//            Player player3 = new Player("Fred","Coding","React","System.out.print","System.out.print");
//            playerRepository.save(player3);
//        String script = "public class Hello {\n" +
//                "    static String reverseString(String value) {\n" +
//                "        StringBuilder builder = new StringBuilder();\n" +
//                "        for (int i = value.length() - 1; i >= 0; i--) {\n" +
//                "            char c = value.charAt(i);\n" +
//                "            builder.append(c);\n" +
//                "            System.out.print(c);\n" +
//                "        }\n" +
//                "        System.out.println(\"Builder: \" + builder.toString());\n" +
//                "        return builder.toString();\n" +
//                "    }\n" +
//                "\n" +
//                "    public static void main(String[] args) {\n" +
//                "        reverseString(\"Excellence\");\n" +
//                "    }\n" +
//                "}";
//        String php = "<?php echo \"hello\"; ?>";
////        ApiResponse response = apiService.execute(script, "java");
//        ApiResponse responsephp = apiService.execute(php, "php");
//        System.out.println("responsephp::: " + responsephp.toString());
////        System.out.println("resp::: " + response.toString());

    }
}
