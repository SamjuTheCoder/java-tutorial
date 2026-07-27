package com.example.demo.services;

import com.example.demo.model.Akani;
import com.example.demo.repository.AkaniRepository;
import com.example.demo.request.AkaniRequest;
import org.springframework.stereotype.Service;

//@Service is a Spring Boot annotation. It tells Spring that a class is a service class that contains the application's business logic.
//When Spring Boot starts, it sees @Service and automatically creates an object (called a bean) of that class and manage it.
@Service
public class AkaniService {

    //repository interface
    //AkaniRepository: (i.e variable type) this repository interface handles database operation (e.g findAll(), save)
    //akaniRepository: (i.e variable name) It is the name you use to access the repository.
    private final AkaniRepository akaniRepository;

    //this section is a constructor injection
    //AkaniService is the constructor name
    //(AkaniRepository akaniRepository) is a parameter. It means the constructor expects AkaniRepository object to be passed in.
    //this.akaniRepository refers to the instance variable (field) declared in the class.
    //this.akaniRepository = akaniRepository; This line copies the repository passed into the constructor into the class field (instance variable).
public AkaniService (AkaniRepository akaniRepository) {
    this.akaniRepository = akaniRepository;
}

//this method saves record to db
//The whole line below is the method declaration. It tells Java about a method before you see what it does inside.
//Akani - This is the return type. It tells Java what the method will return after it finishes. In this case, it returns Akani object.
//saveAkani- This is the method name. It describes what the method does. Here, the name suggests:Save Akani information.
//(AkaniRequest akaniRequest) - //This is the parameter. It tells Java that the method needs one piece of information before it can run.
//The parameter consists of two parts:
//AkaniRequest (The type) - This is the class (or data type) of the object being passed into the method.
//akaniRequest (The variable name) - This is the name used inside the method to refer to the object.
    public Akani saveAkani(AkaniRequest akaniRequest) {


    //This line creates a new object from the Akani class.
        // Akani is the name of the class.
        //akani this is the variable name. It is used to store and refer to the object you create.
       //new is a Java keyword. It tells Java: Create a brand new object from the Akani class.
        //Without new, no object is created.
        //Akani() - This calls the constructor of the Akani class.
        //A constructor is a special method that runs automatically when an object is created.
    Akani akani = new Akani();


    //The first line takes the first name from one object and stores it in another object.
        akani.setFirstName(akaniRequest.getFirstName());
        akani.setLastName(akaniRequest.getLastName());
        akani.setGender(akaniRequest.getGender());
        akani.setDateOfBirth(akaniRequest.getDateOfBirth());
        akani.setEmail(akaniRequest.getEmail());
        akani.setPhoneNumber(akaniRequest.getPhoneNumber());
        akani.setAddress(akaniRequest.getAddress());
       akaniRepository.save(akani);
        return akani;

    }

}
