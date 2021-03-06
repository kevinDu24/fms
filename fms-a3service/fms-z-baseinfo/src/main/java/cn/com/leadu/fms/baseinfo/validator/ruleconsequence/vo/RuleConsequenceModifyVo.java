package cn.com.leadu.fms.baseinfo.validator.ruleconsequence.vo;

import cn.com.leadu.fms.common.vo.BaseVo;
import cn.com.leadu.fms.pojo.baseinfo.entity.RuleConsequence;
import lombok.Data;
import cn.com.leadu.fms.common.constant.ValidatorConstants;
import org.hibernate.validator.constraints.NotBlank;
import java.util.Date;

/**
 * @author qiaomengnan
 * @ClassName: RuleConsequenceVo
 * @Description: 规则引擎结果修改时载体及验证
 * @date 2018-05-17
 */
@Data
public class RuleConsequenceModifyVo extends BaseVo<RuleConsequence> {

	private static final long serialVersionUID = 1L;

	/**
	 * @Fields  : 规则结果ID
	 * @author qiaomengnan
	 */
	@NotBlank(message = ValidatorConstants.ID_NOT_NULL)
	private String ruleConseqId;

	/**
	 * @Fields  : 规则ID
	 * @author qiaomengnan
	 */
	private String ruleId;

	/**
	 * @Fields  : 规则序号
	 * @author qiaomengnan
	 */
	private Integer ruleNo;

	/**
	 * @Fields  : 优先级
	 * @author qiaomengnan
	 */
	private Integer priority;

	/**
	 * @Fields  : 结果项目key
	 * @author qiaomengnan
	 */
	private String conseqItemKey;

	/**
	 * @Fields  : 结果匹配逻辑
	 * @author qiaomengnan
	 */
	private String conseqLogicType;

	/**
	 * @Fields  : 结果项目值1
	 * @author qiaomengnan
	 */
	private String conseqLogicValue1;

	/**
	 * @Fields  : 结果项目值2
	 * @author qiaomengnan
	 */
	private String conseqLogicValue2;

	/**
	 * @Fields  : 结果排序
	 * @author qiaomengnan
	 */
	private Integer orderNo;

}