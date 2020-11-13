package com.chris.builder_test;

/**
 * <p>The test present a classic design pattern - Builder Pattern
 * Widely used in each popular java frameworks.
 * Usually, in order to make the construct process more clearly and avoid some parameter sequence related issue, we will using Builder pattern
 */
public class Person {
    private String name;
    private Integer age;
    private Integer height;
    private String color;
    private String sex;

    public Person(String name, Integer age, Integer height, String color, String sex) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.color = color;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return this.name + " is a " + this.age + " years old " + this.color + " race " + this.sex + " " + this.height +
        " cm tall";
    }

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

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    public static class PersonBuilder {
        private String name;
        private Integer age;
        private Integer height;
        private String color;
        private String sex;

        public PersonBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public PersonBuilder setHeight(Integer height) {
            this.height = height;
            return this;
        }

        public PersonBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public PersonBuilder setSex(String sex) {
            this.sex = sex;
            return this;
        }

        public Person build() {
            return new Person(name, age, height, color, sex);
        }
    }

    public static void main(String[] args) {
        Person person = Person.builder()
                .setName("Chris")
                .setAge(30)
                .setColor("Yellow")
                .setHeight(179)
                .setSex("male")
                .build();

        System.out.println(person);

    }
}
