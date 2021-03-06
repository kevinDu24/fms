package cn.com.leadu.fms.schedule.rpc.postbiz;

import cn.com.leadu.fms.extend.response.RestResponse;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("${fms.feigns.serverNames.fmsPostBiz}")

public interface AnnualInspectionRpc {
    /**
     * @Title:
     * @Description: 自动插入要年检的车辆
     * @param
     * @return
     * @throws
     * @author ningyangyang
     * @date 2018-5-9 11:52:38
     */
    @RequestMapping(value = "annual_inspection/findInfomationFromContract" ,method = RequestMethod.GET)
    ResponseEntity<RestResponse> findInfomationFromContract();
}
