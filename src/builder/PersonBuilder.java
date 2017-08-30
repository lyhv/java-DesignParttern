package builder;

public class PersonBuilder {
   public static class Builder{
	   Person person;
	   public Builder(){
		   person = new Person();
	   }
	   public Builder setName(String name){
		   person.setName(name);
		   return this;
	   }
	   public Builder setOld(int old){
		   person.setOld(old);
		   return this;
	   }
	   public Builder setHouse(String house){
		   person.setHouse(house);
		   return this;
	   }
	   public Person build(){
		   return person;
	   }
   }

}
