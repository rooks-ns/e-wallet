package com.vcriate.vcriateassignment.dtos.responsedtos;

import com.vcriate.vcriateassignment.models.AuditRecord;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateWithdrawResponseDto {
    private AuditRecord auditRecord;
    private String message;
}
