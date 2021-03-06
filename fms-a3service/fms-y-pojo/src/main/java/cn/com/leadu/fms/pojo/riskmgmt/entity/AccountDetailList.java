package cn.com.leadu.fms.pojo.riskmgmt.entity;

import cn.com.leadu.fms.common.entity.BaseEntity;
import cn.com.leadu.fms.common.tkmapper.IdGenerator;
import lombok.Data;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.math.BigDecimal;

/**
 * @author liujinge
 * @ClassName: AccountDetailList
 * @Description: 银行流水明细实体
 * @date 2018-06-04
 */
@Data
public class AccountDetailList extends BaseEntity<AccountDetailList> {

	private static final long serialVersionUID = 1L;

	/**
	 * @Fields  : 银行流水明细id
	 * @author liujinge
	 */
	@Id   
	@GeneratedValue(strategy = GenerationType.IDENTITY,generator = IdGenerator.ID_GENERATOR)
	private String accountDetailListId;

	/**
	 * @Fields  : 银行流水id
	 * @author liujinge
	 */
	private String accountDetailId;

	/**
	 * @Fields  : 年月
	 * @author liujinge
	 */
	private String yearMon;

	/**
	 * @Fields  : 流入量
	 * @author liujinge
	 */
	private BigDecimal income;

	/**
	 * @Fields  : 倒账金额
	 * @author liujinge
	 */
	private BigDecimal receipt;

	/**
	 * @Fields  : 实际流入量
	 * @author liujinge
	 */
	private BigDecimal actualIncome;

}