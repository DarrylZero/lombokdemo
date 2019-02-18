package com.steammachine.lombok.demo.withlombok;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode( of = "field1")
public class DataWithDemo {
    private String field1;
    private String field2;
}
