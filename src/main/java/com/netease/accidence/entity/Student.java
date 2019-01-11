package com.netease.accidence.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @ConfigurationProperties @Value
 * 注值                 批量注入                                  单个
 * 松散语法              支持                                     不支持
 * SpEL                不支持                                    支持
 * JSR303数据校验        支持                                     不支持
 * 注入复杂类型           支持                                     不支持
 *
 * 优先级：yml > properties > @Value
 */
@Component
@ConfigurationProperties(prefix = "student")
@Validated
public class Student {

@Email
@Value("sdfsdfd")
private String email;

@Value("jack-value")
private String name;

private int age;

private boolean sex; // true: 男 false: 女

private Date birthday;

private Map<String, Object> locations;

private String[] skills;

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

public void setSkills(String[] skills) {
    
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

public String getEmail() {
    
    return email;
}

public void setEmail(String email) {
    
    this.email = email;
}

public String[] getSkills() {
    
    return skills;
}

@Override
public String toString() {
    
    return "Student{" + "email='" + email + '\'' + ", name='" + name + '\'' + ", age=" + age + ", sex=" + sex + ", " +
                   "birthday=" + birthday + ", locations=" + locations + ", skills=" + Arrays.toString(skills) + ", " +
                   "hobbies=" + hobbies + ", pet=" + pet + '}';
}

public void setPet(Pet pet) {
    
    this.pet = pet;
}

}
