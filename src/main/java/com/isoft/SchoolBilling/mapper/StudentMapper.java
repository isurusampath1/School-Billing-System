package com.isoft.SchoolBilling.mapper;

import com.isoft.SchoolBilling.dto.StudentDTO;
import com.isoft.SchoolBilling.model.Student;
import com.isoft.SchoolBilling.service.ClassService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentMapper implements BaseMapper<StudentDTO, com.isoft.SchoolBilling.model.Student> {

    private final ClassService classService;

    public StudentMapper(final ClassService classService) {
        this.classService = classService;
    }

    @Override
    public Student mapToModel(StudentDTO dto) {
        Student model = new Student();
        model.setAdmissionNumber(dto.getAdmissionNumber());
        model.setFirstName(dto.getFirstName());
        model.setLastName(dto.getLastName());
        model.setFullName(dto.getFullName());
        model.setGender(dto.getGender());
        model.setAddress(dto.getAddress());
        model.setGuardianName(dto.getGuardianName());
        model.setGuardingTP(dto.getGuardingTP());
        model.setClassRoom(classService.findById(dto.getClassRoomId()));

        return model;
    }

    @Override
    public StudentDTO mapToDTO(Student model) {
        StudentDTO dto = new StudentDTO();
        dto.setAdmissionNumber(model.getAdmissionNumber());
        dto.setFirstName(model.getFirstName());
        dto.setLastName(model.getLastName());
        dto.setFullName(model.getFullName());
        dto.setGender(model.getGender());
        dto.setAddress(model.getAddress());
        dto.setGuardianName(model.getGuardianName());
        dto.setGuardingTP(model.getGuardingTP());

        if (model.getClassRoom() != null) {
            dto.setClassRoomId(model.getClassRoom().getId());
            dto.setClassName(model.getClassRoom().getClassName());
        }

        return dto;
    }

    @Override
    public List<StudentDTO> mapToDTOList(List<Student> modelList) {
        List<StudentDTO> dtoList = new ArrayList<>();
        modelList.forEach(model -> dtoList.add(mapToDTO(model)));

        return dtoList;
    }
}
