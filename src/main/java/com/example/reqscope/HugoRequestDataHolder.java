package com.example.reqscope;

import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Data
@Component
@RequestScope
public class HugoRequestDataHolder {
    private HugoData hugoData;
}
