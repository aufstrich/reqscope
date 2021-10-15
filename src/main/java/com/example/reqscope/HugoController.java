package com.example.reqscope;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HugoController {

    private final HugoRequestDataHolder hugoRequestDataHolder;


    /***
     * should return HugoData object filled with the name header
     * @return
     */
    @GetMapping("/hugo")
    HugoData getHugo() {
        return hugoRequestDataHolder.getHugoData();
    }

    /***
     * should return empty result as the interceptor is not regirstered for this path
     * @return
     */
    @GetMapping("/other")
    HugoData getOtherHugo() {
        return hugoRequestDataHolder.getHugoData();
    }

}
