package com.example.demo;


import java.time.Instant;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(name = "Data")
public class Dto {
  @Schema(type = "string", description = "Date in ISO 8601 format UTC")
  private Instant eventDate;
  @Schema(type = "string", description = "another description")
  private String QcFlagCode;
  private Double value;
  private Double uncertainty;
  private String timeSeriesId;
  private Boolean reviewed;

}
