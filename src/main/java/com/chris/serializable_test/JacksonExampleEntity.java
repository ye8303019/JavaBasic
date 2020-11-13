package com.chris.serializable_test;

/**
 * Created by ye830 on 10/15/2018.
 */
public class JacksonExampleEntity {

    public JacksonExampleEntity(){

    }

    public JacksonExampleEntity(String name, Integer age, JacksonNestExampleEntity jacksonNestExampleEntity){
        this.age = age;
        this.name = name;
        this.jacksonNestExampleEntity = jacksonNestExampleEntity;
    }

    private String name;
    private Integer age;
    private JacksonNestExampleEntity jacksonNestExampleEntity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public JacksonNestExampleEntity getJacksonNestExampleEntity() {
        return jacksonNestExampleEntity;
    }

    public void setJacksonNestExampleEntity(JacksonNestExampleEntity jacksonNestExampleEntity) {
        this.jacksonNestExampleEntity = jacksonNestExampleEntity;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.name).append(" ").append(this.age).append(" ").append(this.jacksonNestExampleEntity.getSex());
        return sb.toString();
    }
}
