package com.misstilo.cloth_erp_api.model.product.product;

import java.util.List;

import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductQuery {
  @Pattern(regexp = "^$|^[0-9a-zA-Z]+$", message = "代號僅可為英文字母與數字")
  @Size(max = 10, message = "代號不可超過10字")
  private String code;
  @Size(max = 20, message = "名稱不可超過20字")
  private String name;
  private List<Integer> tagIds;
  private Boolean isActive;
  @Size(max = 255, message = "備註不可超過255個字")
  private String remark;
  private String createAtS;
  private String createAtE;
  private String updateAtS;
  private String updateAtE;
}
