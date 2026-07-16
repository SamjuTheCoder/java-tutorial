package com.example.demo.services;

import com.example.demo.model.StudentScholarship;
import com.example.demo.request.StudentScholarshipRequest;
import com.example.demo.repository.StudentScholarshipRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentScholarshipService {

    //user repository interface
    private final StudentScholarshipRepository studentScholarshipRepository;

    //constructor injection
    public StudentScholarshipService(StudentScholarshipRepository studentScholarshipRepository) {
        this.studentScholarshipRepository = studentScholarshipRepository;
    }

    //save record to db
    public StudentScholarship saveStudentScholarship(StudentScholarshipRequest studentScholarshipRequest) {

        StudentScholarship studentScholarship = new StudentScholarship();
        studentScholarship.setFirstName(studentScholarshipRequest.getFirstName());
        studentScholarship.setLastName(studentScholarshipRequest.getLastName());
        studentScholarship.setGender(studentScholarshipRequest.getGender());
        studentScholarship.setDateOfBirth(studentScholarshipRequest.getDateOfBirth());
        studentScholarship.setEmail(studentScholarshipRequest.getEmail());
        studentScholarship.setPhoneNumber(studentScholarshipRequest.getPhoneNumber());
        studentScholarship.setNationality(studentScholarshipRequest.getNationality());
        studentScholarship.setState(studentScholarshipRequest.getState());
        studentScholarship.setAddress(studentScholarshipRequest.getAddress());
        studentScholarship.setSchoolName(studentScholarshipRequest.getSchoolName());
        studentScholarship.setDepartment(studentScholarshipRequest.getDepartment());
        studentScholarship.setCourse(studentScholarshipRequest.getCourse());
        studentScholarship.setStudentId(studentScholarshipRequest.getStudentId());
        studentScholarship.setCGPA(studentScholarshipRequest.getCGPA());
        studentScholarship.setScholarshipType(studentScholarshipRequest.getScholarshipType());
        studentScholarship.setReason(studentScholarshipRequest.getReason());
        studentScholarship.setPassport(studentScholarshipRequest.getPassport());
        studentScholarship.setAdmissionLetter(studentScholarshipRequest.getAdmissionLetter());
        studentScholarship.setSchoolIdCard(studentScholarshipRequest.getSchoolIdCard());
        studentScholarship.setStatus(studentScholarshipRequest.getStatus());
        studentScholarship.setCreatedDate(studentScholarshipRequest.getCreatedDate());
        studentScholarshipRepository.save(studentScholarship);
        return studentScholarship;
    }

    //list all records
    public List<StudentScholarship> findAll () {
        return studentScholarshipRepository.findAll();
    }

    //delete record by Id
    public void deleteStudentScholarshipById(Long id) {
        studentScholarshipRepository.deleteById(id);
    }

    //find record by Id
    public StudentScholarship findStudentScholarshipById(Long id) {
        return studentScholarshipRepository.findById(id).orElse(null);
    }
}
