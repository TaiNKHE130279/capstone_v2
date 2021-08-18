package com.cmms.demo.dto;

import com.cmms.demo.domain.MachineType;

public class MachineTypeDTO {
    private Long type_id;
    private String type_name;

    public static MachineTypeDTO from(MachineType type){
        MachineTypeDTO dto = new MachineTypeDTO();
        dto.setType_id(type.getType_id());
        dto.setType_name(type.getType_name());
        return dto;
    }

    public Long getType_id() {
        return type_id;
    }

    public void setType_id(Long type_id) {
        this.type_id = type_id;
    }

    public String getType_name() {
        return type_name;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name;
    }
}
