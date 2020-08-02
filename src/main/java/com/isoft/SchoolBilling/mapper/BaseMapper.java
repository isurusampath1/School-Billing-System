package com.isoft.SchoolBilling.mapper;

import java.util.List;

public interface BaseMapper<D, M> {
    M mapToModel(D dto);

    D mapToDTO(M model);

    List<D> mapToDTOList(List<M> modelList);
}
