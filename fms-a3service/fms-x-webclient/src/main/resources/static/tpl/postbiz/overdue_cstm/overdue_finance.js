/**
 * Created by lijunjun on 2018-05-16.
 */
app.controller('overdue_finance_controller', ['$scope', '$http','$modal', '$modalInstance','toaster','paramsData', function ($scope, $http,$modal, $modalInstance,toaster,paramsData) {
    //参数配置
    $scope.dataTableProperties= {
        //ajax url 和类型
        dataTableAjax : {
            url : "overdue_cstm/findContOverdueVoByContNo",
            type:"GET"
        },
        //table的html id
        dataTableId:'overdue_finance',
        //table的列
        /*合同编号
        每期序号
        收款日期
        扣款状态
        每期客户租金
        当期本金
        当期利息
        手续费用
        当期剩余本金
        保证金
        每期客户实际租金*/

        dataTableColumn: [
            {title:'合同编号',data:'contNo',width:'20%'},
            {title:'每期序号',data:'period',width:'20%'},
            {title:'收款日期',data:'repayDate',width:'20%'},
            {title:'扣款状态',data:'repayStatus',width:'20%',
                render: function (data, type, row, meta) {
                    return CommonCodeUtils.getCodeValueName(CommonCodeUtils.codeTypes.repayStatus,data);
                }
            },
            {title:'每期客户租金',data:'rent',width:'20%'},
            {title:'当期本金',data:'principal',width:'20%'},
            {title:'当期利息',data:'interest',width:'20%'},
            {title:'当期剩余本金',data:'restPrincipal',width:'20%'},
            {title:'主营收入',data:'revenue',width:'20%'},
            {title:'税金',data:'tax',width:'20%'}

        ],
        //列是单选还是多选 CheckBox多选 Radio单选
        dataTableSelectType: CheckBox,

    };
    //请求的参数
    function dataTableParams($scope){
        params = {};
        if(paramsData.overdueCstmId){
            params.overdueCstmId = paramsData.overdueCstmId;
            params.contNo = paramsData.contNo;
        }else{
            params.contNo = paramsData.contNo;
        }
        return params;
    }
    $scope.loadReady = function () {
        $scope.dataTable = createTable($scope.dataTableProperties,dataTableParams,$scope);
    };

    /**
     * 关闭窗口
     * @param status
     */
    $scope.close = function(){
        $modalInstance.close();
    };

}]);


