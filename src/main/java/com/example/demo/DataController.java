package com.example.demo;

import java.util.Collection;
import java.util.Collections;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;


@RestController
@RequestMapping("/api")
@Tag(name = "data", description = "Endpoint to retrieve data")
public class DataController {


  public DataController() {
  }

  @GetMapping("/data")
  @Operation(summary = "Find data")
  Collection<Dto> getData() {
    Dto dto = new Dto();
    return Collections.singletonList(dto);
  }
}
