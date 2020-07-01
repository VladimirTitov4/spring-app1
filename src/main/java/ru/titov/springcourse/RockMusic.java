package ru.titov.springcourse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
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
