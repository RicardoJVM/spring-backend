package com.sales.market.model;

import com.sales.market.dto.BuyDto;
import com.sales.market.dto.DtoBase;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "compra")
public class Buy extends  ModelBase<BuyDto> {

    @Column(precision = 10, scale = 5)
    private BigDecimal value;

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
