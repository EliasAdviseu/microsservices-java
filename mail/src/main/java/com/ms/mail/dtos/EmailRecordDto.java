package com.ms.mail.dtos;

import java.util.UUID;

public record EmailRecordDto(UUID id, String to, String subject, String text) {
    
}
