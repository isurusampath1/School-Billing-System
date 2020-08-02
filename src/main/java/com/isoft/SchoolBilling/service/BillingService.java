package com.isoft.SchoolBilling.service;

import com.isoft.SchoolBilling.dto.BillingDTO;
import com.isoft.SchoolBilling.dto.StudentDTO;
import com.isoft.SchoolBilling.mapper.BaseMapper;
import com.isoft.SchoolBilling.model.Student;
import com.isoft.SchoolBilling.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillingService {

    private final StudentRepository studentRepository;
    private final BaseMapper<BillingDTO, Student> baseMapper;

    public BillingService(final StudentRepository studentRepository,
                          final BaseMapper<BillingDTO, Student> baseMapper) {
        this.studentRepository = studentRepository;
        this.baseMapper = baseMapper;
    }

    public List<BillingDTO> getBillingList () {
        return baseMapper.mapToDTOList(studentRepository.findAll());
    }
}
