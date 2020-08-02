package com.isoft.SchoolBilling.mapper;

import com.isoft.SchoolBilling.dto.BillingDTO;
import com.isoft.SchoolBilling.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BillingMapper implements BaseMapper<BillingDTO, Student> {
    @Override
    public Student mapToModel(BillingDTO dto) {
        return null;
    }

    @Override
    public BillingDTO mapToDTO(Student model) {
        BillingDTO billingDTO = new BillingDTO();
        billingDTO.setAdmissionNumber(model.getAdmissionNumber());
        billingDTO.setFullName(model.getFullName());

        if (model.getClassRoom() != null) {
            billingDTO.setClassName(model.getClassRoom().getClassName());
            billingDTO.setTermFee(model.getClassRoom().getTermFee());
            billingDTO.setSecurityFee(model.getClassRoom().getSecurityFee());
        }

        return billingDTO;
    }

    @Override
    public List<BillingDTO> mapToDTOList(List<Student> modelList) {
        List<BillingDTO> dtoList = new ArrayList<>();
        modelList.forEach(model -> dtoList.add(mapToDTO(model)));

        return dtoList;
    }
}
