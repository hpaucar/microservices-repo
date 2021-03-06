package com.lasdpc.spb2taximodel.dto.response;

import com.lasdpc.spb2taximodel.enums.TaxiStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaxiStatusDTO {
    private String taxiId;

    private TaxiStatus status;
}
