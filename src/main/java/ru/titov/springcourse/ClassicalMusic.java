package ru.titov.springcourse;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        Random rand = new Random();
        int n = rand.nextInt(3);
        String[] arr = new String[]{"classic1", "classic2", "classic3"};
        return arr[n];
    }
}
