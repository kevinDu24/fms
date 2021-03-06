package cn.com.leadu.fms.business.common.constant.enums.activiti;

/**
 * @author qiaomengnan
 * @ClassName: ActPilferMonthlyEnums
 * @Description: 盗抢险月结属性标识
 * @date 2018/6/5
 */
public enum ActPilferMonthlyEnums {

    APPLY_USER("applyUser","申请人标识"),
    REVIEW_USER("reviewUser","复核人标识"),
    VOUCHER_USER("voucherUser","制单人标识"),
    SETTLEMENT_USER("settlementUser","付款人标识"),
    NEXT_USER("nextUser","保存list集合用户"),

    APPLY_STATUS("applyStatus","申请状态标识"),
    REVIEW_STATUS("reviewStatus","复核状态标识"),
    VOUCHER_STATUS("voucherStatus","制单状态标识"),
    SETTLEMENT_STATUS("settlementStatus","付款状态标识"),


    PILFER_MONTHLY_APPLY("pilfer_monthly_apply","提交申请任务key"),
    PILFER_MONTHLY_REVIEW("pilfer_monthly_review","复核任务key"),
    PILFER_MONTHLY_VOUCHER("pilfer_monthly_voucher","制单任务key"),
    PILFER_MONTHLY_SETTLEMENT("pilfer_monthly_settlement","付款任务key"),


    REVIEW_USER_UNIT("reviewUserUnit","复核单位标识"),
    REVIEW_USER_ID("reviewUserId","复核单位id标识"),
    VOUCHER_USER_UNIT("voucherUserUnit","制单用户单位标识"),
    VOUCHER_USER_ID("voucherUserId","制单用户单位id标识"),
    SETTLEMENT_USER_UNIT("settlementUserUnit","付款用户单位标识"),
    SETTLEMENT_USER_ID("settlementUserId","付款用户单位id标识");

    private String flag;

    private String desc;

    ActPilferMonthlyEnums(String flag,String desc){
        this.flag = flag;
        this.desc = desc;
    }

    public String getFlag(){
        return this.flag;
    }

    public String getDesc(){
        return this.desc;
    }
}
