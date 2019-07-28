package com.example.demo.com.example.demo.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.List;
@PropertySource(value = {"classpath:person.properties"})
@Component
@ConfigurationProperties(prefix = "person")
@Validated
public class Person {
    private String name ;
    private int age ;
    private  Dog dog ;
    private List<String> list ;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Dog getDog() {
        return dog;
    }

    public List<String> getList() {
        return list;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dog=" + dog +
                ", list=" + list +
                '}';
    }
}
