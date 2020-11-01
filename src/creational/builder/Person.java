package creational.builder;

class Person
{
    String firstName;
    String lastName;
    int age;
    String location;
    String job;
    
    private Person(PersonBuilder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.location = builder.location;
        this.job=builder.job;
    }
    
    @Override
    public String toString()
    {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", location='" + location + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
    
    public static class PersonBuilder{
        private String firstName;
        private String lastName;
        private int age;
        private String location;
        private String job;
        
        public PersonBuilder(String firstName, int age){
            this.firstName = firstName;
            this.age = age;
        }
        
        public PersonBuilder setLastName(String lastName){
            this.lastName = lastName;
            return this;
        }
        
        public PersonBuilder setLocation(String location){
            this.location = location;
            return this;
        }
        
        public PersonBuilder setJob(String job){
            this.job = job;
            return this;
        }
        
        public Person build(){
            return new Person(this);
        }
        
    }
}
