package com.misstilo.cloth_erp_api.model.product.productSku;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductSkuQuery {
    @NotNull(message = "Query: Id is required.")
    private Integer id;
}
