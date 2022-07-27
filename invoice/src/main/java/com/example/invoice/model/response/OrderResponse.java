package com.example.invoice.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderResponse {

    @JsonProperty("number")
    private String number;

    @JsonProperty("customer")
    private Long customer;

    @JsonProperty("date")
    @DateTimeFormat(pattern = "yyyy-M-d")
    private LocalDate date;

    @JsonProperty("status")
    private Long status;

    @JsonProperty("listProducts")
    private List<ProductResponse> listProducts;

    @JsonProperty("category")
    private Long idCategory;

    @JsonProperty("total")
    private Double total;


}
