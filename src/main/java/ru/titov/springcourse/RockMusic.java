package ru.titov.springcourse;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RockMusic implements Music {

    @Override
    public String getSong() {
        Random rand = new Random();
        int n = rand.nextInt(3);
        String[] arr = new String[]{"rockMusic1", "rockMusic2", "rockMusic3"};
        return arr[n];
    }
}
