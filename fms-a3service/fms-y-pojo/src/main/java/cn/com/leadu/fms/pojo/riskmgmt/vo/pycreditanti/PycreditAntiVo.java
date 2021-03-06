package cn.com.leadu.fms.pojo.riskmgmt.vo.pycreditanti;

import cn.com.leadu.fms.common.vo.PageQuery;
import cn.com.leadu.fms.pojo.riskmgmt.entity.PycreditAnti;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author liujinge
 * @ClassName: PycreditAntiVo
 * @Description: 反欺诈分析载体
 * @date 2018-06-04
 */
@Data
public class PycreditAntiVo extends PageQuery<PycreditAnti> {

	private static final long serialVersionUID = 1L;

	/**
	 * @Fields  : 反欺诈分析id
	 * @author liujinge
	 */
	private String pycreditAntiId;

	/**
	 * @Fields  : 被查询者姓名
	 * @author liujinge
	 */
	private String name;

	/**
	 * @Fields  : 被查询者证件号码
	 * @author liujinge
	 */
	private String documentNo;

	/**
	 * @Fields  : 被查询者手机号码
	 * @author liujinge
	 */
	private String phone;

	/**
	 * @Fields  : 查询日期
	 * @author liujinge
	 */
	private Date queryDate;

	/**
	 * @Fields  : 接口请求xml
	 * @author liujinge
	 */
	private String conditionsXml;

	/**
	 * @Fields  : 接口返回xml
	 * @author liujinge
	 */
	private String cisReportsXml;

	/**
	 * @Fields  : 反欺诈分析id
	 * @author liujinge
	 */
	private List<String> pycreditAntiIds;
	/**
	 * @Fields  : 身份认证结果
	 * @author yanggang
	 */
	private String result;
	/**
	 * @Fields  : 姓名核查结果
	 * @author yanggang
	 */
	private String nameCheckResult;

	/**
	 * @Fields  : 证件号码核查结果
	 * @author yanggang
	 */
	private String documentNoCheckResult;

	/**
	 * @Fields  : 手机号码核查结果
	 * @author yanggang
	 */
	private String phoneCheckResult;

	/**
	 * @Fields  : 运营商名称
	 * @author yanggang
	 */
	private String operator;

	/**
	 * @Fields  : 手机号码归属地
	 * @author yanggang
	 */
	private String areaInfo;

	/**
	 * @Fields  : 手机状态
	 * @author yanggang
	 */
	private String phoneStatus;

	/**
	 * @Fields  : 手机号码在网时长
	 * @author yanggang
	 */
	private String timeLength;

	/**
	 * @Fields  : 反欺诈综述信息
	 * @author yanggang
	 */
	private String personAntiSpoofingDesc;
	/**
	 * @Fields  : 风险评分、风险等级、风险建议
	 * @author yanggang
	 */
	private String antiResult;
	/**
	 * @Fields  : 核查状态
	 * @author yanggang
	 */
	private String treatResult;
}