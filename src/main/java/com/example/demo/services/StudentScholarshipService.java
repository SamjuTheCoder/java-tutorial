package com.example.demo.services;

import com.example.demo.model.StudentScholarship;
import com.example.demo.projections.StudentScholarshipProjection;
import com.example.demo.request.StudentScholarshipRequest;
import com.example.demo.repository.StudentScholarshipRepository;
import com.example.demo.request.StudentScholarshipUpdateRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentScholarshipService {

    //student scholarship repository interface
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

    //delete record by id
    public void deleteStudentScholarshipById(Long id) {
        studentScholarshipRepository.deleteById(id);
    }

    //find record by id
    public StudentScholarship findStudentScholarshipById(Long id) {
        return studentScholarshipRepository.findById(id).orElse(null);
    }

    //update Student Scholarship record
    public StudentScholarship updateStudentScholarship(StudentScholarshipUpdateRequest studentScholarshipUpdateRequest) {

        //find the user that you want to update record for by id of the user - StudentScholarshipModel
        StudentScholarship  studentScholarship = studentScholarshipRepository.findById(studentScholarshipUpdateRequest.getId()).orElse(null);

        //use the data of the user to upload the record coming from the payload - StudentScholarshipUpdateRequest
        //and save any changes made in the StudentScholarshipUpdateRequest
        studentScholarship.setFirstName(studentScholarshipUpdateRequest.getFirstName());
        studentScholarship.setLastName(studentScholarshipUpdateRequest.getLastName());
        studentScholarship.setGender(studentScholarshipUpdateRequest.getGender());
        studentScholarship.setDateOfBirth(studentScholarshipUpdateRequest.getDateOfBirth());
        studentScholarship.setEmail(studentScholarshipUpdateRequest.getEmail());
        studentScholarship.setPhoneNumber(studentScholarshipUpdateRequest.getPhoneNumber());
        studentScholarship.setNationality(studentScholarshipUpdateRequest.getNationality());
        studentScholarship.setState(studentScholarshipUpdateRequest.getState());
        studentScholarship.setAddress(studentScholarshipUpdateRequest.getAddress());
        studentScholarship.setSchoolName(studentScholarshipUpdateRequest.getSchoolName());
        studentScholarship.setDepartment(studentScholarshipUpdateRequest.getDepartment());
        studentScholarship.setCourse(studentScholarshipUpdateRequest.getCourse());
        studentScholarship.setStudentId(studentScholarshipUpdateRequest.getStudentId());
        studentScholarship.setCGPA(studentScholarshipUpdateRequest.getCGPA());
        studentScholarship.setScholarshipType(studentScholarshipUpdateRequest.getScholarshipType());
        studentScholarship.setReason(studentScholarshipUpdateRequest.getReason());
        studentScholarship.setPassport(studentScholarshipUpdateRequest.getPassport());
        studentScholarship.setAdmissionLetter(studentScholarshipUpdateRequest.getAdmissionLetter());
        studentScholarship.setSchoolIdCard(studentScholarshipUpdateRequest.getSchoolIdCard());
        studentScholarship.setStatus(studentScholarshipUpdateRequest.getStatus());
        studentScholarship.setCreatedDate(studentScholarshipUpdateRequest.getCreatedDate());
        return studentScholarshipRepository.save(studentScholarship);

    }

    //retrieve the projected field: firstName, lastName, email, phoneNumber
    public List<StudentScholarshipProjection> findStudentScholarshipProjection() {
        return studentScholarshipRepository.findAllStudentScholarshipProjection();

    }
}


