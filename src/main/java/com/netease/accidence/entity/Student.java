package com.netease.accidence.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "student")
public class Student {

private String name;

private int age;

private boolean sex; // true: 男 false: 女

private Date birthday;

private Map<String, Object> locations;

private Array skills;

private List<String> hobbies;

private Pet pet;

public String getName() {
    
    return name;
}

public void setName(String name) {
    
    this.name = name;
}

public int getAge() {
    
    return age;
}

public void setAge(int age) {
    
    this.age = age;
}

public boolean isSex() {
    
    return sex;
}

public void setSex(boolean sex) {
    
    this.sex = sex;
}

public Date getBirthday() {
    
    return birthday;
}

public void setBirthday(Date birthday) {
    
    this.birthday = birthday;
}

public Map<String, Object> getLocations() {
    
    return locations;
}

public void setLocations(Map<String, Object> locations) {
    
    this.locations = locations;
}

public Array getSkills() {
    
    return skills;
}

public void setSkills(Array skills) {
    
    this.skills = skills;
}

public List<String> getHobbies() {
    
    return hobbies;
}

public void setHobbies(List<String> hobbies) {
    
    this.hobbies = hobbies;
}

public Pet getPet() {
    
    return pet;
}

public void setPet(Pet pet) {
    
    this.pet = pet;
}

@Override
public String toString() {
    
    return "Student{" + "name='" + name + '\'' + ", age=" + age + ", sex=" + sex + ", birthday=" + birthday + ", " +
                   "locations=" + locations + ", skills=" + skills + ", hobbies=" + hobbies + ", pet=" + pet + '}';
}

}
