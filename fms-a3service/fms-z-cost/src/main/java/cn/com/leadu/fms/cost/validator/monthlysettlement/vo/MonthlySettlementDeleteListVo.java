package cn.com.leadu.fms.cost.validator.monthlysettlement.vo;

import cn.com.leadu.fms.common.vo.BaseVo;
import cn.com.leadu.fms.pojo.cost.entity.MonthlySettlement;
import lombok.Data;
import javax.validation.constraints.Size;
import cn.com.leadu.fms.common.constant.ValidatorConstants;
import java.util.List;

/**
 * @author yangyiquan
 * @ClassName: MonthlySettlementVo
 * @Description: gps月结任务表删除时载体及验证
 * @date 2018-05-28
 */
@Data
public class MonthlySettlementDeleteListVo extends BaseVo<MonthlySettlement> {

    private static final long serialVersionUID = 1L;

    /**
     * @Fields  : gps月结任务id
     * @author yangyiquan
     */
    @Size(min = 1,message = ValidatorConstants.DELETE_MESSAGE)
    private List<String> monthlySettlementIds;

}