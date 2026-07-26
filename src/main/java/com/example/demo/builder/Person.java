package com.example.demo.controller;

public class Person {
    private final String name;
    private final Integer age;
    private Person(PersonBuilder personBuilder){
        this.name=personBuilder.name;
        this.age=personBuilder.age;
    }

    public static void main(String[] args) {
        Person person = new PersonBuilder().setName("Vikram").setAge(32).build();
        System.out.println(person);
        Person person1 =new PersonBuilder().setName("Vikram").build();
        System.out.println(person1);
    }
    public static class PersonBuilder{
        private  String name;
        private  Integer age;

        public Integer getAge() {
            return age;
        }

        public PersonBuilder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public String getName() {
            return name;
        }

        public PersonBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public Person build(){
            return new Person(this);
        }

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
