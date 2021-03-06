package com.lasdpc.spb2taximodel.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaxiLocationUpdatedEventResponseDTO {

    private String taxiId;

}
