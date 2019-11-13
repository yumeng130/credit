package com.lm.credit.controller.v1;

import com.lm.credit.dto.req.v1.V1IdCheckReqDTO;
import com.lm.credit.dto.resp.v1.V1IdCheckResqDTO;
import com.lm.credit.util.BaseResponse;
import com.lm.credit.util.ResponseUtils;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;


@Log4j2
@RestController
@RequestMapping("/v1/check")
public class IdCheckController {

    @PostMapping("/idcheck")
    public BaseResponse idCheck(HttpServletRequest request, @RequestBody V1IdCheckReqDTO reqDTO) {
        String reqNo = request.getAttribute("seqNo").toString();
        V1IdCheckResqDTO resqDTO = new V1IdCheckResqDTO();
        resqDTO.setState("1");
        log.info("身份认证成功", resqDTO);
        return ResponseUtils.success(resqDTO, reqNo);
    }
}